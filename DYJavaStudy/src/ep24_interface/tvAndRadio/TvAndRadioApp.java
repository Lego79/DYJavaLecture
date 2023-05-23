package ep24_interface.tvAndRadio;


public class TvAndRadioApp {
	
	public static void main(String[] args) {
	RemoteControl rc;
//	System.out.println("==== televison ====");
//	rc = new Television();
//	rc.turnOn();
//	rc.setVolume(4);
//	rc.turnOff();
//	rc.setMute(true);
//	rc.setTop(false);
//	
	System.out.println("\n==== Radio ====");
	rc = new Radio();	
	rc.turnOn();
	rc.setVolume(7);
	rc.setMute(true);
	rc.setMute(false);
//	rc.turnOff();
//	rc.setMute(false);
//	rc.setTop(true);

	}
	

}
