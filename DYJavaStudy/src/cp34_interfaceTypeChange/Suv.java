package cp34_interfaceTypeChange;

public class Suv extends Car implements PassengerModel, TruckModel {
	private int speed;
	public Suv(String name) {
		super(name);
		
	}
	
    public void speedUp() {

        speed += 40;
        if (speed >= 150)
            speed = 150;
        System.out.println("[" + getName() +  "speedUP : speed : " + speed + "(km)");

    }
	
	public void getOn() {
		
		System.out.println(getName()+"에 타다.");
		
		
	}
	
	public void getOff() {
		System.out.println(getName()+"에서 내리다.");
	}
	
	public void load() {
		
		System.out.println(getName() + "에 짐을 싣다.");
	}
	
	public void unload() {
		
		System.out.println(getName() + "에 짐을 내리다.");
	}
	

}
