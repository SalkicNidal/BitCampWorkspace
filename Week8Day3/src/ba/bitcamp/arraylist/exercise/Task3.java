package ba.bitcamp.arraylist.exercise;

import java.util.Arrays;

public class Task3 {

	public static String[] removeNull(String... sentence) {

		int counter = 0;

		for (int i = 0; i < sentence.length; i++) {

			if (sentence[i]!=null) {
				counter++;
			}
		}
		
		String [] arr = new String[counter];
		
		int index = 0;
		for ( int i = 0; i < sentence.length; i++){
			if ( sentence[i]!=(null)){
				
				arr[index] = sentence[i];
				index++;
			}

		}

		return arr;
	}

	public static void main(String[] args) {
		
		
		System.out.println(Arrays.toString(removeNull("Nidal", null, "nnnn")));

	}

}
