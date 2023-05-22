package cp31_inheritanceMethodOverride;

public class Coffee extends Menu{
	
	private String type;
	
	public Coffee (String name, int price, String type) {
		
		super(name, price);
		this.type = type;
		
	}
	
	public void printInfo() {
		System.out.println("\n==== Coffee Info ====");		
		System.out.print("메뉴 = " + getName());
		System.out.print(" | 가격 = " + getPrice());
		System.out.print(" | 원두 = " + type);
		System.out.println();
		
	}

}
