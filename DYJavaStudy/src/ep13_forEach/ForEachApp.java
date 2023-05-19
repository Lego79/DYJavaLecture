package ep13_forEach;

public class ForEachApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] messageArr = {"hello", "world", "welcome"};
		
		System.out.println("==== for ====");
		for(int i = 0; i <messageArr.length; i++) {
			System.out.println(messageArr[i]);
		}
		
		System.out.println("\n==== Advanced for ====");
		for( String str : messageArr) {
			System.out.println(str);
		}

	}

}
