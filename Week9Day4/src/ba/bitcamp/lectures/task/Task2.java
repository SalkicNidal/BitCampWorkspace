package ba.bitcamp.lectures.task;

import java.util.HashSet;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String line = "";
		HashSet<Character> set = new HashSet<>();
		do {

			System.out.println("Please enter the string");
			line = input.nextLine();

			if (line.equals("end")) {
				break;
			}

			for (int i = 0; i < line.length(); i++) {

				char c = line.charAt(i);
				set.add(c);
			}

		} while (!line.equals("end"));

		System.out.println(set);

	}
}
