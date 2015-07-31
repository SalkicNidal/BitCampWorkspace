package ServerGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private static BufferedReader reader;
	

	public static void main(String[] args) {

		System.out.println("Aplication is started");
		ServerSocket server;
		try {
			server = new ServerSocket(8000);
			Socket client = server.accept();
			System.out.println("Client found");
			 ServerGui window =new ServerGui();
			
				reader = new BufferedReader(new InputStreamReader(
						client.getInputStream()));
				
					while ( true){
				     String s = reader.readLine();
					 window.move(s);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
				}
		
		
	}

}
