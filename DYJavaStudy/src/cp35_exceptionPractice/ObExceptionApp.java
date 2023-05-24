package cp35_exceptionPractice;

public class ObExceptionApp {
	
	public static void main(String[] args) {
		
		try {
		System.out.println("==== Object 1 ====");
		String string1 = "Hello";
		System.out.println(string1.charAt(1));
		} catch(StringIndexOutOfBoundsException e){
			
			System.out.println(e);
			
		}
		
		try {
		System.out.println("==== Object 2 ====");
		String string2 = "1";
		System.out.println(string2.charAt(1));
		} catch(StringIndexOutOfBoundsException a) {
			
		} finally {
			System.out.println("==== finally ====");
		}
		
		System.out.println("==== Object 2 ====");
		String string2 = "12";
		System.out.println(string2.charAt(1));
		
		
	}
	


}
