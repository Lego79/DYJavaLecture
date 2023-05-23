package cp32_polymophiArguments.person;

public class Student extends Person {
	
	private String hakbun;

	public Student(String name, int age, String hakbun) {
		super(name, age);
		this.hakbun = hakbun;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	
	public void printInfo() {
		System.out.println("\n===== Person =====");
		System.out.print("이름=" + getName());
		System.out.print(" | 나이=" + getAge());
		System.out.print(" | 학번=" + getHakbun());
	}
	

}
