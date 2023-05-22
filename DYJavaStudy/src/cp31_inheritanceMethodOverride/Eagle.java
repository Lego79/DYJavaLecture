package cp31_inheritanceMethodOverride;

public class Eagle extends Animal {
	
	private int wings;

	
	public Eagle(String spiecies, String name, int age, String sex, int wings) {
		super(spiecies, name, age, sex);
		this.wings = wings;
	}


	public void printInfo() {
		
		System.out.println("\n==== Eagle Info ====");		
		System.out.print("동물 = " + getSpiecies());
		System.out.print(" | 이름 = " + getName());
		System.out.print(" | 나이 = " + getAge());
		System.out.print(" | 성별 = " + getSex());		
		System.out.print(" | 날개 = " + wings);		
		System.out.println();
		
		
	}
	
	public void fly() {
		
		System.out.println("\n그리 :: fly()");
		
	}
	
	

}
