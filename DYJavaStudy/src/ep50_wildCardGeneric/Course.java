package ep50_wildCardGeneric;

public class Course {
	
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName());
	}
	
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println( applicant.kind.getClass().getSimpleName() + "(이)가 course2를 등록함");
	}
	
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println( applicant.kind.getClass().getSimpleName() + "(이)가 course3을 등록함");
	}
	

}
