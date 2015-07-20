package ba.bitcamp.genericClass.lectures.task;

public class QueueTest {

	public static void main(String[] args) {
		
		
		QueueString strQ = new QueueString();
		
		strQ.enqueue("A");
		strQ.enqueue("B");
		strQ.enqueue("C");
		
		for ( int i = 0; i < 3; i++){
			
			System.out.println(strQ.dequeue());
			System.out.println(strQ.size());
		}
		
		
		QueueStringExtends q = new QueueStringExtends();
		
		q.enqueue("A");

	}

}
