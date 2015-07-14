package ba.bitcamp.stack.lectures;

public class LinkedListInt {

	private Node start;

	public LinkedListInt() {
		super();
		start = null;
	}

	public void addInversion(int element) {

		if (start == null) {

			start = new Node(element);

		} else {

			Node last = new Node(element);
			last.setNext(start);
			start = last;

		}

	}

	public void add(int element) {
		if (start == null) {
			start = new Node(element);
		} else {
			Node last = getLast();

			last.setNext(new Node(element));
		}
	}

	public int getSize() {

		if (start == null) {
			return 0;
		}

		int counter = 1;
		Node temp = start;

		while (temp.getNext() != null) {

			counter++;
			temp = temp.getNext();

		}

		return counter;
	}

	public int getMidle() {

		if (start == null) {
			return 0;
		}

		Node temp = start;

		int size = getSize() / 2;

		for (int i = 0; i < size - 1; i++) {

			temp = temp.getNext();

		}

		return temp.getValue();

	}

	public void removeFirst() {

		Node first = start;
		first = first.getNext();
		start = first;

	}

	public void removeLast() {

		Node last = getLast();
		Node last1 = getPrevious(last);

		last1.setNext(null);

	}

	public Node getLast() {

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
		Node previous = getPrevious(temp);
		previous.setNext(temp.getNext());
	}

	public Node getPrevious(Node n) {

		if (n == start) {
			return null;
		}

		Node tmp = start;
		while (tmp.getNext() != n) {

			tmp = tmp.getNext();
		}
		return tmp;
	}

	public int getFirst() {

		if (start == null) {
			return 0;
		}

		return start.getValue();

	}

	@Override
	public String toString() {
		if (start == null) {
			return "The list is empty";
		}

		return start.toString();
	}

	public class Node {

		private int value;
		private Node next;

		public Node(int value) {
			super();
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
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

			return value + " " + next.toString();
		}

	}

}
