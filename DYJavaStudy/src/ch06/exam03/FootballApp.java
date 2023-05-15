package ch06.exam03;



public class FootballApp {
	
	public static void main(String[] args) {
		
		FootballPlayerMethod fp1 = new FootballPlayerMethod();
		fp1.setName("kim");
		fp1.setUniformNumber("7");
		fp1.setTeamName("Real Madrid");
		fp1.setSpeed(5);
		fp1.setTech(5);
		fp1.printInfo();	
		
		FootballPlayerMethod fp2 = new FootballPlayerMethod();
		fp2.setName("lee");
		fp2.setUniformNumber("19");
		fp2.setTeamName("Barcelona");
		fp2.setSpeed(4);
		fp2.setTech(3);
		fp2.printInfo();;	
		
		
		
		
	}

}
