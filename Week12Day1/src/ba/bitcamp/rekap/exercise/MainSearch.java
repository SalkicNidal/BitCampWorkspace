package ba.bitcamp.rekap.exercise;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainSearch {

	public static void main(String[] args) {
		
		
		System.out.println("Enter search");
		Scanner in = new Scanner(System.in);
		String searchString = in.nextLine();
		
		Search s = new Search(searchString);
		try {
			s.startSerach();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		in.close();
	
	
	}

}
