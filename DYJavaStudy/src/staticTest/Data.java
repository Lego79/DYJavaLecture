package staticTest;

public class Data {
	
	private int num;
	private static int count;
	
	public Data() {
		num = num +1;
		count = count +1;
	}
	
	public void printInfo() {
		
		System.out.println("번호 = " + num 
							+"\n 카운트 = " + count);
		
	}

}
