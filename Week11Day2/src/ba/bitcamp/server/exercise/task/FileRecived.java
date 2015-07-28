package ba.bitcamp.server.exercise.task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.HashMap;

public class FileRecived {

	public static void main(String[] args) {

		Socket socket = new Socket();

		try {

			socket.connect(new InetSocketAddress("10.0.82.98", 7777));

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));

			InputStream socketReader = socket.getInputStream();

			byte[] data = new byte[1024];
			int bytesRead;
			File file = new File("Info.txt");
			FileOutputStream fileWrite = new FileOutputStream(file);
			while ((bytesRead = socketReader.read(data, 0, data.length)) > 0) {

				fileWrite.write(data, 0, bytesRead);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {

			HashMap<String, String> map = new HashMap<String, String>();
			FileReader inputFile = new FileReader("Info.txt");
			BufferedReader bufferReader = new BufferedReader(inputFile);
			String line;

			while ((line = bufferReader.readLine()) != null) {
				map.put(line.substring(0, line.indexOf(" ")),
						line.substring(line.indexOf(" "), line.length()));

			}
			System.out.println(map);
			System.out.println(getRandomIP(map));
			bufferReader.close();
		} catch (Exception e) {
			System.out.println("Error while reading file line by line:"
					+ e.getMessage());
		}
		
		

	}

	public static String getRandomIP(HashMap<String, String> map) {

		String IP = "10.0.82.";
		while (true) {
			int temp = (int) (Math.random() * 130);
			IP += String.valueOf(temp);
			if (map.containsKey(IP)) {
				return IP;
			}else{
				
				IP = "10.0.82.";
			}

		}
	}

}
