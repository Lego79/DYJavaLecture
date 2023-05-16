package useApp;

public class UserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User u1 = new User();
		u1.setName("James");
		u1.setAge(30);
		u1.setHeight(178.5f);
		u1.setSex('M');
		u1.setMarriage(true);
		u1.printInfo();
		
		User u2 = new User("Paige", 25, 'w');
		u2.setHeight(175.2f);
		u2.setMarriage(true);
		u2.printInfo();
		
		
		User u3 = new User("Victoria", 30,180.0f, 'W', false);
		u3.printInfo();
		

	}

}
