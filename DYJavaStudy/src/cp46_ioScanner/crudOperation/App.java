package cp46_ioScanner.crudOperation;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
		Scanner sc = new Scanner(System.in);
		
		boolean whileLoop = true;
		while(whileLoop) {
			
			try {
				System.out.println("========= [메뉴 선택] =========");
				System.out.println("1. 전체 출력");
				System.out.println("2. 등록");
				System.out.println("3. 수정");
				System.out.println("4. 삭제");
				System.out.println("5. 조회(성별)");
				System.out.println("6. 조회(나이 구간)");
				System.out.println("9. 종료");
				String menu = sc.nextLine();
				
				switch(menu) {
				case "1":
					System.out.println("[전체 출력]");
					manager.printPersonList();
					break;
				case "2":
					System.out.println("[등록]");
					manager.addPerson(sc);
					break;	
					
				
				case "9":
					System.out.println("[종료]");
					System.out.println("프로그램을 종료합니다.");
					whileLoop = false;
					break;
					
				default:
					System.out.println("잘못선택하셨습니다");
				}
			} catch(Exception e) {}
			
		}

	}

}
