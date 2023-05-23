package cp34_interfaceTypeChange;

public class Truck extends Car implements TruckModel {
	
	private int speed;

	public Truck(String name) {
		super(name);

	}
	
	public void load() {
		
		System.out.println(getName() + "에 짐을 싣다.");
	}
	
	public void unload() {
		
		System.out.println(getName() + "에 짐을 내리다.");
	}
	

    public void speedUp() {

        speed += 40;
        if (speed >= 150)
            speed = 150;
        System.out.println("[" + getName() +  "speedUP : speed : " + speed + "(km)");

    }
	
	
	
	

}
