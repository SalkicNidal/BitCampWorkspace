package ba.bitcamp.genericQueue.examples;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {

		QueueComposition<String> qS = new QueueComposition<String>();

		qS.enqueue("A");
		qS.enqueue("B");
		qS.enqueue("A");
		qS.enqueue("B");

		for (int i = 0; i < 4; i++) {

			System.out.println(qS.dequeue());
			System.out.println("Index: " + qS.size());
		}

		System.out.println();

		QueueComposition<Integer> number = new QueueComposition<Integer>();

		number.enqueue(1);
		number.enqueue(2);
		number.enqueue(3);
		number.enqueue(4);

		//Testing add collection queue list
		HashSet<Integer> nums1 = new HashSet<Integer>();
		nums1.add(10);
		nums1.add(11);

		number.enqueuAll(nums1);
		System.out.println(number.toString());

		// Testing dequeue all to another queue composition

		System.out.println();
		QueueComposition<Integer> number1 = new QueueComposition<Integer>();
		number.dequeueTo(number1);
		System.out.println(number);
		System.out.println(number1 + " new List");

		// Test number queue

		System.out.println();
		QueueComposition<Number> nums = new QueueComposition<Number>();

		nums.enqueue(1);
		nums.enqueue(10L);
		nums.enqueue(12.3);
		
		System.out.println(nums);
		// Cannot pass collection < Integer > where expected Collection < NUmber >
		nums.enqueuAll(nums1);
		
		System.out.println(nums);
//		nums.dequeueTo(nums1);

	}

}
