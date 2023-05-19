package cp27_bookStroeArray;

import java.text.DecimalFormat;

import cp27_bookStroeArray.entity.Book;
import cp27_bookStroeArray.entity.Shirt;
import cp27_bookStroeArray.entity.Member;
import cp27_bookStroeArray.entity.Member;

public class Cart {

	private Member member;
	private Book[] bookArray;
	private Shirt[] shirtArray;

	public Cart(Member member, Book[] bookArray, Shirt[] shirtArray) {
		super();
		this.member = member;
		this.bookArray = bookArray;
		this.shirtArray = shirtArray;

	}

	public Member getMember() {
		return member;
	}

	public Book[] getBookArray() {
		return bookArray;
	}

	public Shirt[] getShirtArray() {
		return shirtArray;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public void setBookArray(Book[] bookArray) {
		this.bookArray = bookArray;
	}

	public void setShirtArray(Shirt[] shirtArray) {
		this.shirtArray = shirtArray;
	}

	DecimalFormat df = new DecimalFormat("#,###");

	public void printTotalBookInfo(Book book, int count) {
		System.out.println("\n" + count + ".");
		System.out.println("분야= " + book.getCategory());
		System.out.println("제목= " + book.getTitle());
		System.out.println("저자= " + book.getAuthor());
		System.out.println("출판사= " + book.getPublisher());
		System.out.println("가격= " + df.format(book.getPrice()));
		System.out.println("isbn= " + book.getIsbn());
	}

	public void printShirtInfo() {

		int sum = 0;
		for (int i = 0; i < shirtArray.length; i++) {
			sum += shirtArray[i].getPrice();
		}

		int count = 1;
		for (int i = 0; i < shirtArray.length; i++) {
			System.out.println("\n" + count + ".");
			System.out.println("상품명=" + shirtArray[i].getName());
			System.out.println("색상=" + shirtArray[i].getColor());
			System.out.println("제조사=" + shirtArray[i].getCompany());
			System.out.println("소재=" + shirtArray[i].getMaterials());
			System.out.println("크기=" + shirtArray[i].getSize());
			System.out.println("가격=" + df.format(shirtArray[i].getPrice()));
			count++;

		}

		System.out.println("\n* 구매수" + " : " + (count - 1) + "(벌)");
		System.out.println("* 구매액" + " : " + df.format(sum) + "(원)");

	}

	public void printBooksExpense() {

		int sum = 0;
		for (int i = 0; i < bookArray.length; i++) {
			sum += bookArray[i].getPrice();
		}
		System.out.println(df.format(sum));

	}

	public void printBooksInfo() {

		int sum = 0;
		for (int i = 0; i < bookArray.length; i++) {
			sum += bookArray[i].getPrice();
		}
		System.out.println(df.format(sum));

		int count = 1;

		for (int i = 0; i < bookArray.length; i++) {

			printTotalBookInfo(bookArray[i], count);

			count++;

		}

		System.out.println("\n* 구매수" + " : " + (count - 1) + "(권)");
		System.out.println("\n* 구매액" + " : " + df.format(sum) + "(원)");

	}

	public void printBooksInfoByCategory(String category) {

		int sum = 0;

		int count = 1;
		for (int i = 0; i < bookArray.length; i++) {
			if (category.equals(bookArray[i].getCategory())) {
				sum += bookArray[i].getPrice();
				System.out.println("\n" + count + ".");
				System.out.println("분야= " + bookArray[i].getCategory());
				System.out.println("제목= " + bookArray[i].getTitle());
				System.out.println("저자= " + bookArray[i].getAuthor());
				System.out.println("출판사= " + bookArray[i].getPublisher());
				System.out.println("가격= " + df.format(bookArray[i].getPrice()));
				System.out.println("isbn= " + bookArray[i].getIsbn());
				count++;
			}

		}

		if (count == 1) {
			System.out.println("no data availbe");
		} else {
			System.out.println("\n* 구매수" + " : " + (count - 1) + "(권)");
			System.out.println("\n* 구매액" + " : " + df.format(sum) + "(원)");
		}

	}

	public void printShirtExpense() {

		int sum = 0;
		for (int i = 0; i < shirtArray.length; i++) {
			sum += shirtArray[i].getPrice();
		}
		System.out.println("가격=" + df.format(sum) + "원");

	}

	public String getTotalExpense() {
		int sumBook = 0;
		int sumShirt = 0;

		for (int i = 0; i < shirtArray.length; i++)
			sumShirt += shirtArray[i].getPrice();

		for (int j = 0; j < bookArray.length; j++)
			sumBook += bookArray[j].getPrice();

		return df.format(sumBook + sumShirt);
	}

	public void printTotalExpense() {
		System.out.println("지출 총 금액: " + getTotalExpense());
	}

	public void printCartInfo() {

		System.out.println("\n ---- Books Info ----");
		printBooksInfo();

		System.out.println("\n ---- Shirts Info ----");
		printShirtInfo();

		System.out.println("\n ---- Total Info ----");
		System.out.println("*구매수");
		System.out.println("	책 : " + bookArray.length + "(권)");
		System.out.println("	셔츠 : " + shirtArray.length + "(벌)");
		String totalExpense = getTotalExpense();
		System.out.println("구매액 총합 : " + totalExpense);

	}

	public int getTotalExpense1() {
		int sumBook = 0;
		int sumShirt = 0;

		for (int i = 0; i < shirtArray.length; i++)
			sumShirt += shirtArray[i].getPrice();

		for (int j = 0; j < bookArray.length; j++)
			sumBook += bookArray[j].getPrice();

		return sumBook + sumShirt;
	}

	public void printTotalExpense1() {
		int totalExpense1 = getTotalExpense1();
		System.out.println("지출 총 금액: " + df.format(totalExpense1));
	}

	public void printGiftYn() {

		int totalExpense = getTotalExpense1();
		if (totalExpense > 200000)
			;

		System.out.println("사은품 여부 : 대상");

	}

	public void buy (boolean pointUseYn) {
		
		System.out.println("\n==== [ 영수증 ] ====");
		
		System.out.println("\n---- 고객 ----");
		System.out.println("아이디 : " + member.getNickName());
		System.out.println("이름 : " + member.getName());
		System.out.println("등급 : " + member.getGrade());
		
		System.out.println("\n==== [ 구매내역 ] ====");
		
		int count = 1;
		for (int i = 0; i < bookArray.length; i++) {
			
		System.out.println("도서");
		System.out.print("	" + count + ". " + bookArray[i].getTitle());
		System.out.print(", " + df.format(bookArray[i].getPrice())  + "원");
		count++;
		}
		
		System.out.println();
		
		int shirtCount = 1;
		for (int i = 0; i < shirtArray.length; i++) {
			
		System.out.println("셔츠");
		System.out.print("	" + shirtCount + ". " + shirtArray[i].getName());
		System.out.print(", " + df.format(shirtArray[i].getPrice())  + "원");
		shirtCount++;
		}
		
		System.out.println("\n---- 구매금액 ----");

		System.out.println("총액 : " + df.format(getTotalExpense1())+"(원)");
		
		System.out.println("\n ---- 결제금액 ----");	
		
				
		//결제 금액 두가지의 경우
		//1. 결제금액 = 구매금액 - 포인트
		//	grade에 따라서 포인트 차감
		//		S = 0.03, A = 0.02, C = 0.01
		
		//2. 결제금액 = 결제금액, 포인트 = 기존 포인트 + 신규 포인트
		//		S = 0.03, A = 0.02, C = 0.01
		//		+ totalPoint = point + newPoint * 등급별 0.0x
		//3. 

		if(pointUseYn == true) {
			
			
			int expense = 0;
			switch(member.getGrade()) {
			
			case "S":
			    
			    expense = (getTotalExpense1() - member.getPoint());
			    member.setPoint((int)(getTotalExpense1() * 0.03));			   
			    break;
			case "A":
				
			    expense = (getTotalExpense1() - member.getPoint());
			    member.setPoint((int) (getTotalExpense1() * 0.02));			   
			    break;
			    
			case "C":
				
			    expense = (getTotalExpense1() - member.getPoint());
			    member.setPoint((int) (getTotalExpense1() * 0.01));			   
			    break;
			    
			   
			    
			} 		
			
			System.out.println("결제금액 : " + expense);	
			System.out.println("\n---- point ----");
			System.out.println("현재 포인트 : " + df.format(member.getPoint()));
			System.out.println("누적 포인트 : " + df.format(member.getPoint());
			
			
			
		}
		
		if(pointUseYn == false) {
			
			int expense = 0;
			switch(member.getGrade()) {
			
			case "S":
			    
			    expense = (getTotalExpense1() - member.getPoint());
			    member.setPoint((int)(getTotalExpense1() * 0.03));			   
			    break;
			case "A":
				
			    expense = (getTotalExpense1() - member.getPoint());
			    member.setPoint((int) (getTotalExpense1() * 0.02));			   
			    break;
			    
			case "C":
				
			    expense = (getTotalExpense1() - member.getPoint());
			    member.setPoint((int) (getTotalExpense1() * 0.01));			   
			    break;
			    
			   
			    
			} 
			System.out.println("결제금액 : " + expense);	
			
			
		}
		
		System.out.println("\n ---- 사은품 ----");
		printGiftYn();
	}
}
	
	


//public void printTotalExpense() {
//int sumBook = 0;
//int sumShirt = 0;
//for (int i = 0; i < shirtArray.length; i++) 
//	sumShirt += shirtArray[i].getPrice();
//
//for(int j = 0; j < bookArray.length; j++) 
//	sumBook += bookArray[j].getPrice();
//	 
//System.out.println("지출 총 금액 : " + df.format(sumBook + sumShirt));	
//
//}
