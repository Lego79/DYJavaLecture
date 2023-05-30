package cp44_collectionList.bookList;

import java.util.List;

public class BookStoreApp {
	
	public static void main(String[] args) {
		
		String[] contents = {
				"comic/열혈강호/전극진-양재현/대원씨아이/4500/979-11-5754-926-9",
				"travel/뉴욕 100배 즐기기/홍지윤/알에이치코리아/14400/978-89-255-8673-1",
				"travel/바르셀로나 지금이 좋아/정다운/중앙북스/15000/978-89-991-7580-0",
				"food/오늘의 맥주/이성준/오운/18000/979-11-92814-04-9",
				"food/버번 위스키의 모든 것/조승원/(주)교유당/24000/979-11-90277-42-6"
		};
		
		Biz biz = new Biz();
		List<Book> bookList = biz.convert(contents);
		
		for(int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i).getTitle());
		}
		
		BookStroe bs = new BookStroe(bookList);
		
		
	}

}
