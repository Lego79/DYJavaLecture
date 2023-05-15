package ch06.exam01;

public class Teacher {

	private int age;
	
	private String name;
	
	private String lesson;
	
	public Teacher() {
		super();
		this.age = age;
		this.name = name;
		this.lesson = lesson;
	}
	
	

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLesson() {
		return lesson;
	}


	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	
	public void printInfo() {
		
		System.out.println("====== TEACHER INFO =======");
		System.out.println(name);
		System.out.println(age);
		System.out.println(lesson);
		
	}
	

}
