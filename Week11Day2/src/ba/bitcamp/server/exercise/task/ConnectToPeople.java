package ba.bitcamp.server.exercise.task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

public class ConnectToPeople {

	public static void main(String[] args) {

		// Read from file
		HashMap<String, String> map = new HashMap<String, String>();
		String s = "";
		String word = "";

		try {

			FileReader inputFile = new FileReader("Info.txt");
			BufferedReader bufferReader = new BufferedReader(inputFile);
			String line;

			while ((line = bufferReader.readLine()) != null) {
				map.put(line.substring(0, line.indexOf(" ")),
						line.substring(line.indexOf(" "), line.length()));

			}
			bufferReader.close();
		} catch (Exception e) {
			System.out.println("Error while reading file line by line:"
					+ e.getMessage());
		}

		System.out.println(FileRecived.getRandomIP(map));
		// /////////////////////////////////
		// My server
		try {

			ServerSocket server = new ServerSocket(8888);
			System.out.println("Waiting for new client...");
			Socket client;
			client = server.accept();
			System.out.println("Client found");
			String add = client.getInetAddress().getHostAddress();

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			System.out.println(add);
			s = reader.readLine();
			System.out.println(map.get(add) + ": " + s);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Connect to Zaid
		Socket client1 = new Socket();

		try {

			client1.connect(new InetSocketAddress("10.0.82.98", 8888));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					client1.getOutputStream()));
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the text: ");
			 word += input.nextLine();
			writer.write(s + word);
			writer.newLine();
			writer.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Connect to random people
		

		while (true) {
			try {
				
				String address = FileRecived.getRandomIP(map);
				System.out.println(address);
				Socket client2 = new Socket();
				client2.connect(new InetSocketAddress(address, 8888));
				BufferedWriter writer = new BufferedWriter(
						new OutputStreamWriter(client2.getOutputStream()));
				writer.write(s + word);
				writer.newLine();
				writer.flush();
				
				System.out.println("Message is send to " + map.get(client2.getInetAddress().getHostAddress()));
				break;

			} catch (Exception e) {
				System.out.println("Not ready");

			}
		}

	}
}
