package practice.car;

public class CarApp {

	public static void main(String[] args) {
		
		System.out.println("===== Company Info =====");
		String companyName = "Audi";
		String addres = "독일";
		String phone = "123-4567";
		
		Company company = new Company(companyName, addres, phone);
		company.printInfo();
		
		System.out.println("\n==== Car Info =====");
		String name = "A6";
		String color = "Red";
		int door = 4;
		int maxSpeed = 300;
		
		Car c = new Car(name, color, door, maxSpeed, company);
		c.printInfo();
		

	}

}
