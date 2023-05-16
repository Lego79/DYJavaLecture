package movieApp;

public class App {

	public static void main(String[] args) {

		Movie m1 = new Movie();

		System.out.println("===== private Field =====");

//		m1.title = "탑건:매버릭"; // Error
//		m1.category = "액션"; // Error
//		m1.director = "조셉 코신스키"; // Error
//		m1.runningTime = 132; // Error

		System.out.println("\n===== public Method =====");

		m1.setTitle("탑건:매버릭");
		m1.setCategory("액션");
		m1.setDirector("조셉 코신스키");
		m1.setRunningTime(132);
		
		m1.printInfo();
	}

}

