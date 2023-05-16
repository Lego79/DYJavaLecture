package payApp;

public class PayApp {

	public static void main(String[] args) {
		
		int hourPay = 9620;
		
		Pay p = new Pay(hourPay);
		
		System.out.println("\n====하루급여=====");
		
		int daypay = p.getDayPay();
		System.out.println("급여= " + daypay);
		
		System.out.println("\n====주급여=====");
		
		int weekPay = p.getWeekPay();
		System.out.println("급여= " + weekPay);
		
		System.out.println("\n====연급여=====");
		
		int yearPay = p.getYearPay();
		System.out.println("급여= " + yearPay);

	}

}
