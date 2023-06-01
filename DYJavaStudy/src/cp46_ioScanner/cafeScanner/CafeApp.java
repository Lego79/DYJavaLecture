package cp46_ioScanner.cafeScanner;

import java.util.Scanner;

import cp46_ioScanner.cafeScanner.manager.MenuManager;
import cp46_ioScanner.cafeScanner.manager.OrderManager;

public class CafeApp {

	public void begin() {
		MenuManager menuManager = new MenuManager();
		OrderManager orderManager = new OrderManager();
		boolean whileLoop = true;
		Scanner sc = new Scanner(System.in);

		try {
			while (whileLoop) {
				System.out.println("\n========= [Cafe App] =========");
				System.out.println("1. 메뉴 관리");
				System.out.println("2. 주문 관리");
				System.out.println("9. 종료");
				System.out.println("메뉴를 선택하세요=>");
				String button = sc.nextLine();

				switch (button) {
				case "1":
					System.out.println("메뉴관리");
					menuManager.menuAll();
					break;
				case "2":
					System.out.println("주문관리");
					orderManager.orderAll();
					break;
				case "9":
					System.out.println("[종료]");
					System.out.println("프로그램을 종료합니다.");
					whileLoop = false;
					break;
				default:
					System.out.println("잘못선택하셨습니다");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

}

// 메뉴를 파일에서 읽어들여야 한다
// 메뉴를 관리하는 섹션
// 주문을 관리하는 섹션
