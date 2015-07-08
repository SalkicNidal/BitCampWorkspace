package ba.bitcamp.arraylist.exercise;

import java.util.Arrays;

public class Task4 {

	public static boolean findCharacter(String sentence, char c) {

		char[] tmp = new char[sentence.length()];

		for (int i = 0; i < sentence.length(); i++) {

			tmp[i] = sentence.charAt(i);
		}

		Arrays.sort(tmp);
		int value = Arrays.binarySearch(tmp, c);

		if (value >= 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		System.out.println(findCharacter("nidln", 'n'));

	}

}
