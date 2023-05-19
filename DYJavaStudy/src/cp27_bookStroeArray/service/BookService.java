package cp27_bookStroeArray.service;

import cp27_bookStroeArray.entity.Book;

public class BookService {
	
	public static Book makeBook(String category, String title, String author, String publisher, int price, String isbn) {
		
		return new Book(category, title, author, publisher, price, isbn);
	}
	

}
