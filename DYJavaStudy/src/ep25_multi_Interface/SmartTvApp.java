package ep25_multi_Interface;

public class SmartTvApp {

	public static void main(String[] args) {
		
		RemoteControl rc = new SmartTelevision();
		rc.turnOn();
		rc.turnOff();
		
		
		Searchable searchable = new SmartTelevision();
		searchable.search("https://www.naver.com");
		
		
						
				
	}
}
