package ba.bitcamp.threads.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Task1 {

	public static void main(String[] args) {

		try {

			ServerSocket server = new ServerSocket(3333);

			while (true) {

				Socket client = server.accept();

				Thread t = new Thread(new ClientThread(client));
				t.start();
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static class ClientThread extends Thread {

		private Socket client;

		public ClientThread(Socket client) {

			this.client = client;
		}

		@Override
		public void run() {

			BufferedReader reader;
			try {
				while (true) {
					reader = new BufferedReader(new InputStreamReader(
							client.getInputStream()));
					while (reader.ready()) {

						System.out.println(reader.readLine());

					}
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}

}
