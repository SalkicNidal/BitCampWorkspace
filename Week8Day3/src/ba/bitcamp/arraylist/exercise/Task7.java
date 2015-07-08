package ba.bitcamp.arraylist.exercise;

import java.util.Arrays;

public class Task7 {
	
	public static int [] fillArray( int size, int value, int startIndex, int endIndex){
		
		int [] arr = new int[size];
		
		Arrays.fill(arr, -1);
		Arrays.fill(arr, startIndex, endIndex, value);
		
		return arr;
		
	}

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(fillArray(7, 3, 4, 6)));
	}

}
