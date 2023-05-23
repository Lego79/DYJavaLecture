package ep25_multi_Interface;

public class SmartTelevision implements RemoteControl, Searchable {
	
	
	@Override
	public void turnOn() {
		
		System.out.println("TV를 켭니다");
		
	}
	
	@Override
	public void turnOff() {
		
		System.out.println("TV를 끕니다");
		
	}
	
	public void search(String url) {
		
		System.out.println(url + "을 검색합니다");
		
	}
	
	
	
	

}
