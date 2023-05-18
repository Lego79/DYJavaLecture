package practice.arrayPractice.Lecture;

public class WeekDayApp {

	public static void main(String[] args) {
		
		String [] weekDay = new String[7];
		int [] num = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
		
		
		
		weekDay[0] = "월요일";
		weekDay[1] = "화요일";
		weekDay[2] = "수요일";
		weekDay[3] = "목요일";
		weekDay[4] = "금요일";
		weekDay[5] = "토요일";
		weekDay[6] = "일요일";
		
		int arrayLength = weekDay.length;
		System.out.println("==== for ====");
		
		for(int i = 0; i < arrayLength; i++) {
			
			System.out.println("weekday[" + num[i] + "] " + weekDay[i]);
			
		}	
		

	}

}
