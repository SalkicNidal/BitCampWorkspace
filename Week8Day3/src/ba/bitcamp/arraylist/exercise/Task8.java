package ba.bitcamp.arraylist.exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Task8 {

	public static void shiftLeft(ArrayList<Character> c) {

		for (int i = c.size() - 1; i > 0; i--) {

			c.set(i, c.get(i - 1));
		}
		System.out.println(c);
	}

	public static ArrayList<String> removeNull(ArrayList<String> s) {

		ArrayList<String> tmp = new ArrayList<String>();

		for (int i = 0; i < s.size(); i++) {

			if (s.get(i) != (null)) {

				tmp.add(s.get(i));

			}

		}

		return tmp;

	}

	public static void main(String[] args) {

		ArrayList<Character> c = new ArrayList<Character>();

		c.add('c');
		c.add('r');
		c.add('t');
		c.add('y');

		shiftLeft(c);

		ArrayList<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList("Nidal", null, "nema", null, "opet nema"));
		System.out.println(removeNull(list));
		
		

	}

}
