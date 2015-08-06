package ba.bitcamp.exercie.tasks;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
	private static Integer primeCounter = 0;
	private static ArrayList<Worker> list;
	private static Object lock = new Object();

	// 0 - 1.000.000
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			System.out.println("Server started.");
			
			BigInteger big = new BigInteger("8943186814115303114568660480537979564493722038302983441617064677316016500166044431600422600019763087279734325075184543931340226281950481206150316967621011");
			BigInteger workLoad = new BigInteger("2000000");
			BigInteger b = BigIntSqRoot.bigIntSqRootFloor(big);
			BigInteger a = b.subtract(workLoad);
			System.out.println(b);
			list = new ArrayList<>();
			
			while (b.compareTo(big) < 0) {
				Socket client = server.accept();
				System.out.println("Got client!");
				
				String ip = client.getInetAddress().getHostAddress().toString();
				System.out.printf("%s got (%d, %d)\n", ip, a, b);
				
				Worker w = new Worker(client, a, b, big);
				list.add(w);
				
				
				a = a.subtract(workLoad);
				b = b.subtract(workLoad);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static class Worker extends Thread {
		private Socket socket;
		private BigInteger a;
		private BigInteger b;
		private BigInteger big;

		public Worker(Socket socket, BigInteger a, BigInteger b, BigInteger big) {
			this.socket = socket;
			this.a = a;
			this.b = b;
			this.big = big;
			this.start();
		}

		@Override
		public void run() {
			try {
				BufferedWriter writer = new BufferedWriter(
						new OutputStreamWriter(socket.getOutputStream()));

				writer.write(a + " " + b + " " + big);
				writer.newLine();
				writer.flush();

				writer.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}
	}
}