package ba.bitcamp.URL.exercise.examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class RingSenderServer {

	public static void main(String[] args) {
		String s = "";

		try {
			ServerSocket server = new ServerSocket(1946);
			Socket fromDinko;
			fromDinko = server.accept();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					fromDinko.getInputStream()));

			s += reader.readLine();
			System.out.println(s);

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Socket socket;
		try {
			socket = new Socket("10.0.82.16", 2468);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			writer.write(s);
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
