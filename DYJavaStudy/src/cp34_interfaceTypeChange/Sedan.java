package cp34_interfaceTypeChange;

public class Sedan extends Car implements PassengerModel {
	
	
	
	public Sedan(String car) {
		super(car);
		
	}

	public void getOn() {
		
		System.out.println(getName()+"에 타다.");
		
		
	}
	
	public void getOff() {
		System.out.println(getName()+"에서 내리다.");
	}

}
