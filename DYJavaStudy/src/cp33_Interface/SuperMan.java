package cp33_Interface;

public class SuperMan extends Human implements Flyer{

	public SuperMan(int age, String name) {
		super(age, name);
	
	}
	
	
	public void printInfo() {
		System.out.print("나이=" + getAge());
		System.out.print("이름=" + getName());
	}
	
	public void eat() {
		System.out.println("\nSuperMan.eat()");
	}
	
	public void takeOff() {
		System.out.println("SuperMan.take Off()");
	}
	
	public void land() {
		System.out.println("SuperMan.land()");
	}
	
	public void fly() {
		System.out.println("SuperMan.fly()");
	}
	
	
	

}
