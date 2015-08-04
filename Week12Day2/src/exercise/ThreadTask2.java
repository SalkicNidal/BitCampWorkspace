package exercise;

public class ThreadTask2 extends Thread {

	static Integer count = 0;

	@Override
	public void run() {

		synchronized (count) {

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			for (int i = 0; i < 100; i++) {

				count += 10;
			}

		}

	}

	public static void madeThread() {

		ThreadTask2 t1 = new ThreadTask2();
		ThreadTask2 t2 = new ThreadTask2();

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(count);

	}

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {

			madeThread();
			count = 0;

		}
	}

}
