package cp33_Interface;

public abstract class Animal {
	
	private int age;

	public Animal(int age) {

		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void printInfo() {
		
		System.out.print("나이=" + getAge());
	}
	
	public void eat() {
		System.out.println("\nHuman.eat()");
	}
	
	
	
	

}
