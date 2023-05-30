package cp44_collectionList;

import java.util.*;

public class OrderApp {

	public static void main(String[] args) {
		
		List<Menu> menuList1 = new ArrayList<Menu>();
		menuList1.add(new Coffee("아메리카노", 3000, "예가체프"));	
		menuList1.add(new Coffee("카푸티초", 3500, "오클랜드"));
		menuList1.add(new Ade("레몬에이드", 4000, "레몬,시럽"));
		
		Menu menu = menuList1.get(2);
		
		
		Order order1 = new Order(menuList1);
		order1.printOrder();
		
		
		
		
		
		
		
//		List<Menu> menuList2 = new ArrayList<Menu>();
//		menuList2.add(new Coffee("아메리카노", 3000, "예가체프"));

	}

}
