package ep22_abstractClass;

public class PhoneSmartPhoneApp {

	public static void main(String[] args) {
		
	
		
		SmartPhone smartPhone = new SmartPhone("길동"); 
		// 스마트폰 클래스는 폰클래스를 상속받아서 폰 클래스에 있는 메서드에와 필드에 접근, 사용이 가능하다
		
		smartPhone.turnOn();
		smartPhone.Internet();
		smartPhone.turnOff();
		
		
		
	}

}
