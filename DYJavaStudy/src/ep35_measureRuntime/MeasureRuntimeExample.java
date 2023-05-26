package ep35_measureRuntime;

public class MeasureRuntimeExample {

	public static void main(String[] args) {
		
		
		long time1 = System.nanoTime();
		
		int sum = 0;
		
		for (int i=0; i <=1000000000; i++) {
			sum +=i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println(time2 - time1 + "만큼 시간 소모");
		

	}

}
