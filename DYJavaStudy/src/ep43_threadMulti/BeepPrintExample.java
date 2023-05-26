package ep43_threadMulti;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		
		Toolkit tookilt = Toolkit.getDefaultToolkit();
		for(int i = 0; i <5; i++) {
			
			
			System.out.println("웅");//
			
			try {
				Thread.sleep(4500);
			} catch(Exception e) {
				
			}
			
			
		}
		
		for(int i=0; i<5; i ++) {
			System.out.println("띵");
			try{
				Thread.sleep(9000);} catch(Exception e) {}
			
		}

	}

}
