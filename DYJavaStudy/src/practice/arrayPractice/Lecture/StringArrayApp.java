package practice.arrayPractice.Lecture;

public class StringArrayApp {

	public static void main(String[] args) {
		
		int[] num = new int[3];
		String[] str = new String[3];
		
		num[0] = 0;
		num[1] = 1;
		num[2] = 2;
		
		str[0] = "Hello";
		str[1] = "World";
		str[2] = "Welcome";
		
		int strLength = str.length;
		
		for(int i=0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println("배열길이=" + strLength);
		
		for(int i=0; i < str.length; i++) {
			System.out.println("stringArray[" + num[i] + "]" + str[i]);
		}
		
		int i = 0;
		
		while( i > str.length) {
			
			System.out.println(str[i] + "와일연습");
			
		}
		

	}

}
