package ba.bitcamp.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		try {
			System.out.println("[Client] Aplication started");
			Socket socket = new Socket("localhost", 1111);
			System.out.println("[Client] Connected to localhost");

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			System.out.println("I/O Operating availble now");
			System.out.println("Server: " + reader.readLine());
			
			writer.write("Dobro je ti, sta ima kod tebe, pita li ko za mene ");
			writer.newLine();
			writer.flush();
			
			
			Scanner input = new Scanner(System.in);
		System.out.println("Server: " +  reader.readLine());
		writer.write(input.nextLine());
		writer.flush();
			

			System.out.println("END");
			boolean end = false;
			while (! end) {
				
				System.out.println("Server: " + reader.readLine());
				System.out.println("Msg: ");
				
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();
				
			}
			input.close();
			writer.close();
			
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
