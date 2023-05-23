package ep24_interface;

public class RemoteApp {

	public static void main(String[] args) {
		
		RemoteControl rc;
		rc = new Televesion();
		
		rc.turnOn();
		
		
		rc = new Audio();
		rc.turnOn();
		
		System.out.println("리모콘 최대볼륨" + RemoteControl.MAX_VOLUME);
		System.out.println("리모콘 최저볼륨" + RemoteControl.MIN_VOLUME);

	}

}
