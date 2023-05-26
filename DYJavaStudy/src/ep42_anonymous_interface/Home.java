package ep42_anonymous_interface;

public class Home {

	private RemoteControl rc = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("Tv를 켭니다");
		}

		@Override
		public void turnOff() {
			System.out.println("Tv를 끕니다");
		}
	};

	public void Use1() {

		rc.turnOn();
		rc.turnOff();
	}

	public void Use2() {

		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다");
			}

			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다");
			}
		};
		rc.turnOn();
		rc.turnOff();

	}
	
	public void use3(RemoteControl rc) {
		
		rc.turnOn();
		rc.turnOff();
		
	}

}
