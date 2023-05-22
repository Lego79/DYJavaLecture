package cp31_inheritanceMethodOverride;

public class AnimalApp {

	public static void main(String[] args) {
		
		Animal a = new Animal("Dog","콩이", 1, "여");
		a.printInfo();
		
		Cat c = new Cat("Cat","나비", 5, "여", 3);
		c.printInfo();
		
		Eagle e = new Eagle("Eagle", "그리", 4, "남", 2);
		e.printInfo();
		e.fly();
		

	}

}
