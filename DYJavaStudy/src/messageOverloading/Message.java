package messageOverloading;

public class Message {
	
	int sum = 0;
	
	public void printInfo(String str) {
		
		System.out.println(str);
		
	}
	
	public void printInfo(int x) {
		System.out.println(x);
	}
	
	public void printInfo(String str, int x) {
		
		System.out.println(str + "," + x);
		
	}
	
	public void printInfo(int x, String str) {
		System.out.println(x + "," + str);
	}
	
	public int printInfo(int a, int b) {
		
		sum = a + b;
		
		System.out.println(sum);
		
		return sum;		
		
	}
	
	public double printInfo(double a, double b) {
		
		double sum = a - b;
		
		return sum;
		
	}
	


	
	

}
