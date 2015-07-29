package ba.bitcamp.network.task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class httpServer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		try {

			ServerSocket server = new ServerSocket(3333);
			System.out.println("Server started.");
			Set<String> ipSet = new TreeSet<>();
			while (true) {
				Socket client = server.accept();
				System.out.println(client.getInetAddress().getHostAddress());

				BufferedReader read = new BufferedReader(new FileReader(
						"info.txt"));

				while (read.ready()) {

					ipSet.add(read.readLine());
					read.readLine();
				}

				BufferedWriter clientWriter = new BufferedWriter(
						new OutputStreamWriter(client.getOutputStream()));
				BufferedReader clientReader = new BufferedReader(
						new InputStreamReader(client.getInputStream()));

				BufferedReader fileReader = null;
				String htmlDoc = "";
				boolean printIps = true;

				String fromClient = clientReader.readLine();
				String[] wantedAddress = fromClient.split(" ");

				String address = "src/example1.html";

				if (wantedAddress[1].equals("/about.html")) {
					address = "src/about.html";
					printIps = false;
				}

				fileReader = new BufferedReader(new FileReader(new File(address)));

				while (fileReader.ready()) {
					htmlDoc += fileReader.readLine();
				}

				Iterator<String> it = ipSet.iterator();
				while (it.hasNext()) {
					htmlDoc += it.next() + "<br>\n";
				}

				htmlDoc += "</p></body></html>";
				clientWriter.write(htmlDoc);
				clientWriter.close();
				client.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
