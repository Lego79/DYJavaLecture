package cp42_genericMethodUsingType;

public class App {

	public static void main(String[] args) {
		
		Biz biz = new Biz();
		
		System.out.println("명시적 방법");
		// 메서드명 앞에 타입지정
		Integer i = biz.<Integer>biz(100);
		System.out.println(i);
		
		System.out.println("\n 묵시적 방법");
		//메서드 명 앞에 타입을 지정하지 않음
		String str = biz.biz("Hello");
		System.out.println(str);

	}

}
