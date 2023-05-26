package ep43_threadMulti;

import cp24_Array.movie.car.CarChart;

public class ThreadNameExample {
	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + "실행");
		
		for(int i =0; i<3; i++) {
			
			Thread threadA = new Thread() {
				@Override
				public void run() {
					
					System.out.println(getName() + "실행");
					try {Thread.sleep(1000000);} catch(Exception e) {}
					
					
				}				
			};	
			threadA.start();
		}
		
		
		Thread chatThread = new Thread() {
			
			
			@Override
			public void run() {
				
				System.out.println(getName() + "실행");		
				try {Thread.sleep(100000);} catch(Exception e) {}
			} 
			
		};
		chatThread.setName("chat-thread");
		chatThread.start();
		
		
		
	}

}
