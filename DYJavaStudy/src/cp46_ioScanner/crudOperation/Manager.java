package cp46_ioScanner.crudOperation;

import java.util.Scanner;

public class Manager {
	
	private String id;
	private String name;
	private int age;
	private String sex;
	
	public Manager() {};
	
	
	public Manager(String id, String name, int age, String sex) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getSex() {
		return sex;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSex(String sex) {

		
		this.sex = sex;
	}
	
	public void printInfo() {
		System.out.println(getId());
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getSex());	
		}
	
	public void printPersonList() {

		System.out.println(getId());
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getSex());
		
	}
	
	
	
	public void addPerson(Scanner sc) {
		String id = sc.nextLine();
		String name = sc.nextLine();
		String age = sc.nextLine();
		String sex = sc.nextLine();
		
		setId(id);
		setName(name);
		setAge(Integer.parseInt(age));
		setSex(sex);
		
		
		System.out.println("1.아이디="+getId());
		System.out.println(" | 이름="+ getName());
		System.out.println(" | 나이="+ Integer.toString(getAge()));
		System.out.println(getSex());
		
	}

}
