package cp27_bookStroeArray.service;


import cp27_bookStroeArray.entity.Shirt;

public class ShirtService {
	
public static Shirt makeShirt(String name, String color, String company, String materials, String size, int price) {
		
		return new Shirt(name, color, company, materials, size, price);
	}

}
