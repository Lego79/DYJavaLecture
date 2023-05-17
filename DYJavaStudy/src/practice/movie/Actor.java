package practice.movie;

public class Actor {
	
	private String name;
	private String sex;
	private String birthdate;
	private String nationlity;
	
	public Actor(String name, String sex, String birthdate, String nationlity) {

		this.name = name;
		this.sex = sex;
		this.birthdate = birthdate;
		this.nationlity = nationlity;
	}
	
	public void printInfo() {
		System.out.println("===== Actor Info ======");
		System.out.println("이름=" + name);
		System.out.println("성별=" + sex);
		System.out.println("생년월일=" + birthdate);
		System.out.println("국적=" + nationlity);		
		
	}
	
	

}
