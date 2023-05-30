package cp43_generic_type_multi;

public class App {

	public static void main(String[] args) {
		
		System.out.println("===== GenericP =====");
		System.out.println("----- person -----");
		GenericP<Person> g1 = new GenericP<Person>();
		g1.setField(new Person("Paige", 20));
		g1.getField().printInfo();
		
		System.out.println("===== SuperMan -----");
		GenericP<SuperMan> g2 = new GenericP<SuperMan>();
		g2.setField(new SuperMan("Clark", 25));
		g2.getField().printInfo();
		
		
		System.out.println("\n===== GenericFH =====");
		System.out.println("-----Ufo-----");
		GenericFH<UFO> g10 = new GenericFH<UFO>();
		g10.setField(new UFO("쟁반"));
		g10.getField().printInfo();
		g10.getField().fly();
		g10.getField().hidden();		
		
		System.out.println("\n ===== Generic PFH =====");
		GenericPFH<SuperMan> g21 = new GenericPFH<SuperMan>();
		g21.setField(new SuperMan("Clock", 40));
		g21.getField().printInfo();
		g21.getField().fly();
		g21.getField().hidden();
		}

}
