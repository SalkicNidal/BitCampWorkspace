package ba.bitcamp.exercise;

import java.util.concurrent.LinkedBlockingQueue;

public class Task2 {

	static int[][] array;
	static int count;
	static LinkedBlockingQueue<Task> tasks;

	public static void main(String[] args) {

		array = new int[10_000][10_000];

		for (int i = 0; i < array.length; i++) {
			for  ( int j = 0; j < array.length; j++){
			
			
			array[i][j] = (int) (Math.random() * 100 + 1);
			}

		}

		long start = System.currentTimeMillis();
		int test = 0;
		
		for (int i = 0; i < array.length; i++) {
			for  ( int j = 0; j < array.length; j++){
				
			if (test ==array[i][j])
				count++;
			}
		}
		
		System.out.println("Count: " + count );
		System.out.println("Time:" + (System.currentTimeMillis() - start) + "ms");
		
		
		

	}
	
	public static class Worker extends Thread{
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
		}
	}
	
public static class Task implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
}

}
