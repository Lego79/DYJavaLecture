package galaxy23ultra;

public class MobilePhone {
	
	
	String company;
	String product;
	String os;
	String color;
	boolean pen;
	int memory;
	int stroage;
	int battery;
	
	public MobilePhone() {
		super();
		this.company = "unknown";
		this.product = "unknown";
		this.os = "unknown";
		this.color = "unknown";
		this.pen = false;
		this.memory = 0;
		this.stroage = 0;
		this.battery = 0;
	}
	
	public void printInfo() {
		System.out.println(company);
		System.out.println(product);
		System.out.println(os);
		System.out.println(color);		
		System.out.println(memory + "" + "(GB)");
		System.out.println(stroage + "" + "(GB)");
		System.out.println(battery + "" + "(mAh)");
		if(pen == true) {
		System.out.println("펜" + ":" + "지원");
		} else {
			System.out.println("펜" + ":" + "미지원");
		}
		
		
	}
	

}
