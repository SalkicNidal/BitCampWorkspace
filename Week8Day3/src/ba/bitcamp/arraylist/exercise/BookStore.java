package ba.bitcamp.arraylist.exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class BookStore {

	private Book[] books;

	public BookStore(Book[] books) {
		super();
		this.books = books;
	}

	public void addBook(Book book) {

		for ( int i = 0; i < books.length; i++){
			if (!books[i].equals(book)){
				books =Arrays.copyOf(books, books.length +1);
				books[books.length - 1] = book;
			}
			
		}

	}

	@Override
	public String toString() {
		String s = "";
		s+= "Book: ";
		for (Book print:books){
			   
			s+= print.getName() +" ";
			   
		   }
		return s;
	
	}

}
