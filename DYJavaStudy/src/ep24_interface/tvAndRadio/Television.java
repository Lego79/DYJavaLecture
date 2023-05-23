package ep24_interface.tvAndRadio;

public class Television implements RemoteControl{
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켜라");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 꺼라");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOULME) {
			this.volume = RemoteControl.MAX_VOULME;
		} else if(volume < RemoteControl.MIN_VOULME) {
			this.volume = RemoteControl.MIN_VOULME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("현재 tv 볼륨: " + this.volume);
	}

}
