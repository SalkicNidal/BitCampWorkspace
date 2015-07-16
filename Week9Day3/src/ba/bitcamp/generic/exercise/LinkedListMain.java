package ba.bitcamp.generic.exercise;

public class LinkedListMain {

	public static void main(String[] args) {
	
		
		LinkedList list = new LinkedList();
		
		for ( int i = 0; i  < 15; i++){
			
			list.add(i +1);
		}
		
		System.out.println(list);
		
		System.out.println(list.contains(22));
	}
	
	

}
