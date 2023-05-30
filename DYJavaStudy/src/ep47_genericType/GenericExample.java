package ep47_genericType;

public class GenericExample {

	public static void main(String[] args) {
		
		Product<Tv, String> product1 = new Product<Tv, String>();
		
		product1.setKind(new Tv());
		product1.setModel("스마트 티비");
		
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("SUV 자동차");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		System.out.println(product2.getModel());
		
		
		//제네릭
		
		//제네릭 타입으로 선언한 클래스가 있다
		
		// product에는 두가지 제네릭 타입 파라미터를 지정햇다
		
		// 첫번째에 클래스든, 스트링이든, 인티져든 뭐든 올 수 있다
		
		//
		
		Product<Tv, String> smartTv = new Product<>();
		smartTv.setKind(new Tv());
		smartTv.setModel("삼성스마트티비");
		
		Product<String, Tv> smartTv1 = new Product<>();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
