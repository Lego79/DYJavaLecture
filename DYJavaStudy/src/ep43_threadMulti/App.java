package ep43_threadMulti;

import java.awt.Toolkit;

public class App {

	public static void main(String[] args) {
		
		Thread thread = new Thread() {
			
			@Override
			public void run( ) {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for(int i = 0; i < 5; i ++) {
					System.out.println("엥");
					try {Thread.sleep(100);} catch(Exception e) {}
				}
			}
			
			
		};
		
		thread.start();
		for(int i = 0; i < 5; i ++) {
			System.out.println("왕");
			try {Thread.sleep(500);} catch(Exception e) {}
		}

	}

}
