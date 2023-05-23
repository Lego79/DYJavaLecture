package ep22_abstractClass;

public abstract class Phone {
	
	
	String owner;

	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		
		System.out.println("핸드폰 전원을 킨다");
		
	}
	
	public void turnOff() {
		
		System.out.println("핸드폰 전원을 끈다");
		
	}
	

}
