package cp27_bookStroeArray;

import java.text.DecimalFormat;

import cp27_bookStroeArray.entity.Book;

public class BookStore {

	Book[] bookArray;

	public BookStore(Book[] bookArray) {
		this.bookArray = bookArray;
	}

	DecimalFormat df = new DecimalFormat("#,###");
	

	public void printBookstore() {

		
		
		int count = 1;

		System.out.println("==== print BookStore====");
		for (int i = 0; i < bookArray.length; i++) {

			System.out.println("\n" + count + ".");
			System.out.println("분야= " + bookArray[i].getCategory());
			System.out.println("제목= " + bookArray[i].getTitle());
			System.out.println("저자= " + bookArray[i].getAuthor());
			System.out.println("출판사= " + bookArray[i].getPublisher());
			System.out.println("가격= " + df.format(bookArray[i].getPrice()));
			System.out.println("isbn= " + bookArray[i].getIsbn());

		} if(count == 1) {System.out.println("no data availbe");}

	}

	public void printBookStoreByCategory(String category) {

		
		int count = 1;
		for (int i = 0; i < bookArray.length; i++) {
			if (category.equals(bookArray[i].getCategory())) {
				System.out.println("\n" + count + ".");
				System.out.println("분야= " + bookArray[i].getCategory());
				System.out.println("제목= " + bookArray[i].getTitle());
				System.out.println("저자= " + bookArray[i].getAuthor());
				System.out.println("출판사= " + bookArray[i].getPublisher());
				System.out.println("가격= " + df.format(bookArray[i].getPrice()));
				System.out.println("isbn= " + bookArray[i].getIsbn());
				count++;
			}

			

		} if(count == 1) {System.out.println("no data availbe");}
	}
	
	public void printBookByIsbn(String isbn) {

		
		int count = 1;
		
		for (int i = 0; i < bookArray.length; i++) {
			String num = bookArray[i].getIsbn();
			if (num.equals(bookArray[i].getIsbn())) {
				
				printBookInfo(bookArray[i], count);

				count++;
			}

			

		} if(count == 1) {System.out.println("no data availbe");}
	}
	

	
	public void printBooksByMaxPrice(int maxPrice) {
		
		int count = 1;
		for(int i = 0; i < bookArray.length; i++) {
			
			int bookPrice = bookArray[i].getPrice();
			
			if(bookPrice < maxPrice) {
				
				printBookInfo(bookArray[i], count);
				count++;
			}
			
		}
//		for (int i = 0; i < bookArray.length; i++) {
//			if (maxPrice > bookArray[i].getPrice()) {
//				System.out.println("\n" + count + ".");
//				System.out.println("분야= " + bookArray[i].getCategory());
//				System.out.println("제목= " + bookArray[i].getTitle());
//				System.out.println("저자= " + bookArray[i].getAuthor());
//				System.out.println("출판사= " + bookArray[i].getPublisher());
//				System.out.println("가격= " + df.format(bookArray[i].getPrice()));
//				System.out.println("isbn= " + bookArray[i].getIsbn());
//				count++;
//			} 
//			
//		}	
		if(count == 1) {System.out.println("no data availbe");}
		
		
	}
	
	public void printBooksMinPrice(int minPrice) {
		
		int count = 1;
		
		
		for(int i = 0; i < bookArray.length; i++) {
			
			int bookPrice = bookArray[i].getPrice();
			if(bookPrice < minPrice) {
				
				printBookInfo(bookArray[i], count);
				count++;
			}
			
			
		}
	    if (count == 1) {
	        System.out.println("No data available");
	    }
		
//		for (int i = 0; i < bookArray.length; i++) {
//			if (minPrice > bookArray[i].getPrice()) {
//				System.out.println("\n" + count + ".");
//				System.out.println("분야= " + bookArray[i].getCategory());
//				System.out.println("제목= " + bookArray[i].getTitle());
//				System.out.println("저자= " + bookArray[i].getAuthor());
//				System.out.println("출판사= " + bookArray[i].getPublisher());
//				System.out.println("가격= " + df.format(bookArray[i].getPrice()));
//				System.out.println("isbn= " + bookArray[i].getIsbn());
//				count++;
//				
//			} 
//			
//		}	if(count == 1) {
//			System.out.println("no data availbe");
//		}
//		
		
	}
	
	public void printBooksByBetweenPrice(int betweenMinPrice, int betweenMaxPrice) {
		
		
	    int count = 1;
	    for (int i = 0; i < bookArray.length; i++) {
	        int bookPrice = bookArray[i].getPrice();
	        if (betweenMinPrice < bookPrice && bookPrice < betweenMaxPrice) {
	            printBookInfo(bookArray[i], count);
	            count++;
	        }
	    }
	    if (count == 1) {
	        System.out.println("No data available");
	    }
//		int count = 1;
//		for (int i = 0; i < bookArray.length; i++) {
//			if (betweenMinPrice < bookArray[i].getPrice()  
//					&& bookArray[i].getPrice() <betweenMaxPrice) {
//				System.out.println("\n" + count + ".");
//				System.out.println("분야= " + bookArray[i].getCategory());
//				System.out.println("제목= " + bookArray[i].getTitle());
//				System.out.println("저자= " + bookArray[i].getAuthor());
//				System.out.println("출판사= " + bookArray[i].getPublisher());
//				System.out.println("가격= " + df.format(bookArray[i].getPrice()));
//				System.out.println("isbn= " + bookArray[i].getIsbn());
//				count++;
//				
//			} 
//			
//		}	if(count == 1) {
//			System.out.println("no data availbe");
//		}
		
	}
	
    public void printBookInfo(Book book, int count) {
        System.out.println("\n" + count + ".");
        System.out.println("분야= " + book.getCategory());
        System.out.println("제목= " + book.getTitle());
        System.out.println("저자= " + book.getAuthor());
        System.out.println("출판사= " + book.getPublisher());
        System.out.println("가격= " + df.format(book.getPrice()));
        System.out.println("isbn= " + book.getIsbn());
    }
	
}
