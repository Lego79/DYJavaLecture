package cp36_ExceptionAppPractice;

public class ExceptionPracticeApp {
	
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		
		System.out.println("App.main()::Start");
		
		Control c = new Control();
		try {
			c.method();	
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("\t\t---- catch : Main.main() ----");
		} finally {
			System.out.println("\t\t---- finally : Main.main() ----");
		}
	
		
		System.out.println("App.main()::End");
		
	}

}
