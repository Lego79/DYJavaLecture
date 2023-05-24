package ep29_throwExcecption;

public class ThrowsExampleApp {

	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			
			System.out.println("예외처리" + e.toString());
			
		}

	}
	
	
	public static void findClass() throws ClassNotFoundException {
		
		
		Class.forName("Java.lang.String2");
		
	}

}
