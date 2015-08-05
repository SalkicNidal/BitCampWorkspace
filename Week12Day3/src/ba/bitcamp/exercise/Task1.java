package ba.bitcamp.exercise;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class Task1 {

	static LinkedBlockingQueue<Producer> t;
	static ArrayList<Consumer> list;
	static Integer count = 0;

	public static void main(String[] args) {

		t = new LinkedBlockingQueue<>();
		list = new ArrayList<Task1.Consumer>();

		int workLoad = 1000;
		int loadTaken = 10;
		while ( loadTaken < 1_000_000){
			
			Producer p = new Producer(loadTaken, loadTaken + workLoad);
			t.add(p);
			
			loadTaken += workLoad;
		}

		for (int i = 0; i < 5; i++) {
			Consumer p = new Consumer();
			p.start();
			list.add(p);
		}

		long start = System.currentTimeMillis() / 1000;
		for (Consumer p : list) {

			try {
				p.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Time:"
				+ ((System.currentTimeMillis() / 1000) - start));
		System.out.println(count);

	}
	
	
	
	

	public static class Consumer extends Thread {

		@Override
		public void run() {

			while (!t.isEmpty()) {
				try {
					Producer job = t.take();
					job.run();
				} catch (InterruptedException e) {
					break;
				}
			}

		}

	}

	public static class Producer implements Runnable {

		int start;
		int end;

		public Producer(int start, int end) {
			super();
			this.start = start;
			this.end = end;
		}

		@Override
		public void run() {

			for (int i = this.start + 1; i < end; i++) {

				if (isPrime(i))

					synchronized (count) {
						count++;
					}

			}

		}

	}

	public static boolean isPrime(int number) {
		for (int i = 2; i < number / 2 + 1; i++) {

			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
