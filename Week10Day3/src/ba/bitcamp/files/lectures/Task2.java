package ba.bitcamp.files.lectures;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) throws FileNotFoundException {

		String line = System.getProperty("user.home");
		System.out.println(line);
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the file address");
		String address = input.nextLine();

		InputStream is = null;
		PrintWriter pw = new PrintWriter(System.out);
		try {
			is = new FileInputStream(address);

			Reader r = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(r);

			String lines = null;
			try {

				while ((lines = br.readLine()) != null) {

					pw.println(lines);
				}
				pw.flush();

			} catch (IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
