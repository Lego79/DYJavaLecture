package cp44_collectionList.bookList;

import java.text.DecimalFormat;
import java.util.List;

public class BookStroe {

	private List<Book> bookList;

	public BookStroe(List<Book> book) {
		this.bookList = book;
	}

	public List<Book> getBook() {
		return bookList;
	}

	public void setBook(List<Book> book) {
		this.bookList = book;
	}

	public void printBookStore() {
		int count = 1;
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println(count + ".");
			bookList.get(i).printInfo();
			count++;

		}

	}

	public void printBookStoreByCategory(String category) {

		int count = 1;
		for (int i = 0; i < bookList.size(); i++) {
			
			if (bookList.get(i).category.equals(category)) {
				System.out.println(count + ".");
				bookList.get(i).printInfo();
				count++;
				
			}

		}

	}
	
	public void PrintBookByIsbn(String isbn) {

		int count = 1;
		for (int i = 0; i < bookList.size(); i++) {
			
			if (bookList.get(i).isbn.equals(isbn)) {
				System.out.println(count + ".");
				bookList.get(i).printInfo();
				count++;
				
			}

		}

	}
	
	public void PrintBookByMaxPrice(int maxPrice) {
		
		int count = 1;
		for (int i = 0; i < bookList.size(); i++) {
			
			if (bookList.get(i).getPrice() < maxPrice) {
				System.out.println(count + ".");
				bookList.get(i).printInfo();
				count++;
				
			}

		}
		
	}
	
	public void PrintBookByMinPrice(int minPrice) {
		
		int count = 1;
		for (int i = 0; i < bookList.size(); i++) {
			
			if (bookList.get(i).getPrice() >= minPrice) {
				System.out.println(count + ".");
				bookList.get(i).printInfo();
				count++;
				
			}

		}
		
	}
	
	public void PrintBookByBetweenPrice(int maxPrice, int minPrice) {
		
		int count = 1;
		for (int i = 0; i < bookList.size(); i++) {
			
			if (bookList.get(i).getPrice() >= minPrice && bookList.get(i).getPrice() <= maxPrice ) {
				System.out.println(count + ".");
				bookList.get(i).printInfo();
				count++;
				
			}

		}
		
	}
	
	

}
