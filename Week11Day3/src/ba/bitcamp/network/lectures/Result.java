package ba.bitcamp.network.lectures;

import java.io.BufferedWriter;
import java.io.IOException;

public class Result {

	public static void OK(BufferedWriter bw, String htmlContent)
			throws IOException {

		response(bw, "200 OK", htmlContent);
	}

	public static void notFound(BufferedWriter bw) throws IOException {

		response(bw, "404 Not Found", "This is not the page you are looking");

	}

	public static void serverError(BufferedWriter bw) throws IOException {

		response(bw, "500 Internal Server Error", "Little bugs in the code");


	}

	private static void response(BufferedWriter bw, String responseCode,
			String responseContent) throws IOException {

		bw.write(String.format("HTTP/1.1 %s \n", responseCode));
		bw.write("content-type: text/html\n");
		bw.newLine();
		bw.write(responseContent);
		bw.flush();
	}
}
 