package ba.bitcamp.stack.lectures;

public class Main {

	public static void main(String[] args) {
		
		
		LinkedListInt test = new LinkedListInt();
		
		test.add(52);
		test.add(34);
		test.add(44);
		test.add(22);
		System.out.println(test);
		System.out.println(test.getFirst());
		System.out.println(test.getMidle());
		System.out.println(test.getSize());
		
		test.removeFirst();
		test.removeLast();
		System.out.println(test);
		test.removeFirst();
		System.out.println(test);
		System.out.println(test.getSize());
		
		
	}

}
