package ServerGame;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {


	public static BufferedWriter writer;

	public static void main(String[] args) {

		try {
			
			Socket socket = new Socket("localhost", 8000);
			writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			new GuiClient(socket);

		} catch (UnknownHostException g) {

			g.printStackTrace();
		} catch (IOException g1) {

			g1.printStackTrace();
		}
	}

	public static void write(String s) {

		try {

			
			writer.write(s);
			writer.newLine();
			writer.flush();
			System.out.println(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
