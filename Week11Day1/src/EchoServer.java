import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class EchoServer {

	public static final int ECHO_PORT = 12345;
	public static void main(String[] args) {
		
		
		try {
			ServerSocket server = new ServerSocket(ECHO_PORT);
			
			while ( true){
				
				System.out.println("Waiting for next request...");
				Socket clientSocket = server.accept();
				System.out.println("Request is accepted, waiting for request..");
				InputStream rqStream = clientSocket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(rqStream));
				String request = null;
				while ((  request = br.readLine()) != null)
			    
			    System.out.println("Request acepted: " + br.readLine());
				System.out.println("Writing response");
				OutputStream os = clientSocket.getOutputStream();
				OutputStreamWriter writer = new OutputStreamWriter(os);
				writer.write("OK\n");
				writer.write(request);
				writer.flush();
				System.out.println("Response flushed, cosing connection");
				os.close();
				clientSocket.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
