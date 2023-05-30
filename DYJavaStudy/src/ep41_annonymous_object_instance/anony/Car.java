package ep41_annonymous_object_instance.anony;

public class Car {
	
	Tire tire1 = new Tire();
	
	Tire tire2 = new Tire() {
		
		@Override
		public void roll() {
			System.out.println("익명자긱객체 1번 타이어가 굴러갑니다");
		}
		
	};
	
	public void run1() {
		
		tire1.roll();
		tire2.roll();
		
	}
	
	public void run2() {
		Tire tire = new Tire() {
			
			@Override
			public void roll() {
				System.out.println("익명자식객체 2번 타이어가 굴러갑니다");
			}
		};
		tire.roll();		
		
	};
	
	
	public void run3(Tire tire) {
		
		tire.roll();
		
	}
	
}
