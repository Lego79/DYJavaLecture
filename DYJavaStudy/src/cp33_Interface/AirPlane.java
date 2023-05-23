package cp33_Interface;

public class AirPlane implements Flyer, Transport{
	
	
	public void load() {
		System.out.println("Airplane.load()");
	}
	
	public void takeOff() {
		System.out.println("Airplane.take Off()");
	}
	
	public void land() {
		System.out.println("Airplane.land()");
	}
	
	public void fly() {
		System.out.println("Airplane.fly()");
	}
	
	public void unload() {
		System.out.println("Airplane.unload()");
		
		
	}
	

}
