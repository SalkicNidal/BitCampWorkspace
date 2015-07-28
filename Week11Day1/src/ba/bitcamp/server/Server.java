package ba.bitcamp.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {

		try {

			System.out.println("Aplication is started");
			ServerSocket server = new ServerSocket(1111);
			System.out.println("Server socket made");

			System.out.println("Listening for a client...");
			Socket client = server.accept();
			System.out.println("Client found");

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
			System.out.println("I/O Operating availble now");
			
			writer.write("Kako si? Sta ima?");
			writer.newLine();
			writer.flush();
			
			System.out.println("Client: " + reader.readLine());
			System.out.println("Msg: ");
			Scanner input = new Scanner(System.in);
			writer.write(input.nextLine());
			writer.newLine();
			writer.flush();
			
			System.out.println("END");
			boolean end = false;
			while (! end) {
				
				System.out.println("Msg: ");
				System.out.println("Client: " + reader.readLine());
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();
				
				
			}
			
			input.close();
			writer.close();
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;

	}

}
