package ep17_inheritanceExtends.example02;

public class PhoneApp {

	public static void main(String[] args) {
		
		
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);

	}

}
