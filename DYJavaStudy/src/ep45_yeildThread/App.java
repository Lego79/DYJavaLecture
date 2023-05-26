package ep45_yeildThread;

public class App {

	public static void main(String[] args) {
		
		WortkThread wortkThreadA = new WortkThread("WortkThreadA");
		WortkThread wortkThreadB = new WortkThread("WortkThreadB");
		wortkThreadA.start();
		wortkThreadB.start();
		
		try{Thread.sleep(5000);} catch(InterruptedException e){}
		wortkThreadA.work = false;
		
		try{Thread.sleep(10000);} catch(InterruptedException e){}
		wortkThreadA.work = true;

	}

}
