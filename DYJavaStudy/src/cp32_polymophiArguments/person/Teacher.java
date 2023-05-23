package cp32_polymophiArguments.person;

public class Teacher extends Person {
	
	private String lesson;

	public Teacher(String name, int age, String lesson) {
		super(name, age);
		this.lesson = lesson;
	}

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	
	public void printInfo() {
		System.out.println("\n===== Person =====");
		System.out.print("이름=" + getName());
		System.out.print(" | 나이=" + getAge());
		System.out.print(" | 과목=" + getLesson());
	}
	

}
