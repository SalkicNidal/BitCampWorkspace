package ba.bitcamp.genericQueue.examples;

import java.util.LinkedList;

public class QueueUtils {

	public static <E> void enqueueString(LinkedList<E> queue, E element) {

		queue.add(0, element);
	}

	public static <E> E dequeueString(LinkedList<E> queue) {

		return queue.remove(queue.size() - 1);
	}

}
