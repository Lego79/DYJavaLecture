package cp32_polymophiArguments.person;

public class Person {
	
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("\n===== Person =====");
		System.out.print("이름=" + getName());
		System.out.println(" | 나이=" + getAge());
	}
	
	

}
