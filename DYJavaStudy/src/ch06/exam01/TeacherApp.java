package ch06.exam01;

public class TeacherApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher t1 = new Teacher();
		t1.setAge(20);
		t1.setName("lee");
		t1.setLesson("Music");
		
//		t1.printInfo();
		
		t1.getAge();
		t1.getName();
		t1.getLesson();
		
		System.out.println(t1.getAge()+ "	" + t1.getName() + "	" + t1.getLesson());


	}

}
