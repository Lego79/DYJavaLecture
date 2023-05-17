package kartApp;

public class Kart {
	
	String name;
	String color;
	int booster;
	int speed;
	
	
	
	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getBooster() {
		return booster;
	}

	public int getSpeed() {
		return speed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setBooster(int booster) {
		this.booster = booster;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Kart(String name, String color, int booster, int speed) {
		this.name = name;
		this.color = color;
		this.booster = booster;
		this.speed = speed;
	}

	public Kart(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public void printInfo() {
		System.out.println("[버스트(Green)]");
		System.out.println("SpeedUp 증가 속도 : 40(km)");
		System.out.println("SpeedDown 감소 속도 : 80(km)");
		System.out.println("카트 최대 속도 : 150(km)");
		System.out.println("부스터 사용시 증가 속도 : 100(km)");
		System.out.println("부스터 최대 개수 : 1(개)");
		
	}
	
	public void speedUp() {
		
		speed = getSpeed() + 40;
		if(speed >= 150)
			speed = 150;
		System.out.println("[" + name + "(" + color + ")]" + "speedUP : speed : " + speed + "(km) " + "부스터 :" + getBooster() + "(개)");
		
	}
	
	public void pickupBooster () {
		
		
		if(booster == 1) {}
		
	}
	
	
		
		
}
	
	
	


//public void useBooster() {
//
//
//
//    if (booster == 1) {
//        speed += 100;
//        if(speed >= 150)
//            speed = 150;
//            booster = 0;
//        System.out.println("[" + name + "(" + color + ")]" + "useBooster : speed : " + speed + "(km)" + ":" + "booster :" +  booster + ":(piece)");
//    } else {
//        System.out.println("[" + name + "(" + color + ")]" + "useBooster : speed : " + speed + "(km)" + ":" + "booster :" + booster + ":(piece)" + "No Booster");
//    }
//}
//
//public void speedDown() {
//
//    speed -= 80;
//    if(speed < 0) {
//        speed = 0;
//        booster = 0;
//        System.out.println("[" + name + "(" + color + ")]" + "speedDown : speed : " + speed + "(km)" + ":" + "booster :" + booster + ":(piece)");
//    } else {
//        System.out.println("[" + name + "(" + color + ")]" + "speedDown : speed : " + speed + "(km)" + ":" + "booster :" + booster + ":(piece)");
//    }
//}
//
//}
//
//
