package ba.bitcamp.lectures.task;

import java.util.LinkedList;
import java.util.ListIterator;

public class Task1 {

	public static void main(String[] args) {

		
		LinkedList<Integer> list = new LinkedList<>();

		for (int i = 0; i < 20; i++) {

			list.add(i, (int) (Math.random() * 51 + 50));
		}

		System.out.println(list);

		
		ListIterator<Integer> i = list.listIterator();
		LinkedList<Integer> list1 = new LinkedList<Integer>();

		
		while (i.hasNext()) {

			list1.add(i.next());

		}

		while ( i.hasPrevious())
			
			list1.add(i.previous());
	
	
		System.out.println(list1);
	}

}
