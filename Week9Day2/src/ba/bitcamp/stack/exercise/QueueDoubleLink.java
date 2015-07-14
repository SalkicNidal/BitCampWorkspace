package ba.bitcamp.stack.exercise;

public class QueueDoubleLink {

	private Node start;
	private Node finish;
	
	
	
	public class Node{
		
		Double value;
		Node prev;
		Node next;
		
		public Node(Double value) {
			this.value = value;
		
		}
	}
}
