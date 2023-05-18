package cp26_dateOrder;

public class OrderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Menu[] order = new Menu[3];
		
		order[0] = new Menu("빅맥세트", 5500);
		order[1] = new Menu("소프트콘", 700);
		order[2] = new Menu("아이스커피", 1000);
		
		OrderManager manager = new OrderManager(order);
		manager.printReceipt();

	}

}
