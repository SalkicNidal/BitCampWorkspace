package ba.bitcamp.threads.lectures;


public class PrimeCounter extends Thread {

	private static Object o = new Object();
	private int start;
	private int end;
	private static int count;

	public PrimeCounter(int start, int end) {
		super();
		this.start = start;
		this.end = end;

	}

	public void countPrimes() {
		for (int i = start; i < end; i++) {
			if (isPrime(i)) {
				synchronized (o) {
					count++;
				}
				
			}
		}
	}

	private boolean isPrime(int number) {

		for (int i = 2; i < number / 2; i++)
			if (number % i == 0)
				return false;
		return true;
	}

	public int getCount() {
		return count;
	}

	@Override
	public void run() {

		countPrimes();

	}

}