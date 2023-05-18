package practice.arrayPractice.Lecture.personArray;

public class WeekIntent {

	public static void main(String[] args) {
		
		String dayString = "일,월,화,수,목.금,토";
				
		int length = dayString.length();
		
		
		
		for(int i = 0; i < length; i += 2) {
			
			int j=0;
			while(j < i) {
				System.out.print("\t");
				j +=2;
			}
			
			
									
			
			System.out.println(dayString.charAt(i) + "요일while");
			
		}
		
		for(int i = 0; i < length; i += 2) {
			
			for(int j = 0; j < i; j+=2) {
				System.out.print("\t");
			}
			
										
			
			System.out.println(dayString.charAt(i) + "요일for");
			
		}



	}
}


