package ep17_inheritanceExtends.Exam03;

public class AirPlaneApp {
	
	public static void main(String[] args) {
	
	SupersonicAirplane sa1 = new SupersonicAirplane();
	
	sa1.takeOff();
	sa1.fly();
	sa1.flyMode = SupersonicAirplane.SUPERSONIC;
	sa1.fly();
	sa1.flyMode = SupersonicAirplane.NORMAL;
	sa1.fly();
	sa1.land();
	
	}
	

}
