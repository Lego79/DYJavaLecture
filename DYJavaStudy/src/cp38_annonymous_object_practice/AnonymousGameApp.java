package cp38_annonymous_object_practice;

public class AnonymousGameApp {

	public static void main(String[] args) {
		System.out.println("===== Archer =====");
		System.out.println("----- Object -----");
		Character archer = new Archer();
		archer.attack();
		
		System.out.println("\n----- Anonymous Object -----");

		
		Character c1 = new Character() {
			
			public void attack() {
				
				System.out.println("c1 원거리공격");
				
			}
			
		};
		c1.attack();
//
//		System.out.println("\n----- Game Attack -----");
		Game game = new Game();
		game.attack(c1);
		game.attack(archer);
		
		
		System.out.println("\n===== Knight =====");
		Character c2 = new Character() {
			
			@Override
			public void attack() {
				System.out.println("근거리 공격");
			}
			
		};
		c2.attack();
		game.attack(c2);
		game.attack(c1);
		
		System.out.println("\n===== Wizard =====");
		Character c3 = new Character() {
			
			@Override
			public void attack() {
				System.out.println("마법 공격");
			}
			
		};	
		
		c3.attack();
		game.attack(c3);
		
		
		System.out.println("\n===== RifleMan =====");
		Character c4 = new Character("제임스", "라이플맨") {
			
			@Override
			public void attack( ) {
				System.out.println("소총 공격");
			}
			
		};
		c4.printInfo();
		c4.attack();
		game.attack(c4);
		
		System.out.println("\n===== 보병 =====");
		Character c5 = new Character("보병1", "보병1")
		 {
			
			
			@Override
			public void attack() {
				
				System.out.println("칼질");
				
			}
			
			
			
		};
		c5.attack();
		
		c5.attack(new Character() {
			
			@Override
			public void attack() {
				System.out.println("보병공격");
			}
			
		});
		c5.attack();
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				
			}
		});
		
	}	
	
	
		
	
}
