package ep26_InterfaceTypeChange;

public class BVApp {
	
	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
//		vehicle.checkFare(); // 버스클래스에 있는 메서드는 접근이 불가
		
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.checkFare();
		
	}

}
