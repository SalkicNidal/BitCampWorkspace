package ba.bitcamp.exercise;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

import ba.bitcamp.exercise.Task1.Consumer;

public class Task3 {

	static LinkedBlockingQueue<Task> queue;
	static ArrayList<Consumer> list;
	static int fileCount = 0;
	static int folderCount = 0;
	static Object lock = new Object();

	public static void main(String[] args) {

		queue = new LinkedBlockingQueue<Task3.Task>();
		list = new ArrayList<Task1.Consumer>();

		Task t = new Task(new File("/"));
		queue.add(t);
		
for ( int i = 1; i <=10; i++){
		Worker w = new Worker();
		w.start();
}
	}

	public static class Task implements Runnable {

		private File root;

		public Task(File root) {
			super();
			this.root = root;
		}

		@Override
		public void run() {
			if (root == null) {
				return;
			} else if (root.listFiles() == null) {
				return;
			}
			for (File f : root.listFiles()) {

				if (f.isFile()) {

					synchronized (lock) {
						fileCount++;
					}

				} else if (f.isDirectory()) {

					synchronized (lock) {
						folderCount++;
					}

					queue.add(new Task(f));
				}

			}
			System.out.println(root.getAbsolutePath() + "  >>>>>>>Folder: "
					+ folderCount + " >>>>>>File: " + fileCount);
			System.out.println("Folder >> " + folderCount + " File>>> "
					+ fileCount);

		}

	}

	public static class Worker extends Thread {

		@Override
		public void run() {

			while (!queue.isEmpty()) {

				try {
					Task job = queue.take();
					job.run();
				} catch (InterruptedException e) {
					break;

				}
			}

		}
	}

}
