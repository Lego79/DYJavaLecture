package static01.EX01;

public class DateDotUtil {
	
	private static String date;
	
	
	
	public static String dotDate(String data) {
		
		String result;
		
		String year = data.substring(0, 4);
		String month = data.substring(4, 6);
		String date = data.substring(6, 8);
		
		result = year + "." + month + "." + date;
		
		return result;
		
		

	}

}























//String result;
//
//String year = data.substring(0, 4);
//String month = data.substring(4, 6);
//String date = data.substring(6, 8);
//
//result = year + "." + month + "." + date ;
//
//return result;