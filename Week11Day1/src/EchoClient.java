import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class EchoClient {

	private static final String HOST = "localhost";
	private static final int PORT = EchoServer.ECHO_PORT;

	public static void main(String[] args) {

		try {
			System.out.println("Connecting to" + HOST + ":" + PORT);
			Socket client = new Socket(HOST, PORT);
			System.out.println("Connection established, sending request...");
			
			OutputStream rqStream = client.getOutputStream();
			OutputStreamWriter out = new OutputStreamWriter(rqStream);
			out.write("Hello Server /n");
			out.flush();
		
			System.out.println("Requesr sent waiting for response");

			InputStream in = client.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			System.out.println(br.readLine());
			System.out.println("Finishing program");
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
