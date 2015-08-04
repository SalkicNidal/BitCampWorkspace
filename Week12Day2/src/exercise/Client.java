package exercise;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	static Socket client;

	public static void main(String[] args) {

		try {

			client = new Socket("localhost", 1234);
			while (true) {

				MyThread t = new MyThread();
				t.start();
				t.sleep(10000);

			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static class MyThread extends Thread {

		@Override
		public void run() {
			try {

				BufferedWriter writer = new BufferedWriter(
						new OutputStreamWriter(client.getOutputStream()));

				@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
				System.out.println("Please insert the inputed information ");
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();

				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
