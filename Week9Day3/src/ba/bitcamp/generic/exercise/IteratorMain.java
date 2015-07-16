package ba.bitcamp.generic.exercise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class IteratorMain {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		
		for (int i = 0; i < 100000; i++) {
			Random num = new Random();

			list.add(num.nextInt(100));
			list1.add(num.nextInt(100));
		}


		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number for check");

		int num1 = input.nextInt();

		Iterator<Integer> in = list.iterator();

		while (in.hasNext()) {

			if (in.next() % num1 == 0) {

				in.remove();
			}

		}

		System.out.println((list));

		for (int i = 0; i < list1.size(); i++) {

			if (list1.get(i) % num1 == 0) {

				list1.remove(i);
			}
		}

		System.out.println(list1);
	}

}
