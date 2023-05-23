package cp32_polymophiArguments;

public class PolyApp {

	public static void main(String[] args) {
		
		Person p = new Person("Paige", 20);
		Student s = new Student("James", 30 , "2023-001");
		Teacher t = new Teacher("Victoria", 40, "Music");
		
		Biz biz = new Biz();
		
		
//		System.out.println("===== Polymorphic Argument =====");
//		//매개변수 타입으로 자동 타입변환
//		//non-static, static 모두 적용
//		
//		System.out.println("\n----- non-static method -----");
//		biz.top(p);
//		biz.top(s);
//		biz.top(t);
//		
//		
//		System.out.println("\n----- static method -----");
//		Biz.staticTop(p);
//		Biz.staticTop(s);
//		Biz.staticTop(t);
//		
//		System.out.println("\n===== down() =====");
		
		System.out.println("\n----- top -----");
		biz.top(p);
		biz.top(s);
		biz.top(t);
		
		
		System.out.println("\n----- down -----");
		biz.down(p);
		biz.down(s);
		biz.down(t);

	}

}
