package ba.bitcamp.genericClass.lectures.task;

import java.util.LinkedList;

@SuppressWarnings("serial")
public class QueueStringExtends  extends LinkedList<String>{
	

	public void enqueue(String val) {

		add(0, val);
	}

	public String dequeue() {

		return remove(size() - 1);
	}

}
