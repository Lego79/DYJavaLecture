package ch06.exam02;

public class App {

	public static void main(String[] args) {
		FootballPlayer fp1 = new FootballPlayer();
		fp1.name = "김";
		fp1.uniformNumber = "7";
		fp1.teamName = "Real Madrid";
		fp1.speed = 5;
		fp1.tech = 5;
		fp1.printInfo();
		
		FootballPlayer fp2 = new FootballPlayer();
		fp1.name = "Lee";
		fp1.uniformNumber = "19";
		fp1.teamName = "Barcelona";
		fp1.speed = 4;
		fp1.tech = 3;
		fp1.printInfo();

	}

}
