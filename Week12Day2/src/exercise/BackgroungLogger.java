package exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class BackgroungLogger {

	static Socket client;
	static String line = "";

	public static void main(String[] args) {

		System.out.println("Server is made, waiting for client...");
		@SuppressWarnings("resource")
		ServerSocket server;
		try {
			server = new ServerSocket(1234);
			client = server.accept();
			System.out.println("Client is connected!!!");
			
			MyThread t = new MyThread();
			t.start();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static String getInformation(String line, String sent) {

		String info = "";
		switch (line) {

		case "1":
			try {
				double temp = Double.parseDouble(sent);
				info = "[Temperture] " + temp;
			} catch (Exception e) {

				info = "Wrong input";
			}
			break;

		case "2":
			try {
				int temp = Integer.parseInt(sent);
				info = "[Pressure] " + temp;
			} catch (Exception e) {

				info = "Wrong input";
			}
			break;

		case "3":
			if (sent.equals("false") || sent.equals("false")) {

				info = "[Movement]" + sent;
			} else {
				info = "Wrong input";
			}
			break;
		case "4":

			info = "[Error]" + sent;
			break;

		default:

			info = "[COMMON.ERROR] " + line;

		}

		return info;

	}

	private static class MyThread extends Thread {

		@Override
		public void run() {
			try {
				while (true) {
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(client.getInputStream()));

					line = reader.readLine();
					String command = line.substring(0, line.indexOf(" "));
					String input = line.substring(line.indexOf(" ") + 1,
							line.length());

					System.out.println(line);
					File file = new File("info.txt");
					if (!file.exists()) {
						file.createNewFile();
					}

					@SuppressWarnings("resource")
					BufferedWriter writer = new BufferedWriter(new FileWriter(
							file, true));

					writer.write(getInformation(command, input));
					writer.newLine();
					writer.flush();

				}

			} catch (IOException e) {

				e.printStackTrace();
			} catch (NullPointerException e) {

			}

		}
	}

}
