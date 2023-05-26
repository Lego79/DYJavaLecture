package ep42_anonymous_interface;

public class HomeApp {

	public static void main(String[] args) {
		
		Home home = new Home();
		
		home.Use1();
		
		home.Use2();
		
		home.use3(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("난방을 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("난방을 끕니다.");
			}
		});
		
		home.use3(new RemoteControl() {
			
			@Override
			public void turnOn() {
			}
			
			@Override
			public void turnOff() {
			}
		});
		

	}

}
