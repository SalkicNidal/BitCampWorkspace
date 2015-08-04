package lectures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileSerach {

	public static void main(String[] args) {

		System.out.println("Enter the word for searching");
		Scanner input = new Scanner(System.in);
		
		String line = input.nextLine();
		String searchWord = line.substring(0, line.indexOf(" "));
		String fileName = line.substring(line.indexOf(" ") + 1, line.length());
		
		
		try {
			
			File file = new File(fileName);
			if ( !file.exists())
				System.err.println("File dont exists");
			
			System.out.println(search(searchWord, file));
		} catch (IOException e) {
	
		}

	}

	public static String search(String searchString, File file) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader(file));
		String findString = "";
		int count = 0;
		int temp = 0;
		while (reader.ready()) {

			String line = reader.readLine();
			count++;

			if (isFound(searchString, line)) {

				findString += count + ": >>" + line + "\n";
				temp++;

			}

		}
		
		if ( temp == 0){
			
			return "Word is not find";
		}
		return findString;
		

	}

	public static boolean isFound(String searchString, String line) {

		return (line.contains(searchString));

	}

}
