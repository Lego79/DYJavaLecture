package kartApp;

public class KartApp {

	public static void main(String[] args) {
		
		Kart kart = new Kart("버스트", "Green");
		
		System.out.println("=====ready=====");
		kart.printInfo();
		
		System.out.println("\n=======run=======");
		
		kart.speedUp();
		kart.speedUp();
		kart.pickupBosster();
		kart.pickupBosster();
		kart.useBooster();
		kart.useBooster();
		kart.speedDown();
		kart.speedDown();

	}

}
