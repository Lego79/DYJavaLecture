package cp27_bookStroeArray;

import cp27_bookStroeArray.entity.Book;

import cp27_bookStroeArray.entity.Shirt;

import cp27_bookStroeArray.entity.Member;

import cp27_bookStroeArray.service.ShirtService;

import cp27_bookStroeArray.service.BookService;

public class CartApp {

	public static void main(String[] args) {
		
		Member member = new Member("coldwinter", "victoria", "A", 5000);
		
		Book[] bookArray = new Book[5];

		bookArray[0] = BookService.makeBook("comic","열혈강호", "전극진,양재현" ,"대원씨아이",4500, "979-11-5754-926-9");
		bookArray[1] = BookService.makeBook("travel","뉴욕 100배 즐기기", "홍지윤" ,"알에이치코리아	",14400, "978-89-255-8673-1");
		bookArray[2] = BookService.makeBook("travel","바르셀로나	지금이 좋아", "정다운" ,"중앙북스",15000, "978-89-991-7580-0");
		bookArray[3] = BookService.makeBook("food","오늘의 맥주", "이성준" ,"오운",18000, "979-11-92814-04-9");
		bookArray[4] = BookService.makeBook("food","버번 위스키의 모든 것", "조승원" ,"(주)교유당	",24000, "979-11-90277-42-6");
		
		Shirt[] shirtArray = new Shirt[3];
		
		shirtArray[0] = ShirtService.makeShirt("코튼/린넨 버튼 다운 셔츠", "blue", "wow", "면 50%, 마 50%", "M", 60000);
		shirtArray[1] = ShirtService.makeShirt("코튼 셔츠", "white", "wow", "면 100%", "L", 45000);
		shirtArray[2] = ShirtService.makeShirt("코튼 버튼 다운 셔츠", "black", "wow", "면 100%%", "L", 53000);
		
		Cart c = new Cart(member, bookArray, shirtArray);
		
//		System.out.println("\n==== printBooksExpense() ====");
//		//도서구매 총액
//		c.printBooksExpense();
//		
//		System.out.println("\n==== printBooksInfo() ====");
//		c.printBooksInfo();
//		
//		System.out.println("\n==== printBooksInfoByCategory ====");
//		
//		System.out.println("\n---- travel ----");
//		String category = "travel";
//		c.printBooksInfoByCategory(category);
//		
//		System.out.println("\n---- health ----");
//		category = "health";
//		c.printBooksInfoByCategory(category);
//		
//		System.out.println("\n==== printShirtExpense() ====");
//		//도서구매 총액
//		c.printShirtExpense();
//		
//		System.out.println("\n==== printShirtsInfo ====");
//		//셔츠 구매 정보
//		c.printShirtInfo();
//		
//		System.out.println("\n ==== printTotalExpense() ====");
//		c.printTotalExpense();
		
//		System.out.println("\n ==== printCartInfo() ====");
//		c.printCartInfo();
		
		System.out.println("\n ==== printGiftYn ====");
		c.printGiftYn();
		
		System.out.println("\n ==== Buy() ====");
		boolean pointUseYn = false;
		c.buy(pointUseYn);

	}

}
