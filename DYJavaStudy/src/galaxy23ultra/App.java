package galaxy23ultra;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MobilePhone mp1 = new MobilePhone();
		mp1.company = "삼성전자";
		mp1.product = "Galaxy S23 Ultra";
		mp1.os = "안드로이드";
		mp1.color = "black";
		mp1.pen = true;
		mp1.memory = 12;
		mp1.stroage = 512;
		mp1.battery = 5000;
		
		mp1.printInfo();
		
		MobilePhone mp2 = new MobilePhone();
		mp2.company = "애플";
		mp2.product = "iPhone 14 Pro";
		mp2.os = "ios";
		mp2.color = "gold";
		mp1.pen = false;
		mp2.memory = 8;
		mp2.stroage = 512;
		mp2.battery = 5000;
		
		mp2.printInfo();

	}

}
