package ba.bitcamp.network.task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;

public class Server {

	public static void main(String[] args) {

		System.out.println("Aplication is started");
		ServerSocket server;
		try {

			server = new ServerSocket(1111);
			System.out.println("Listening for a client...");
			Socket client = server.accept();
			System.out.println("Client found");
			
			ArrayList<String> listOfFiles = new ArrayList<String>();
			listOfFiles.add("text.txt");
			listOfFiles.add("info.txt");
			listOfFiles.add("example.txt");
			
			BufferedReader listReder = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

			File file = new File("text.txt");

			java.io.OutputStream clientWriter = client.getOutputStream();
			FileInputStream clientReader = new FileInputStream(file);

			byte[] buffer = new byte[1024];
			int readBytes;

			while ((readBytes = clientReader.read(buffer, 0, buffer.length)) > 0) {
				clientWriter.write(buffer, 0, readBytes);
			}
			clientWriter.close();
			client.close();

			File file1 = new File("info.txt");

			if (!file1.exists()) {
				file1.createNewFile();
			}
			FileWriter fw = new FileWriter(file1.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Time:  " + Calendar.getInstance().getTime().toString() + "  IP: " +client.getInetAddress().getHostAddress() + "\n");
			bw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
