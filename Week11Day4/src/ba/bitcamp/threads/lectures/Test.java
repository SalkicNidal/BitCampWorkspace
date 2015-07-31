package ba.bitcamp.threads.lectures;

import java.util.Date;

public class Test {


		public static void main(String[] args) {
			
			Date start = new Date();
			
			PrimeCounter[] counters = new PrimeCounter[8];
			int startInterval = 1, endInterval = 1000000;
			int step = endInterval/ counters.length;
			
			for (int i = 0; i < counters.length; i++) {
				counters[i] = new PrimeCounter(i*step, (i+1)*step);
				counters[i].start();
			}
			 
			for (int i = 0; i < counters.length; i++) {
				try {
					counters[i].join();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			System.out.println("Primes count: " + counters[0].getCount());
			Date end = new Date();
			long timeLapse = (end.getTime() - start.getTime() )/1000;
			System.out.println("Times(s): "+ timeLapse);
			
		}

	

}
