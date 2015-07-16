package ba.bitcamp.generic.exercise;

import java.util.Collection;
import java.util.Iterator;

public class LinkedList implements Collection<LinkedList> {

	private Node start;

	public LinkedList() {
		start = null;
	}

	public void add(int element) {

		if (start == null) {
			start = new Node(element);

		} else {
			Node last = getLastNode();

			last.setNext(new Node(element));
		}
	}

	public int get(int index) {
		Node temp = start;

		for (int i = 0; i < index; i++) {
			temp = temp.getNext();
		}

		return temp.getValue();
	}

	private Node getLastNode() {
		if (start == null) {
			return null;
		}

		Node temp = start;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		return temp;
	}

	public void remove(int index) {
		Node temp = start;
		for (int i = 0; i < index; i++) {
			temp = temp.getNext();
		}

		Node previous = getPreviousNode(temp);

		previous.setNext(temp.getNext());
	}

	public Node getPreviousNode(Node n) {
		if (n == start) {
			return null;
		}

		Node temp = start;
		while (temp.getNext() != n) {
			temp = temp.getNext();
		}

		return temp;
	}

	@Override
	public String toString() {
		if (start == null) {
			return "The list is empty";
		}

		return start.toString();
	}

	@Override
	public int size() {

		if (start == null) {

			return 0;
		}

		int counter = 0;
		Node temp = start;

		while (temp.getNext() != null) {

			counter++;
			temp.getNext();
		}

		return counter;

	}

	@Override
	public boolean isEmpty() {

		if (size() == 0)
			return true;

		else
			return false;

	}

	@Override
	public boolean contains(Object o) {
		
		Node tmp = start;
		
		while (tmp.getNext() != null) {

			if (!tmp.getNext().equals(o)) {
				
				return true;
			}
		}
		return false;
	}

	@Override
	public Iterator<LinkedList> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(LinkedList e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends LinkedList> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
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

			return value + " " + next.toString();
		}
	}

}
