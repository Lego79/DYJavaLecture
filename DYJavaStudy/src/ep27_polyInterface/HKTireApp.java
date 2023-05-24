package ep27_polyInterface;

public class HKTireApp  {
	public static void main(String[] args) {
		
		
		Car mycar = new Car();
		mycar.run();
		
		mycar.tire1 = new KumhoTire();
		mycar.tire2 = new KumhoTire();
		
		mycar.run();
		
		
	}

}
