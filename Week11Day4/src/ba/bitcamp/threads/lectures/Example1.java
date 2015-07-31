package ba.bitcamp.threads.lectures;

public class Example1 implements Runnable {

	public static void main(String[] args) {

		Example1 test = new Example1();
		Thread t = new Thread(test);
		t.start();

		for (int i = 0; i < 50; i++) {

			System.out.println("Main");
		}

	}

	@Override
	public void run() {
		System.out.println("Going to sleep");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < 50; i++) {

			System.out.println("Threads");

		}
		System.out.println("Wake up");
	}

}
