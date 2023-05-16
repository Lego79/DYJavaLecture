package payApp;

public class Pay {
	
	int hourPay;

	
	
	
	public Pay() {

	}
	
	public Pay(int hourPay) {

		this.hourPay = hourPay;

	}

	public int getDayPay() {
		return hourPay*8;
	}
	
	public int getWeekPay() {
		return this.getDayPay()*5;
	}
	
	
	public int getYearPay() {
		return getWeekPay()*52;
	}

}
