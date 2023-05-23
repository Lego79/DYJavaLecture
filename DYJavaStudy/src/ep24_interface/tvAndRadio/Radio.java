package ep24_interface.tvAndRadio;

public class Radio implements RemoteControl {
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Radio를 켜라");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Radio를 꺼라");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOULME) {
			this.volume = RemoteControl.MAX_VOULME;
		} else if(this.volume < RemoteControl.MIN_VOULME) {
			this.

			volume = RemoteControl.MIN_VOULME;
		} else {
			volume = this.volume;
			
		}
		
		
		System.out.println("현재 Radio 볼륨: " + this.volume);
	}
	
	private int memoryVolume;
	
	@Override
	public void setMute(boolean mute) {
		
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(RemoteControl.MIN_VOULME);
		} else {
			System.out.println("무음 해제합니다.");
			setVolume(this.memoryVolume);
			
		}
		
	}
	

}
