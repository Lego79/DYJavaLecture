package reportCard;

public class ReportCaradApp {

	public static void main(String[] args) {
		System.out.println("\n ==== object 1 ====");
		int korean1 = 96;
		int english1 = 82;
		int math1 = 78;
		
		ReportCard rc1 = new ReportCard("VICTORIA", korean1, english1, math1);
		
		int sum1 = rc1.sum();
		System.out.println("sum=" + sum1);
		int average1 = rc1.average();
		System.out.println("average=" + average1);
		char hakjum1 = rc1.hakjum();
		System.out.println("hakum=" + hakjum1);
		

	}

}
