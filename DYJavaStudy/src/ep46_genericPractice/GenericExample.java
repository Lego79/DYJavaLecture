package ep46_genericPractice;

public class GenericExample {

	public static void main(String[] args) {
		
		Box<String> box1 = new Box<>();
		box1.content = "안녕하세요.";
		
		String str = box1.content;
		
		System.out.println(box1.content);
		System.out.println(str);
		
		
		Box<Integer> box2 = new Box<>();
		
		box2.content = 100;
		int num = box2.content;
		
		System.out.println(box2.content);
		System.out.println(num);

	}

}
