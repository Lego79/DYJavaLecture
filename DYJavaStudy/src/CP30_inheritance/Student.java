package CP30_inheritance;

public class Student extends Person {
	

	private String hakbun; // 학번
	
	public Student() {
		System.out.println("Student()");
	}
	
	public Student(String name, int age, String hakbun) {
		
		super(name, age); //super name, age가실행되지 않으면 super()가 실행된다
		this.hakbun = hakbun;
		System.out.println("Student(String name, int age, String hakbun)");
	}
	
//	public Student() {
//		System.out.println("Student()");
//	}
	




	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	
	@Override
	public void printInfo() {
		
		System.out.println("student.printInfo -- 스튜던트 메소드 오버라이드");
		System.out.print("이름 =" + getName());
		System.out.print("나이 =" + getAge());
		System.out.print("학번 =" + hakbun);
		
	}
	

}
