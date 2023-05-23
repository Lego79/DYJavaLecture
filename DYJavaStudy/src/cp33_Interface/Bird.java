package cp33_Interface;

public class Bird extends Animal implements Flyer {
	

	private int wings;
	
	
	public Bird(int age, int wings) {
		super(age);
		this.wings = wings;
	}
	
	

	
	public int getWings() {
		return wings;
	}




	public void setWings(int wings) {
		this.wings = wings;
	}




	public void printInfo() {
		System.out.print("나이=" + getAge());
		System.out.print("날개수=" + getWings());
	}
	
	public void eat() {
		System.out.println("\nBird.eat()");
	}
	
	public void takeOff() {
		System.out.println("Bird.take Off()");
	}
	
	public void land() {
		System.out.println("Bird.land()");
	}
	
	public void fly() {
		System.out.println("Bird.fly()");
	}
	

}
