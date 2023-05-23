package ep24_interface.tvAndRadio;

public interface RemoteControl {

	
	int MAX_VOULME = 10;
	int MIN_VOULME = 0;
	
	
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음이다");
			setVolume(MIN_VOULME);
		} else {
			System.out.println("무음해제다");
		}
		
	}
	
	default void setTop(boolean neflix) {
		if(neflix) {
			System.out.println("netflix로 전환합니다");
		} else {
			System.out.println("olleh tv로 전환합니다");
		}
	}
	
	
	
	
	

}
