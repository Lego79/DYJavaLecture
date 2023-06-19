package ep5.anonymous;

public class App {

	public static void main(String[] args) {

		System.out.println("===== Variable =====");
		System.out.println("\n----- implements Interface -----");
		
		Beer beer = new Beer();
		beer.drink();
		
		Soda soda = new Soda();
		soda.drink();
		
		Water water = new Water();
		water.drink();


		System.out.println("\n----- Anonymous -----");
		// �͸� Ŭ������ Beer, Soda, Water Ŭ������ �������� �ʴ´�.
		Drink beer1 = new Drink() {
			
			@Override
			public void drink() {
				System.out.println("���ָ� ���ô�");
				
			}
		};
		beer1.drink();
		
		Drink soda1 = new Drink() {
			
			@Override
			public void drink() {
				System.out.println("�Ҵٸ� ���ô�");
			}
		};
		soda1.drink();
		
		Drink water1 = new Drink() {
			
			@Override
			public void drink() {
				System.out.println("���� ���ô�");
			}
		};
		water1.drink();


		System.out.println("\n===== Method =====");
		System.out.println("\n----- implements Interface -----");
		
		Biz b = new Biz();
		b.biz(new Drink() {
			
			@Override
			public void drink() {
				System.out.println("커피를 마시다");
				
			}
		});



		System.out.println("\n----- Anonymous -----");



	}

}

