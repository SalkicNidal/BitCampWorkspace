package ba.bitcamp.genericQueue.examples;

import java.util.LinkedList;

public class TestQueueuUtils {

	public static void main(String[] args) {
		
		LinkedList<String> queue = new LinkedList<String>();
		
		QueueUtils.enqueueString(queue, "A");
		QueueUtils.enqueueString(queue, "B");
		QueueUtils.enqueueString(queue, "C");
		
		while ( queue.size() > 0){
			
			System.out.println(QueueUtils.dequeueString(queue));
		}
		
		
		LinkedList<Integer> nums = new LinkedList<Integer>();
		
		QueueUtils.enqueueString(nums, 3);
		QueueUtils.enqueueString(nums, 2);
		QueueUtils.enqueueString(nums, 1);
		
		while ( nums.size() > 0){
			
			System.out.println(QueueUtils.dequeueString(nums));
		}
	}

}
