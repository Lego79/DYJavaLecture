package calc2;

public class Calculator {
	
	int val1;
	int val2;
	
	
	public Calculator(int val1, int val2) {		
		this.val1 = val1;
		this.val2 = val2;
	}
	
	public Calculator() {		
		this.val1 = 0;
		this.val2 = 0;
	}
	


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
	
	
	
	public void plus() {
		System.out.println("plus() :: " + val1 + "+	" + val2 + "="  + (val1 + val2));
	}
	public void minus() {
		System.out.println("minus() :: " + val1 + "-	" + val2 + "="  + (val1 -val2));
	}
	public void multiply() {
		System.out.println("multiply() :: " + val1 + "*	" + val2 + "="  + (val1 *val2));
	}
	public void divide() {
		System.out.println("divide() :: " + val1 + "/	" + val2 + "="  + (val1 /val2));
	}
	public void rest() {
		System.out.println("rest() :: " + val1 + "%	" + val2 + "="  + (val1 % val2));
	}
	
	public void clear() {
		
		val1 =0;
		val2 =0;
	
	}
	
	
	
	public void printInfo() {
		System.out.println("===== print Info ====");
		System.out.println("val1 =" + "" + val1 + "" + "val2 =" + val2);
	}
	
	

	
	
	
	
	
	
	

}
