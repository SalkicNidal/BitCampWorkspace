package ba.bitcamp.arraylist.exercise;

import java.util.Arrays;

public class Task2 {

	public static void shiftLeft(char[] array) {

		for (int i = array.length - 1; i > 0; i--) {

			array[i] = array[i - 1];

		}

		System.out.println(Arrays.toString(array));

	}

	public static void main(String[] args) {

		char[] array = { 'n', 'e', 'g', 'r', 't' };
		shiftLeft(array);
		
		
		

	}

}
