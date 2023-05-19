package cp27_bookStroeArray.entity;

public class Shirt {
	
	private String name;
	private String Color;
	private String company;
	private String materials;
	private String size;
	private int price;
	
	
	


	public Shirt(String name, String color, String company, String materials, String size, int price) {
		super();
		this.name = name;
		this.Color = color;
		this.company = company;
		this.materials = materials;
		this.size = size;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return Color;
	}

	public String getCompany() {
		return company;
	}

	public String getMaterials() {
		return materials;
	}

	public String getSize() {
		return size;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		Color = color;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setMaterials(String materials) {
		this.materials = materials;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

}
