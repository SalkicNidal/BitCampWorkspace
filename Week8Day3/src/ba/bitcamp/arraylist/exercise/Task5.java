package ba.bitcamp.arraylist.exercise;

import java.util.Arrays;

public class Task5 {

	public static String[] sortString(String... sentences) {

		Arrays.sort(sentences);
		
		return sentences;
	}

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(sortString("Nidal", "Amra", "Bukva", "Yyy")));

	}

}
