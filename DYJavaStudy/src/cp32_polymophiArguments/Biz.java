package cp32_polymophiArguments;

public class Biz {

	public void top(Person person) {

		if (person instanceof Person) {
			System.out.println("Person == person");
		} else if (person instanceof Teacher) {
			System.out.println("Teacher == teach");
		} else if (person instanceof Student) {
			System.out.println("Student");
		}

	}

	public void down(Person person) {
		
		Teacher teacher = (Teacher) person;
		
		if (person instanceof Teacher) {
			System.out.println("----- person instanceof Teacher -----");
			System.out.println("이름 : " + person.getName());
			System.out.println("나이 : " + person.getAge());
			System.out.println("과목 : " + person.get());
			
		} else if (person instanceof Student) {
			System.out.println("Student");
		} else if (person instanceof Person) {
			System.out.println("Person");
		}

	}

	public static void staticTop(Person person) {

		person.printInfo();
	}
}
