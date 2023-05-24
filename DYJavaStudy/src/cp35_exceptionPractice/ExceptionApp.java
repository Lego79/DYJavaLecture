package cp35_exceptionPractice;

public class ExceptionApp {
//	
//	public static void calcResult(int result) {
//		
//		int a=10;
//		int b=0;
//		
//		try {
//			
//			System.out.println(a);
//			System.out.println(b);
//			System.out.println(a/b);
//			
//		} catch(ArithmeticException ar) {
//			
//			ar.printStackTrace();
//			
//		} finally {
//			
//			System.out.println("마무리실행");
//			
//		}
//		
//	}

	public static void main(String[] args) {
		
		try {
		int a = 10;
		int b = 0;
		System.out.print("a=" + a);
		System.out.println(" b=" + b);
		
		int result = a / b;
		System.out.println("result=" + result);
		}
		
		catch(ArithmeticException e) {
			System.out.println("==== catch ====");
		} finally {
			System.out.println("==== finally ====");
		}

	}
	
	

}
