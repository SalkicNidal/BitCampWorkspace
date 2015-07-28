package ba.bitcamp.URL.exercise.examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest {

	public static void main(String[] args) {

		Socket socket = new Socket();

		try {

			socket.connect(new InetSocketAddress("10.0.82.16", 7777));

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));

			InputStream socketReader = socket.getInputStream();
			
			byte[] data = new byte[1024];
			int bytesRead;
			File file = new File("output1.jpg");
			FileOutputStream fileWrite = new FileOutputStream(file);
			while ((bytesRead = socketReader.read(data, 0, data.length)) > 0) {

				fileWrite.write(data, 0, bytesRead);
			}

			reader.readLine();
			writer.write("Hello server ");
			writer.newLine();
			writer.flush();
			Scanner input = new Scanner(System.in);
			boolean end = false;

			while (!end) {

				System.out.println("Server: " + reader.readLine());
				System.out.println("Msg: ");

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

	}

}
