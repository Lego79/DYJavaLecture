package cp40_genericPractice.coffee_menu;

public class GenericCoffeeApp {

	public static void main(String[] args) {
		
		System.out.println(" ===== () =====");
		Box<Coffee> box1 = new Box<Coffee>();
		Coffee coffee = box1.getData();
		System.out.println(coffee);
		
		Box<Ade> box2 = new Box<Ade>();
		Ade ade = box2.getData();
		System.out.println(ade);
		
		System.out.println(" ===== (T t) =====");
		Coffee coffee1 = new Coffee("아메리카노", 3000, "블루마운틴");
		Box<Coffee> box3 = new Box<Coffee>(coffee1);
		Coffee coffee2 = box3.getData();
		coffee2.printInfo();
		
		Ade ade1 = new Ade("레모네이드", 4500, "레몬, 얼음, 시럽");
		Box<Ade> box4 = new Box<>(ade1);
		Ade ade2 = box4.getData();
		ade2.printInfo();
		
		
		
		
	}

}
