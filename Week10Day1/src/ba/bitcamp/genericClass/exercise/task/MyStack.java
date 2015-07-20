package ba.bitcamp.genericClass.exercise.task;

import java.util.Collection;
import java.util.EmptyStackException;
import java.util.Iterator;


public class MyStack < E > {
	
	
	private Node start;

	public MyStack() {
		start = null;

	}
	
	
	public void addAll(Collection <E> coll){
		
		Iterator<E> iter = coll.iterator();
		
		while ( iter.hasNext()){
			
			push(iter.next());
		}
		
	}

	public E push(E value) {

		if (start == null) {

			start = new Node(value);

		} else {

			Node tmp = new Node(value);
			tmp.setNext(start);
			start = tmp;
		}
		return value;
	}

	
	public E peek() throws EmptyStackException {

		if (start == null) {

			throw new EmptyStackException();
		}
		return start.getValue();
	}

	
	public E pop() throws EmptyStackException {

		if (start == null) {

			throw new EmptyStackException();

		} else {

			E tmp = start.getValue();
			start = start.getNext();
			return tmp;
		}
	}

	
	public String toString() {

		if (start == null) {

			return "Link is empty";

		} else {

			return start.toString();
		}

	}

	
	public int search(E line) {
		
		int index = 0;
		if (start == null) {
			return -1;
		}
		
		Node tmp = start;
		while (tmp.getNext() != null) {
			if (tmp.getValue().equals(line))
			return index;
			index ++;
		tmp = tmp.getNext();
		
		}
		return -1;

	}


	
	public class Node {

		private Node next;
		private E value;

		public Node(E value) {
			this.value = value;
			next = null;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public E getValue() {
			return value;
		}

		public void setValue(E value) {
			this.value = value;
		}

		public String toString() {
			if (next == null) {
				return value + "";
			}
			return value + " , " + next.toString();
		}

	}

}
	
	
