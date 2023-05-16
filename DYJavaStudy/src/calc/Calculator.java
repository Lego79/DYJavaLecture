package calc;

public class Calculator {
	
	private int val1 =0;
	private int val2 =0;
	
	
	

	
	public int getVal1() {
		return val1;
	}
	public int getVal2() {
		return val2;
	}
	public void setVal1(int val1) {
		this.val1 = val1;
	}
	public void setVal2(int val2) {
		this.val2 = val2;
	}
	
	
	public void plus(int val1, int val2) {
		System.out.println("plus() :: " + val1 + "+	" + val2 + "="  + (val1 + val2));
	}
	public void minus(int val1, int val2) {
		System.out.println("minus() :: " + val1 + "-	" + val2 + "="  + (val1 + val2));
	}
	public void multiply(int val1, int val2) {
		System.out.println("multiply() :: " + val1 + "*	" + val2 + "="  + (val1 + val2));
	}
	public void divide(int val1, int val2) {
		System.out.println("divide() :: " + val1 + "/	" + val2 + "="  + (val1 + val2));
	}
	public void rest(int val1, int val2) {
		System.out.println("rest() :: " + val1 + "%	" + val2 + "="  + (val1 + val2));
	}
	
	public void printInfo() {
		
	}

	

}
