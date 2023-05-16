package kartApp;

public class Kart {
	
	String name;
	String color;
	int booster;
	int speed;
	
	
	
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
		
		speed += 40;
		if(speed >= 150) 
			speed = 150;
				
		System.out.println("속도 :" + speed +  "부스터 : 0(개)");
				
	}
	
	public void pickupBosster() {
		
		booster += 1;
		
		if(booster == 1) {
			
			System.out.println("속도 :" + speed + "부스터 : " + booster + "(개)");
		} else {
			
				booster = 1;
			System.out.println("속도 :" + speed + "부스터 : " + booster + "(개)" + " : 부스터를 더 이상 추가할 수 없습니다.");
		}
		
		
		
		

		
	}
	
	public void useBooster() {
		
		
		if(booster == 1) {
			speed += 100;
			if(speed >= 150) 
				speed = 150;
			booster = 0;
			System.out.println("속도 :" + speed + "부스터 : " + booster + "(개)");
		} else {
			System.out.println("속도 :" + speed + "부스터 : " + booster + "(개)" + ": 사용가능한 부스터가 없습니다");
		}
			
		
		
		
		
		
	}
	
	public void speedDown() {
		
	}
	
	
}
