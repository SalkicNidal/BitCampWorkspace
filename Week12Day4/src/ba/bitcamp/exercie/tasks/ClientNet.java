package ba.bitcamp.exercie.tasks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientNet {

	private static Object lock = new Object();
	private static int primeCounter = 0;

	public static void main(String[] args) {
		while (true) {
			
			try {
				Socket client = new Socket("10.0.82.98", 8000);
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(client.getInputStream()));
				BufferedWriter writer = new BufferedWriter(
						new OutputStreamWriter(client.getOutputStream()));

				String fromServer = "";

				fromServer = reader.readLine();
				String[] line = fromServer.split(" ", 2);

				Integer start = Integer.parseInt(line[0]);
				Integer end = Integer.parseInt(line[1]);

				Thread t = new Thread(new Task(start, end));
				
				t.start();
			

				try {
					t.join();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				writer.write("" + primeCounter);
				System.out.println(primeCounter + "");
				writer.newLine();
				writer.flush();
				
				primeCounter = 0;

			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	static class Task implements Runnable {
		private int start;
		private int end;

		public Task(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public void run() {
			for (int i = start; i < end; i++) {
				if (isPrimeEfficient((i))) {
					synchronized (lock) {
						primeCounter++;
					}
				}
			}
		}
	}

	public static boolean isPrimeEfficient(int num) {
		if (num == 0 || num == 1) {
			return false;
		}

		if (num == 2) {
			return true;
		}

		if (num % 2 == 0) {
			return false;
		}

		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

}
