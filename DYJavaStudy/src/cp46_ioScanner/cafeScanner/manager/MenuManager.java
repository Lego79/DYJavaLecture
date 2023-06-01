package cp46_ioScanner.cafeScanner.manager;


import java.util.Scanner;


import cp46_ioScanner.cafeScanner.service.MenuService;

public class MenuManager {

    public MenuManager() {

    }

    public void menuAll() {

        MenuService menuService = new MenuService();
        Scanner sc = new Scanner(System.in);
        boolean whileLoop = true;

        try {
            while (whileLoop) {
                System.out.println("\n========= [메뉴 관리] =========");
                System.out.println("1. 메뉴 조회");
                System.out.println("2. 메뉴 추가");
                System.out.println("3. 메뉴 수정");
                System.out.println("4. 메뉴 삭제");
                System.out.println("9. 종료");
                System.out.println("메뉴를 선택하세요=>");
                String menuButton = sc.nextLine();

                switch (menuButton) {
                    case "1":
                        System.out.println("메뉴 조회");
                        menuService.printMenu();
                        break;
                    case "2":
                        System.out.println("메뉴 추가");
                        menuService.addMenu();
                        break;

                    case "3":
                        System.out.println("메뉴 수정");
                        menuService.updateMenu();
                        break;

                    case "4":
                        System.out.println("메뉴 삭제");
                        menuService.deleteMenu();
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
        }
    }
}


