package cp31_inheritanceMethodOverride;

public class Cat extends Animal {
	
	private int legs;

	public Cat(String name, int age, String sex, int legs) {
		super(name, age, sex);
		this.legs = legs;
	}
	
	public Cat(String spiecies, String name, int age, String sex, int legs) {
		super(spiecies, name, age, sex);
		this.legs = legs;
	}

	public void printInfo() {
		
		System.out.println("\n==== Cat Info ====");		
		System.out.print("동물 = " + getSpiecies());
		System.out.print(" | 이름 = " + getName());
		System.out.print(" | 나이 = " + getAge());
		System.out.print(" | 성별 = " + getSex());		
		System.out.print(" | 다리 = " + legs);		
		System.out.println();
		
	}
	

}
