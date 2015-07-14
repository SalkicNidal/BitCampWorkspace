package ba.bitcamp.stack.exercise;

public class QueueMain {

	public static void main(String[] args) {
	
		
		QueueDoubleArray q = new QueueDoubleArray();
		q.add(5.2);
		q.add(3.2);
		q.add(4.4);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q);
		

	}

}
