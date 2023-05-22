package CP30_inheritance;

public class Teacher extends Person{
	

	private String lesson; // 과목
	
	public Teacher() {
		
		System.out.println("Teacher()");
		
	}
	
	public Teacher(String name, int age, String lesson) {
		
		super(name, age);
		this.lesson = lesson;
		System.out.println("Teacher(String name, int age, String lesson)");
		
	}
	
	public Teacher(int age, String lesson) {
		
		super(age);
		this.lesson = lesson;
		System.out.println("Teacher(int age, String lesson)");
		
	}
	

	public void setLesson(String newLesson) {
		lesson = newLesson;
	}

	public String getLesson() {
		return lesson;
	}
	
	@Override
	public void printInfo() {
		System.out.println("----teach method ovrride");
		System.out.print("이름 : " + getName());
		System.out.print("나이 : " + getAge());
		System.out.print("과목 : " + getLesson());
	}

}
