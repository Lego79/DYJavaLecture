package ep18_finalClassMethod;

public class CarApp {

	public static void main(String[] args) {
		
		SportsCar s1 = new SportsCar();
		Car c1 = new Car();
		
		s1.speedUp();
		s1.speedUp();
		s1.speedUp();
		s1.speedUp();
		s1.speedUp();
		s1.speedUp();
		
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		
		System.out.println("속도: " + s1.speed);
		
		System.out.println("속도: " + c1.speed);
	

	}

}
