package cp44_collectionList.bookList;

import java.util.ArrayList;
import java.util.List;

public class Biz {
	
	
	
	public List<Book> convert(String[] contents) {
		
		List<Book> bookList = new ArrayList<>();
		
		for(int i = 0 ; i < contents.length; i++) {
			
			System.out.println(contents[i]);
			String[] data = contents[i].split("/");
			String category = data[0];
			String title = data[1];
			String author = data[2];
			String publisher = data[3];
			int price = Integer.parseInt(data[4]);
			String isbn = data[5];
			Book book = new Book(category, title, author, publisher, price, isbn);
			bookList.add(book);
		} 		
		return bookList;		
	}
	
	public void bookPrintInfo() {
		
		
		
	}

}
