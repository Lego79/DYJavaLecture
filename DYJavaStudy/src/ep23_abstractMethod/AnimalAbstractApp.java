package ep23_abstractMethod;

public class AnimalAbstractApp {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.sound();
		
		Dog dog = new Dog();
		dog.sound();
		
		animalSound(dog);
		animalSound(cat);
		
		
		


	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	

}
