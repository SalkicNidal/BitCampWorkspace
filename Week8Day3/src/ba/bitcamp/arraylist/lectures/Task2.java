package ba.bitcamp.arraylist.lectures;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		
		Random num = new Random();

		for (int i = 0; i < 6; i++) {

			a.add(num.nextInt(3));
		}

		System.out.println(a);

		
		// Okretanje liste
		ArrayList<Integer> b = new ArrayList<Integer>();

		for (int i = a.size() - 1; i >= 0; i--) {

			b.add(a.get(i));
		}

		
		for (int i = 0; i < a.size() -1; i +=2) {
			
			int tmp = a.get(i);
			
			a.set(i, a.get(i +1));
			a.set(i + 1, tmp);
		
		}

		System.out.println(a);
		

	}

}
