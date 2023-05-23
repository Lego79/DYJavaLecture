package cp33_Interface;

public class Human extends Animal {
	
	private String name;

	public Human(int age, String name) {
		super(age);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printInfo() {
		
		System.out.print("나이=" + getAge());
		System.out.print("이름=" + getName());
		
	}
	
	
	public void eat() {
		System.out.println("\nHuman.eat()");
	}
	
	
	

}
