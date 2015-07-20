package ba.bitcamp.genericQueue.examples;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class QueueComposition<E> {

	private LinkedList<E> values;

	public QueueComposition() {

		values = new LinkedList<E>();

	}

	public int size() {

		return values.size();
	}

	public void enqueue(E val) {

		values.add(0, val);
	}

	public E dequeue() {

		return values.remove(size() - 1);
	}

	public void enqueuAll(Collection<? extends E> elements) {

		Iterator< ? extends E> iter = elements.iterator();

		while (iter.hasNext()) {

			enqueue(iter.next());
		}

	}

	public void dequeueTo(QueueComposition<? super E> Q) {
		
		while ( this.size() > 0) {
			
			Q.enqueue(this.dequeue());
		}
	}

	@Override
	public String toString() {
		return "QueueComposition values=" + values + ".";
	}

}
