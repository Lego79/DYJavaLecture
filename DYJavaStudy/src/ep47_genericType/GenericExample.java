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

	}

}
