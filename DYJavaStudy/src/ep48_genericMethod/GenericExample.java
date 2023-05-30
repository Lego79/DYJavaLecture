package ep48_genericMethod;

public class GenericExample {
	
	public static <T> Box <T> boxing(T t) {
		
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
		
	}
	
	public static <T> Box <T> boxingg(T t) {
		
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
		
	}

	public static void main(String[] args) {
		
		Box<Integer> box3 = boxing(500);
		
		
		Box<Integer> box1 = boxing(100);
		
		int intvalue = box1.getT();
		
		System.out.println(intvalue);
		
		Box<String> box2 = boxing("길동");
		
		String strValue = box2.getT();
		System.out.println(strValue);
		
		
		
	}

}
