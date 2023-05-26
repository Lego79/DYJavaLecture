package ep45_yeildThread;

public class WortkThread extends Thread{ 
	
	public boolean work = true;
	
	public WortkThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName() + ": 작업처리");
			} else {
				Thread.yield();
			}
		}
	}

}
