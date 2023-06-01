package cp46_ioScanner.cafeScanner;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Menu {
	
	private int id;
	private String category;
	private String name;
	private int price;
	

		
		public Menu() {

		}
		
		
	
	
	
	public Menu(int id, String category, String name, int price) {
		this.id = id;
		this.category = category;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public String getCategory() {
		return category;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	DecimalFormat df = new DecimalFormat("#,###");
	
	public void printInfo() {
		System.out.print(category + " : ");
		System.out.print(name + " ");
		System.out.println(df.format(price) + "(원)" );
		
	}
	
}
	

	


	
	
	

	

	


