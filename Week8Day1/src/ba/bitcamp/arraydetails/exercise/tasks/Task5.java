package ba.bitcamp.arraydetails.exercise.tasks;

import java.util.Arrays;

public class Task5 {
	
	
	public static void printArray( String [] array , String[] array1){
		
		
		String [] newArray = new String[array.length + array1.length];
		int index = 0;
		for ( String element : array){
			if ( index%2 == 0){
			newArray[index] = element;
			index += 2;
		}
		}
		index = 1;
		for ( String element : array1){
			if ( index%2 != 0)
			newArray[index] = element;
			index +=2;
		}
		System.out.println(Arrays.toString(newArray));
	}

	public static void main(String[] args) {
		
		String [] array = {"1", "2", "3"};
		String [] array1 = {"A", "BC", "d"};
		
		printArray(array, array1);

	}

}
