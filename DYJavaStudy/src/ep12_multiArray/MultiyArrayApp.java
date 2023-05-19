package ep12_multiArray;

public class MultiyArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] intArray = new int[2][];
		
		intArray[0] = new int[2];
		intArray[1] = new int[3];
		
		intArray[0][0] = 0;
		intArray[0][1] = 3;
		
		intArray[1][1] = 10;
		intArray[1][1] = 11;
		intArray[1][2] = 12;
		
		System.out.println("\n ===== intArray[0] =====");
		System.out.println("배열길이=" + intArray[0].length);
		
		for(int i = 0; i< intArray[0].length; i++) {
			System.out.println("intArray[" + i +"]=" + intArray[0][i]);
		}
		
		for(int i = 0; i< intArray[0].length; i++) {
			System.out.println("intArray[" + i +"]=" + intArray[1][i]);
		}
		
		for(int i = 0; i< intArray[0].length; i++) {
			for(int j = 0; j < intArray[i].length; j++)
			System.out.println("intArray[" + i +"]=" + intArray[i][j]);
		}
		
		
		
	}

}
