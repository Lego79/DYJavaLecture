package cp46_ioScanner.switchWhile;

import java.util.Scanner;

public class WhileSwitchApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean whileLoop = true;
		
		while(whileLoop) {
			
			System.out.println("\n0~9 사이의 숫자를입력하세요.");
			System.out.print("9는 프로그램 종료입니다. =>");
			String choice = sc.nextLine();
			
			switch(choice) {
			case "9":
				System.out.println("종료를 선택했다");
				whileLoop = false;
				break;
				
			default:
				System.out.println("계속 진행한다");
				break;
			}
			
			
		}
		sc.close();
		System.out.println("===== End =====");

	}

}
