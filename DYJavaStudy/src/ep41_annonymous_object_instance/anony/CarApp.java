package ep41_annonymous_object_instance.anony;

public class CarApp {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.run1();
		
		car.run2();
		
		car.run3(new Tire() {
			
			@Override
			public void roll() {
				System.out.println("익명자식 타이어 3이 굴러갑니다");
			}
			
		});

	}

}
