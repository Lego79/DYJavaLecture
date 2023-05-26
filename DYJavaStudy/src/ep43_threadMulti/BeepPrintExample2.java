package ep43_threadMulti;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i = 0; i <5; i++) {
					System.out.println("웅");
					try {Thread.sleep(500);} catch(Exception e) {}
				}
				
			}
		});
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i = 0; i <5; i++) {
					System.out.println("웅");
					try {Thread.sleep(500);} catch(Exception e) {}
				}
				
			}
		});
		
		thread.start();

		for(int i = 0; i <5; i++) {
			System.out.println("띵");
			try {Thread.sleep(100);} catch(Exception e) {}
		}
		
		thread1.start();
		for(int i = 0; i <5; i++) {
			System.out.println("퍽");
			try {Thread.sleep(1300);} catch(Exception e) {}
		}
		
		

		
		
		
	}
	
}
			

