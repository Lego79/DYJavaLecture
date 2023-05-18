package practice.arrayPractice.Lecture;

public class IntArrayApp {
	
	public static void main (String args[]) {
		
		int [] intArray;
		
		intArray = new int[2];
		
		intArray[0] = 1;
		intArray[1] = 2;
		
		int length = intArray.length;
		
		for(int i = 0; i < intArray.length; i++) {
			
			System.out.println(intArray[i] + " for 문 연습");
			System.out.println("intArray" + "[" + intArray[i] + "]" + "for 문 연습");
			
			
		}
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		
		System.out.println("배열길이 = " + length);
		
		System.out.println("intArray[0] " + intArray[0]);
		System.out.println("intArray[1] " + intArray[1]);

		
		
	}

}
