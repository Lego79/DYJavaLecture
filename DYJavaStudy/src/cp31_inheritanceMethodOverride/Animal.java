package cp31_inheritanceMethodOverride;

public class Animal {
	
	private String spiecies;
	private String name;
	private int age;
	private String sex;
	
	public String getSpiecies() {
		return spiecies;
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
	public void setSpiecies(String spiecies) {
		this.spiecies = spiecies;
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
	public Animal(String spiecies, String name, int age, String sex) {
		this.spiecies = spiecies;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public Animal(String name, int age, String sex) {		
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public void printInfo() {
		
		System.out.println("\n==== Animal Info ====");		
		System.out.print("동물 = " + spiecies);
		System.out.print(" | 이름 = " + name);
		System.out.print(" | 나이 = " + age);
		System.out.print(" | 성별 = " + sex);		
		System.out.println();
		
	}
	

}
