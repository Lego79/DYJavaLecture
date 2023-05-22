package cp29_enum;

public class WorkerApp {

	public static void main(String[] args) {
		
		Worker w1 = new Worker("Rose", 1, Job.WEB_DESIGNER);
		w1.printInfo();
		
		Worker w2 = new Worker("Lebron", 3, Job.WEB_PROGRAMMER);
		w2.printInfo();
		
		Worker w3 = new Worker("Paige", 5, Job.MOBIE_PROGRAMMER);
		w3.printInfo();
	}
	
	

}
