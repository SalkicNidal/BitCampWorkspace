package ba.bitcamp.arraydetails.exercise.tasks;

public class Task3 {

	public static int checkArray(int num, int... array) {

		int counter = 0;

		for (int elements : array) {
			if (num == elements) {
				counter++;

			}

		}
		return counter;

	}

	public static void main(String[] args) {
		
		System.out.println(checkArray(3, 33,3,3,3,3,4,4,4,4,5,5,5,566,6,6,67,7,7,8,8,8));

	}

}
