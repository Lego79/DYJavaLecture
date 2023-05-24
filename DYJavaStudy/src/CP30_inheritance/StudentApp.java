package CP30_inheritance;

public class StudentApp  {

	public static void main(String[] args) {
		
		
		Student s = new Student();
		s.setName("Lee");
		s.setAge(30);
		s.setHakbun("2023-001");
		System.out.println("\n===== Student =====");
		System.out.print("이름=" + s.getName());
		System.out.print(" | 나이=" + s.getAge());
		System.out.println(" | 학번=" + s.getHakbun());
		
		System.out.println("\n==== private ====");
		// private는 상속되지 않는다
		
//		System.out.println("이름" + s.name); // 에러 - 퍼슨 클레스에 있는 private name 필드이기 때문에 직접 접근이 불가능하다
		
		

	}

}
