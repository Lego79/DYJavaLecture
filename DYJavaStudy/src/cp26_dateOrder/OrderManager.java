package cp26_dateOrder;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderManager {
	
	Menu[] order;

	public OrderManager(Menu[] order) {
		this.order = order;
	}
	
	public static Menu getMenu(String burger, int price) {
		
		return new Menu(burger, price);
		
	}
	
	public void printReceipt() {
		
		Date now = new Date();
		
		DecimalFormat df;
		
		df = new DecimalFormat("#,###");
		
	
		

		System.out.println("==== [영수증] ====");
		
		System.out.println("\n---- 주문시간 ----");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(now));	
		
		System.out.println("\n----주문 상세 ----");
		for(int i = 0; i < order.length; i ++) {
			
			System.out.println((i+1) + ". " + "메뉴" + order[i].getName() + "|" + "가격=" + df.format(order[i].getPrice()));
			
			
		}
		
		System.out.println("\n---- 주문 금액 합계 ----");
		int sum = 0;
		for(int i = 0; i < order.length; i ++) {		
			
			sum += order[i].getPrice();	
						
		} 
		System.out.println(df.format(sum) + "(원)");
		
		
	}
	
	

}
