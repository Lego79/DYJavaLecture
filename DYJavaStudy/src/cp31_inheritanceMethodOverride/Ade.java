package cp31_inheritanceMethodOverride;

public class Ade extends Menu{
	
	private String source;
	
	public Ade (String name, int price, String source) {
		
		super(name, price);
		this.source = source;
		
	}
	
	public void printInfo() {
		System.out.println("\n==== Ade Info ====");
		System.out.print("메뉴 = " + getName());
		System.out.print(" | 가격 = " + getPrice());
		System.out.print(" | 재료 = " + source);
		
	}

}
