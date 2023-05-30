package cp44_collectionList.bookList;

public class Book {
	
	String category;
	String title;
	String author;
	String publisher;
	int price;
	String isbn;
	
	
	public Book(String category, String title, String author, String publisher, int price, String isbn) {
		this.category = category;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.isbn = isbn;
	}


	public String getCategory() {
		return category;
	}


	public String getTitle() {
		return title;
	}


	public String getAuthor() {
		return author;
	}


	public String getPublisher() {
		return publisher;
	}


	public int getPrice() {
		return price;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	
	
	
	

}
