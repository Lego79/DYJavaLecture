package ch06.exam02;

public class FootballPlayer {
	
	String name;
	String uniformNumber;
	String teamName;
	int speed;
	int tech;
	
	public void printInfo() {
		System.out.println("======선수정보=======");
		System.out.println("선수=" + name);
		System.out.println("백넘버=" + uniformNumber);
		System.out.println("팀=" + teamName);
		System.out.println("스피드=" + speed);
		System.out.println("기술=" + tech);
	}

}
