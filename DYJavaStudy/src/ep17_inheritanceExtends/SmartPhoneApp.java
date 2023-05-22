package ep17_inheritanceExtends;

public class SmartPhoneApp {

	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		
		System.out.println("모델: " + myPhone.model );
		System.out.println("모델: " + myPhone.color );
		
		System.out.println("와이파이 상태: " + myPhone.wifi);
		
//		myPhone.bell();
//		myPhone.sendVoice("여보세요?");
//		myPhone.recieveVoice("안녕하세요 저는 홍아무개입니다");
//		myPhone.sendVoice("아~ 네, 반갑습니다");
//		myPhone.hangUp();
//		
//		myPhone.setWifi(false);
//		myPhone.internet();

	}

}
