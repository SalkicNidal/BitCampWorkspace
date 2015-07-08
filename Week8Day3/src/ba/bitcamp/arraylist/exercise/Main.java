package ba.bitcamp.arraylist.exercise;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Book [] books = new Book [4];
		
		Book b1 = new Book("Name1");
		Book b2 = new Book("Name2","Author1", 2002);
		Book b3 = new Book("Name3","Author1", 2002);
		Book b4 = new Book("Name4");
		Book b5 = new Book("Name6", "Author");
		
	   books[0] = b1;
	   books[1] = b2;
	   books[2] = b3;
	   books[3] = b4;
//	   books[4] = b5;
			
	   
	   for (Book print:books){
		   
		   System.out.println(print);
	   }

		System.out.println(b2.equals(b3));
		System.out.println(b4.equals(b5));
		
		
		ArrayList<Book> books1 = new ArrayList<>();
		books1.add(b1);
		books1.add(b2);
		books1.add(b3);
		
		
		BookStore bs1 = new BookStore(books);
		bs1.addBook(b5);
		System.out.println(bs1);
		
	}

}
