package shirts;

public class Shirt {
	
	String name;
	String Color;
	String company;
	String materials;
	String size;
	int price;
	
	
	
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
	
	
	public Shirt() {

	}
	
	


	
	public Shirt(String name, String color, String company, String materials, String size, int price) {
		this.name = name;
		Color = color;
		this.company = company;
		this.materials = materials;
		this.size = size;
		this.price = price;
	}

	public Shirt(String name, String color, int price) {
		this.name = name;
		Color = color;
		this.price = price;
	}
	
	public Shirt(String name, String color, String company, String materials) {
		this.name = name;
		Color = color;
		this.company = company;
		this.materials = materials;

	}
	
	public void printInfo() {
		
		System.out.println("======= shirt Info ========");
		System.out.println("이름 : " + getName());
		System.out.println("컬러 : " + getColor());
		System.out.println("회사 : " + getCompany());
		System.out.println("소재 : " + getMaterials());
		System.out.println("사이즈 : " + getSize());
		System.out.println("가격 : " + getPrice());
	}
	
	
	

}
