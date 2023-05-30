package cp44_collectionList;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

public class Order <T>{
	
	private List<Menu> menu;
	
	

	
	public List<Menu> getMenu() {
		return menu;
	}




	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}




	public Order(List<Menu> menu) {
		this.menu = menu;
	}




	
	public void printOrder() {
		System.out.println("==== 주문서 ====");
		int cnt=0;
		int total = 0;
		
		
		for(int i=0; i< menu.size(); i++) {
			System.out.print("\t"+ (i+1) + ".");

			menu.get(i).printInfo();
			total += menu.get(i).getPrice();
			cnt++;			
		} 
		
		System.out.println("* 주문 메뉴수 :" + cnt);
		System.out.println("* 주문액 : " + total + "(원)" );
		LocalDate now = LocalDate.now();
		System.out.println("*주문시간 : " +now);
		
		
	}
	
	
	

}
