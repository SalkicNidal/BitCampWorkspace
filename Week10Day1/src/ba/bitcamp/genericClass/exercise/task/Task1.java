package ba.bitcamp.genericClass.exercise.task;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import javax.swing.JButton;

public class Task1 {

	public static <T> void printAll(Collection<T> coll) {

		Iterator<T> iter = coll.iterator();

		System.out.print("[ ");
		while (iter.hasNext()) {

			System.out.print(iter.next() + " ");

		}
		System.out.println(" ]");
	}

	public static <T> int countOccuerences(Collection<T> coll, T type) {

		Iterator<T> iter = coll.iterator();
		int counter = 0;
		while (iter.hasNext()) {

			if (iter.next().equals(type)) {

				counter++;
			}
		}

		return counter;

	}

	public static <Componenet> void printComponentInfo(Component c) {

		System.out.println("Width: " + c.getWidth() + " ,height: "
				+ c.getHeight() + ", location:( " + c.getX() + " - " + c.getY()
				+ " )");

	}

	public static <T> void printType(Collection<T> coll) {

		if (coll instanceof LinkedList<?>) {
			System.out.println("List");
		} else if (coll instanceof ArrayList<?>) {

			System.out.println("ArrayList");

		} else if (coll instanceof Map) {

			System.out.println("Map");

		} else if (coll instanceof Set<?>) {

			System.out.println("Set");

		} else {

			System.out.println("Something else");
		}

	}

	public static void main(String[] args) {

		LinkedList<Integer> nums = new LinkedList<Integer>();

		nums.add(12);
		nums.add(12);
		nums.add(14);
		nums.add(12);

		Task1.printAll(nums);
		System.out.println(Task1.countOccuerences(nums, 1));

		JButton button = new JButton();
		button.setSize(200, 100);
		button.setLocation(50, 25);
		Task1.printComponentInfo(button);

		ArrayList<String> list = new ArrayList<String>();
		

		Task1.printType(nums);
		Task1.printType(list);

	}

}
