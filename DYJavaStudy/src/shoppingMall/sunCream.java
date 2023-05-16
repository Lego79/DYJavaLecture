package shoppingMall;

public class sunCream {
	
	String company;
	public sunCream(String company, String product, boolean sticky, char type, int capacity, int sFP, String pa) {
		this.company = company;
		this.product = product;
		this.sticky = sticky;
		this.type = type;
		this.capacity = capacity;
		SFP = sFP;
		this.pa = pa;
	}





	String product;
	boolean sticky;
	char type;
	int capacity;
	int SFP;
	String pa;
	
	public sunCream() {		
		this.company = "unknown";
		this.product = "unknown";
		this.sticky = false;
		this.type = 'a';
		this.capacity = 0;
		this.SFP = 0;
		this.pa = "unknown";
	}
	

	

	public void setCompany(String company) {
		this.company = company;
	}


	public void setProduct(String product) {
		this.product = product;
	}


	public void setSticky(boolean sticky) {
		this.sticky = sticky;
	}


	public void setType(char type) {
		this.type = type;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public void setSFP(int SFP) {
		this.SFP = SFP;
	}


	public void setPa(String pa) {
		this.pa = pa;
	}



	
	public String getCompany() {
		return company;
	}


	public String getProduct() {
		return product;
	}


	public boolean isSticky() {
		return sticky;
	}


	public char getType() {
		return type;
	}


	public int getCapacity() {
		return capacity;
	}


	public int getSFP() {
		return SFP;
	}


	public String getPa() {
		return pa;
	}



	
	
	public void printInfo() {
		
		System.out.println("회사:" + "" + getCompany());
		System.out.println("제품:" + "" + getProduct());
		if(sticky) {
			System.out.println("끈적임");
		} else {
			System.out.println("끈적임 없음");
		}
		
		if(type == 's') {
			System.out.println("피부타입 : 민감성");
		} else if (type == 'o') {
			System.out.println("피부타입 : 지성");
		} else if (type == 'n') {
			System.out.println("피부타입 : 중성");
		} else if (type == 'd') {
			System.out.println("피부타입 : 건성");
		}		
				
	
		
		System.out.println("용량:" + "" + getCapacity() + "(ml)");
		System.out.println("SPF:" + "" + getSFP());
		System.out.println("PA:" + "" + getPa());

		
	}
	

}
