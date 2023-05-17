package kartApp;

public class KartApp {

	public static void main(String[] args) {
		
		Kart kart = new Kart("버스트", "Green", 1, 10);
		
		System.out.println("=====ready=====");
		kart.printInfo();
		
		System.out.println("\n=======run=======");
		
		kart.speedUp();
		kart.speedUp();
//		kart.pickupBooster();
//		kart.pickupBooster();
//		kart.useBooster();
//		kart.useBooster();
//		kart.speedDown();
//		kart.speedDown();

	}

}
