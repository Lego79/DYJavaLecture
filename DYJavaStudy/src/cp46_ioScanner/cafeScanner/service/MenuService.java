package cp46_ioScanner.cafeScanner.service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cp46_ioScanner.cafeScanner.Menu;
import cp46_ioScanner.crudOperation.Person;


public class MenuService {
	
	private List<Menu> menuList; 
	

	
    public MenuService(List<Menu> menuList) {
        this.menuList = menuList;
    }
    
    public MenuService() {
        this.menuList = new ArrayList<>();
    }


	
	 private static final String MENU_FILE_PATH = "C:\\cafeMenu/menu.dat";
	 
		DecimalFormat df = new DecimalFormat("#,###");
	
		public void printMenu() {
		    Scanner sc = null;
		    try {
		        Reader reader = new FileReader(MENU_FILE_PATH);
		        sc = new Scanner(reader);

		        while (sc.hasNextLine()) {
		            String drink = sc.nextLine();
		            String[] field = drink.split(",");
		            int No = Integer.parseInt(field[0]);
		            int price = Integer.parseInt(field[3]);
		            menuList.add(new Menu(No, field[1], field[2], price));   

		            
		        }
	            for(int i = 0; i < menuList.size(); i++) {
	            	System.out.print(menuList.get(i).getId() + ".");
	            	menuList.get(i).printInfo();            	
	            	
	            }
		        

		        reader.close();
		    } catch (IOException e) {
		        e.printStackTrace();
		    } finally {
		        if (sc != null) {
		            sc.close();
		        }
		    }
		}
  

	
  public void addMenu() {
      Scanner sc = new Scanner(System.in);

      try (Writer writer = new FileWriter(MENU_FILE_PATH, true)) {
          System.out.println("메뉴번호를 입력하세요 => ");
          int id = Integer.parseInt(sc.nextLine());

          System.out.println("메뉴 카테고리를 입력하세요(커피,에이드,케이크) => ");
          String category = sc.nextLine();

          System.out.println("메뉴명을 입력하세요 => ");
          String name = sc.nextLine();

          System.out.println("가격을 입력하세요 => ");
          int price = Integer.parseInt(sc.nextLine());

          String menuInfo = id + "," + category + "," + name + "," + price + "\n";
          writer.write(menuInfo);
          
          writer.flush();
          
          writer.close();
          
      } 
      catch (IOException e) {
    	  e.printStackTrace();
      } finally {
    	  sc.close();
      }
  } 
  
	public void updateMenu() {
		
           
          
				
	}	
	
	public void deleteMenu() {
		
		
		
		
		
	}
  
}


