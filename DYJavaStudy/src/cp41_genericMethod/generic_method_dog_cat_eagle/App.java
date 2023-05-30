package cp41_genericMethod.generic_method_dog_cat_eagle;

public class App {

	public static void main(String[] args) {
		
		System.out.println("===== Class : new Bix<Cat>(new Cat())");
		Biz<Cat> bizCat = new Biz<Cat>(new Cat());
		Cat cat = bizCat.getT();
		cat.printInfo();
		
		System.out.println("\n----- Method : biz(new Eagle()) ------");
		Eagle eagle1 = bizCat.biz(new Eagle());
		eagle1.printInfo();
		
		System.out.println("\n===== Class : new Bix<Cat>(new Dog())");
		Biz<Dog> bizDog = new Biz<Dog>(new Dog());
		Dog dog = bizDog.getT();
		dog.printInfo();
		
		System.out.println("\n----- Method : biz(new Eagle()) -----");
		Eagle eagle = bizDog.biz(new Eagle());
		eagle.printInfo();
		
		

	}

}
