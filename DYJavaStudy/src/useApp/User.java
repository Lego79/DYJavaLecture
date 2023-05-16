package useApp;

public class User {
	
	String name;
	int age;
	float height;
	char sex;
	boolean marriage;


	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public float getHeight() {
		return height;
	}

	public char getSex() {
		return sex;
	}

	public boolean isMarriage() {
		return marriage;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public void setMarriage(boolean marriage) {
		this.marriage = marriage;
	}

	public User() {
		
		this.name = "unknowon";
		this.age = 0;
		this.height = 0;
		this.sex = 'a';
		this.marriage = false;
	}
	
	public User(String name, int age, char sex) {
		
		this.name = name;
		this.age = age;
		this.sex = sex;

	}
	
	public User(String name, int age, float height, char sex, boolean marriage) {
		
		this.name = name;
		this.age = age;
		this.height = height;
		this.sex = sex;
		this.marriage = marriage;
	}
	
	public void printInfo() {
		
		System.out.println("====== User Info =======");
		
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
		System.out.println("키 :" + getHeight());
		
		if(sex == 'M') {
			System.out.println("성별 : 남자");
		} else {
			System.out.println("성별 : 여자");
		}		
	
		if(marriage) {
			System.out.println("결혼 여부 : 기혼");
		} else {
			System.out.println("결혼 여부 : 미혼");
		}
		
	}
	
		

}
