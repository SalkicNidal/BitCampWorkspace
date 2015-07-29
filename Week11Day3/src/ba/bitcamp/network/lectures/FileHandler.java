package ba.bitcamp.network.lectures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

	private static final String PATH_TO_PUBLIC = "./public";

	public static String getContent(String route) throws IOException, FileNotFoundException {

		String fullPath = routeBuilder(route);

		BufferedReader br = new BufferedReader(new FileReader(fullPath));
		StringBuilder sb = new StringBuilder();
		
		while (br.ready()) {
			sb.append(br.readLine());
		}
		return sb.toString();
	}

	private static String routeBuilder(String route) {
		if (route.equals("/")) {

			route = "/index.html";
		}

		return PATH_TO_PUBLIC + route;
	}
}
