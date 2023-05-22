package ep18_finalClassMethod;

public class SportsCar extends Car {
	
	public void speedUp() {
		
		speed += 10;
		
	}
	
//	@Override
//	public void stop() { //final 메소드이기 때문에 자식클래스에서 재정의 할 수 없습니다
//		
//		System.out.println("스포츠카를 멈춘다");
//		speed = 0;
//		
//	}

}
