package practice.arrayPractice.textBook;

public class arrayLength {
	
	public static void main (String args[]) {
		
		String[] subject = new String[6];
		
		subject[0] = "국어";
		subject[1] = "수학";
		subject[2] = "영어";
		subject[3] = "국사";
		subject[4] = "과학";
		subject[5] = "사회";
		
		for(int i = 0; i < subject.length; i++ ) {
			
			System.out.println(subject[i]);
			
		}
		
		
	}

}
