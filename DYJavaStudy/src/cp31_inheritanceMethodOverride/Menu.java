package cp31_inheritanceMethodOverride;

public class Menu {
	
	private String name;
	private int price;
	
	
	public Menu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("\n==== Menu Info ====");
		System.out.print("메뉴 = " + name);
		System.out.print(" | 가격 = " + price);
		System.out.println();
		
	}
	
	

}
