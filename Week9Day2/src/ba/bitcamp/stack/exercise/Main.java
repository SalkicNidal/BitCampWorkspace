package ba.bitcamp.stack.exercise;

public class Main {

	public static void main(String[] args) {

		// Declaration Stack of string array
		StackStringArray s = new StackStringArray();

		// Use some of methods
		System.out.println(s.empty());
		System.out.println(s.push("NIdal"));
		System.out.println(s.empty());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);

		// Testing push method
		Long start = System.currentTimeMillis();
		for (int i = 1; i < 100000; i++) {

			s.push("Line");

		}

		System.out.println(System.currentTimeMillis() - start);

		// Declaration Stack of String link
		StackStringLink s1 = new StackStringLink();

		// Use some of methods
		System.out.println(s1.empty());
		s1.push("Adis");
		System.out.println(s1.search("A"));
		System.out.println(s1);
		System.out.println(s1.pop());
	
		

		// Testing push method
		Long start1 = System.currentTimeMillis();

		for (int i = 1; i < 100000; i++) {
			s1.push("Line");
		}
		
		System.out.println(System.currentTimeMillis() - start1);

	}

}
