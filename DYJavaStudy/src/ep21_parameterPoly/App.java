package ep21_parameterPoly;

public class App {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Vehicle vehicle = new Vehicle();
		
		Bus bus = new Bus();
		
		Taxi taxi = new Taxi();
		
		
		System.out.println("==== 버스 ====");
		driver.drive(bus);
		
		System.out.println("\n==== 택시 ====");
		driver.drive(taxi);
		
		System.out.println("\n==== 차량 ====");
		driver.drive(vehicle);
		

	}

}
