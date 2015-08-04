package ba.bitcamp.recap.exercises;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.codehaus.jackson.map.ObjectMapper;

public class Server {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String s = "";
		Date d = new Date();

		ObjectMapper mapper = new ObjectMapper();
		try {
			System.out.println("Server is made");
			ServerSocket server = new ServerSocket(8000);
			Socket fromOgnjen;
			fromOgnjen = server.accept();
			System.out.println("Gogo is connected");

			InputStream socketReader = fromOgnjen.getInputStream();
			
			byte[] data = new byte[1024];
			int bytesRead;
			File file = new File("output1.json");
			
			FileOutputStream fileWrite = new FileOutputStream(file);
			
			while ((bytesRead = socketReader.read(data, 0, data.length)) > 0) {

				fileWrite.write(data, 0, bytesRead);
				fileWrite.flush();
			}

			@SuppressWarnings("unchecked")
			ArrayList<Message> list = mapper.readValue(
					new File("output1.json"), ArrayList.class);
			String time = "" + Calendar.getInstance().getTime();
			list.add(new Message("Hasib", time + "BBC",
					" Snijeg nije bitan snijeg se istopio"));
			System.out.println(list);
			Socket socket;
			System.out.println("Client is made");
			
			socket = new Socket("10.0.82.16", 8000);
			mapper.writeValue(socket.getOutputStream(), list);
			System.out.println("List is send");
			System.out.println(list);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
