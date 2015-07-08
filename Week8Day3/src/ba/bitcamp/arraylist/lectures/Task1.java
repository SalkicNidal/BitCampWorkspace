package ba.bitcamp.arraylist.lectures;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {

	public static void main(String[] args) {

		ArrayList<Integer> randomArray = new ArrayList<Integer>();

		for (int i = 0; i < 100000; i++) {

			Random num = new Random();
			randomArray.add(num.nextInt(3));
		}

		// System.out.println(randomArray);

		long start = System.currentTimeMillis();
		while (randomArray.indexOf(2) != -1) {

			randomArray.remove((Integer) 2);

		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);

		long start1 = System.currentTimeMillis();

		int tmp = randomArray.indexOf(2);
		while (tmp != -1) {

			randomArray.remove(tmp);
			tmp = randomArray.indexOf(2);
		}
		long end1 = System.currentTimeMillis();

		System.out.println(end1 - start1);

	}

}
