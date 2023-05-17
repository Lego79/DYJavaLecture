package practice.songname;

public class Singer {
	
	private String name;
	private char sex;
	private String birthDate;
	private String companyt;
	
	
	public Singer(String name, char sex, String birthDate, String companyt) {

		this.name = name;
		this.sex = sex;
		this.birthDate = birthDate;
		this.companyt = companyt;
	}


	public String getName() {
		return name;
	}


	public char getSex() {
		return sex;
	}


	public String getBirthDate() {
		return birthDate;
	}


	public String getCompanyt() {
		return companyt;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setSex(char sex) {
		this.sex = sex;
	}


	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}


	public void setCompanyt(String companyt) {
		this.companyt = companyt;
	}
	
	
	public void printInfo () {
		
		System.out.println("이름=" + getName());
		System.out.println("성별=" + getSex());
		System.out.println("생년월일=" + getBirthDate());
		System.out.println("소속사=" + getCompanyt());
		
	}
	
	

}
