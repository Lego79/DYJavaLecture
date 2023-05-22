package ep17_inheritanceExtends;

public class SmartPhone extends Phone {
	
	public boolean wifi;
	
	public SmartPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
		System.out.println("스마트폰 스트링모델 스트링 컬러 생성자 실행");
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다");
		
	}

		
	public void internet() {
		System.out.println("인터넷을 연결합니다");
	}

}

