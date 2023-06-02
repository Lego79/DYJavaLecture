package cp46_ioScanner.personOperation;
import org.json.JSONObject;

import lombok.Data;

@Data
public class Person {
	
	private String name;// 이름
	private int age; // 나이
	
	//constructor
	public Person() {
		System.out.println("person()");
	}
	
	public Person(String name) {
		
		this.name = name;
		System.out.println("Person(String name)");
		
	}
	
	public Person(int age) {
		
		this.age = age;
		System.out.println("Person(int age)");
		
	}
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		System.out.println("Person(String name, int age)");
		
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void printInfo () {
		
	
		System.out.print("이름= " + name);
		System.out.println(" | 나이= " + age);
		
	}
	

}
