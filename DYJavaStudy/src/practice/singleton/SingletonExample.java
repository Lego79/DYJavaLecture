package practice.singleton;

public class SingletonExample {

	public static void main(String[] args) {
		
		/*
		Singleton obj1 = new Singleton();
		Singleton obj2 = new Singleton();  
		컴파일 에러
		*/
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1==obj2) {
			System.out.println("둘이 같은 싱글톤 객체다");
		} else {
			System.out.println("둘이 같은 싱글톤 객체다");
		}
		
		

	}

}
