package ep12_multiArray;

public class MultiApp {
	
	public static void main(String[] args) {
		
		Person[][] personArray = new Person[2][3];
		
		personArray[0] = new Person[3];
		personArray[1] = new Person[4];
		
		personArray[0][0] = new Person("lee", 30);
		
		System.out.println("\n===== personArray[0] =====");
		System.out.println("\n배열길이=" + personArray[0].length);
		for(int i = 0; i < personArray[0].length; i ++) {
			personArray[0][i].printInfo();
		}
		
		
	}

}
