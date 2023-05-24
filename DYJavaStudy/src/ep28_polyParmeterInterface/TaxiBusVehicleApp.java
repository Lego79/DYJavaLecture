package ep28_polyParmeterInterface;

public class TaxiBusVehicleApp {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Taxi taxi = new Taxi();
		
		Bus bus = new Bus();
		
		System.out.println("\n ==== 클래스 객체에서 drive로 접근 ====");
		driver.drive(taxi);
		driver.drive(bus);
			
		Vehicle vehicle1 = new Taxi();
		Vehicle vehicle2 = new Bus();
		
		
		System.out.println("\n ==== 인터페이스객체에서 Taxi, bus 메서드로 접근 ====");
		vehicle1.run();
		vehicle2.run();
		
		System.out.println("\n ==== 인터페이스객체에서 driver로 접근 ====");
		driver.drive(vehicle1);
		driver.drive(vehicle2);
		
		

	}

}
