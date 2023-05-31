package cp46_ioScanner.crudOperation;

import java.util.List;
import java.util.Scanner;

import cp44_collectionList.bookList.Book;

public class Manager {
	
	private List<Person> personInfo;
	
	public Manager() {
		
	};
	
	

	

	
	
	
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
//	String id = sc.nextLine();
//	String name = sc.nextLine();
//	String age = sc.nextLine();
//	String sex = sc.nextLine();
//	
//	setId(id);
//	setName(name);
//	setAge(Integer.parseInt(age));
//	setSex(sex);
//	
//	
//	System.out.println("1.아이디="+getId());
//	System.out.println(" | 이름="+ getName());
//	System.out.println(" | 나이="+ Integer.toString(getAge()));
//	System.out.println(getSex());

}
