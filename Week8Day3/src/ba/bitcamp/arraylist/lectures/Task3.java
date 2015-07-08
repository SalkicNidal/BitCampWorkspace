package ba.bitcamp.arraylist.lectures;

import java.util.ArrayList;

public class Task3 {

	public static void main(String[] args) {

		ArrayList<String> s = new ArrayList<String>();

		s.add("1234");
		s.add("nijdkjk");
		s.add("kfifrjfo");

		System.out.println(s);
		
		

		ArrayList<String> s1 = new ArrayList<String>();

		for (int i = 0; i < s.size(); i++) {

			String tmp = s.get(i);

			if (tmp.length() == 4) {
				s1.add("****");

			}
			s1.add(tmp);
		}

		System.out.println(s1);

	}

}
