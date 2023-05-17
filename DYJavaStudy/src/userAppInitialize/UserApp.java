package userAppInitialize;

public class UserApp {
	
	public static void main(String[] args) {
	
	// 생성자 초기화
		
	
	String name = "lee";
	int age = 20;
	float height = 150.0f;
	char sex = 'M';
	boolean marriageYn = true;
	
	User user = new User(name , age, height , sex, marriageYn);
	
	System.out.println("\n ======printInfo()========");
	user.printInfo();
	


	}

}
