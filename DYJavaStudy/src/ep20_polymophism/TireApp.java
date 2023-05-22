package ep20_polymophism;

public class TireApp {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.tire = new Tire();
		myCar.run();
		
		myCar.tire = new HankookTire();
		myCar.run();
		
		myCar.tire = new KumhoTire();
		myCar.run();

	}

}
