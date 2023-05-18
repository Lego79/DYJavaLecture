package practice.arrayPractice.Lecture.personArray;

public class PersonArrayApp {

	public static void main(String[] args) {
		
		//선언
		String[] str = new String[3];
		
		
		Person[] personArray = new Person[3];
		
//		Person[] personArray;
//		
//		
//		//생성
//		personArray = new Person[3];
		
		
		//초기화
		personArray[0] = new Person();
		personArray[0].setName("Hong");
		personArray[0].setAge(25);
		
		//2
		personArray[1] = new Person("Lee", 40);
		
		//3
		
		Person p = new Person("Park", 35);
		personArray[2] = p;
		
		//length설정
		int arrayLength = personArray.length;
		
		personArray[0].printInfo();
		personArray[1].printInfo();
		personArray[2].printInfo();
		
		System.out.println("배열길이=" + 3);
		
		System.out.println("\n ==== for() ====");
		for(int i = 0; i < arrayLength; i ++) {			
			System.out.print("personArray[" + i + "] ");
			personArray[i].printInfo();
			
		}
		
		
		

	}

}
