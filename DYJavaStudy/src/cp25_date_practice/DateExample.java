package cp25_date_practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date now = new Date();
				
		String now1 = now.toString();
		System.out.println(now1);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss");
		String now2 = sdf.format(now);
		System.out.println(now2);
		
		
		
		
	}

}
