package calc2;

public class CalculatorApp {
	
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator(6, 10);
		
		cal.plus();
		cal.minus();
		cal.multiply();
		cal.divide();
		cal.rest();
		
		cal.printInfo();
		cal.clear();
		cal.printInfo();
	
		
		
		
//		cal.plus();
//		cal.minus();
//		cal.multiply();
//		cal.divide();
//		cal.rest();
		

	}

}
