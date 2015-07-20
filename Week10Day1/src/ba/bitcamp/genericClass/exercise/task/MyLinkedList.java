package ba.bitcamp.genericClass.exercise.task;

import java.util.Collection;
import java.util.Iterator;

public class MyLinkedList<T> {

	private Node start;

	public MyLinkedList() {
		start = null;

	}

	public void addLast(T value) {
		if (start == null) {
			start = new Node(value);
		} else {
			Node last = getLast();

			last.next = new Node(value);
		}

	}

	public void addFirst(T value) {

		if (start == null) {
			start = new Node(value);
		} else {

			Node last = new Node(value);
			last.setNext(start);
			start = last;

		}
	}

	public void add(T element, int index) {

		try {

			Node tmp = start;

			for (int i = 0; i < index - 1; i++) {

				tmp = tmp.next;
			}

			Node newNode = new Node(element);
			newNode.setNext(tmp.next);
			tmp.setNext(newNode);

		} catch (IndexOutOfBoundsException e) {

			System.out.println(" Wrong index input ");
		}

	}

	public void addAll(Collection<T> coll) {

		Iterator<T> iter = coll.iterator();

		while (iter.hasNext()) {

			addLast(iter.next());
		}
	}

	public boolean contains(T element) {

		Node tmp = start;
		
		if ( tmp.value.equals(element)){
			return true;
		}
		while (tmp.next != null) {

			if (tmp.next.value.equals(element)) {
				return true;
			}
		}

		return false;

	}

	public void removeFirst() {

		Node first = start;
		first = first.getNext();
		start = first;

	}

	public void remove(T element) {

		Node tmp = start;
		

		while (tmp.next != null) {

			if (tmp.next.equals(element)) {

				tmp = tmp.next;
				start = tmp;

			}
		}
	}

	public int search(T line) {

		int index = 1;
		if (start == null) {
			return -1;
		}

		Node tmp = start;
		
		while (tmp.getNext() != null) {
	
			if (tmp.getValue().equals(line))
				
			index++;
			tmp = tmp.getNext();
			

		}
		
		return index;
		

	}

	private Node getLast() {
		Node tmp = start;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		return tmp;
	}
	
	

	@Override
	public String toString() {
		if (start == null) {
			return "The list is empty";
		}

		return start.toString();
	}



	class Node {
		T value;
		Node next;

		public Node(T value) {
			this.value = value;
			this.next = null;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
		
		@Override
		public String toString() {
			if (next == null) {
				return value + "";
			}

			return value + " , " + next.toString();
		}

	}

}
