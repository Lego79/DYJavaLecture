package practice.car;

public class Company {
	
	private String companyName;
	private String address;
	private String phone;
	
	
	public Company(String companyName, String address, String phone) {

		this.companyName = companyName;
		this.address = address;
		this.phone = phone;
	}


	public String getCompanyName() {
		return companyName;
	}


	public String getAddress() {
		return address;
	}


	public String getPhone() {
		return phone;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public void printInfo() {
		
		System.out.println("회사명 = " + getCompanyName());
		System.out.println("주소 = " + getAddress());
		System.out.println("전화번호 = " + getPhone());
		
	}
	
	

}
