package cp44_collectionList;

import java.util.List;

public class Menu {

	private String name; // 메뉴명
	private int price; // 가격

	
//	private Coffee coffee;
//	
//	public Menu(Coffee coffee) {
//		this.coffee = coffee;
//	}
	

	public Menu() {

	}

	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void printInfo() {
		System.out.print("메뉴=" + getName());
		System.out.print(" | 가격=" + getPrice());		
	}
	
	public void printOrder() {
		
	}

}
