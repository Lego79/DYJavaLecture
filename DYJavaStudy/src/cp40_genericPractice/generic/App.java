package cp40_genericPractice.generic;

public class App {
	
	public static void main(String[] args) {
		
		Biz<Integer> biz1 = new Biz<Integer>();
		biz1.setData(10);
		System.out.println("biz1 data=" + biz1.getData());
		
		Biz<String> biz2 = new Biz<>();
		biz2.setData("Hello");
		System.out.println("biz2 data=" + biz2.getData());
		
		Biz<String> biz3 = new Biz<>();
		biz3.setData("Hello");
		System.out.println("biz2 data=" + biz3.getData());
		
		Biz<Character> biz4 = new Biz<Character>();
		biz4.setData('H');
		System.out.println("biz3 data=" + biz4.getData());

	}

}
