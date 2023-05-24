package ep27_polyInterface;

public class Car {
	
	Tire tire1 = new HankookTire();
	Tire tire2 = new KumhoTire();
	
	public void run() {
		
		tire1.roll();
		tire2.roll();
		
	}
	


}
