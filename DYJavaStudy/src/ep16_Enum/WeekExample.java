package ep16_Enum;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUSEDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		
		}
		
		if(today == Week.SUNDAY || today == Week.SATURDAY) {
			
			System.out.println("주말에는 운동을합니다");
			
		} else {
			System.out.println("평일에는 공부나 합니다");
		}

	}

}
