package ep22_abstractClass;

public class PhoneSmartPhoneApp {

	public static void main(String[] args) {
		
		Phone phone = new Phone("동길"); // 추상클래스 이기 때문에, 객체를 생성할 수 없다
		
		SmartPhone smartPhone = new SmartPhone("길동"); 
		// 스마트폰 클래스는 폰클래스를 상속받아서 폰 클래스에 있는 메서드에와 필드에 접근, 사용이 가능하다
		
		smartPhone.turnOn();
		smartPhone.Internet();
		smartPhone.turnOff();
		
		
		
	}

}
