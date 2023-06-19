package practice.movie;

public class MovieApp {
	
	public static void main(String[] args) {
		
		
		String name = "톰 크루즈";
		String sex = "남자";
		String birthdate ="1962.07.03";
		String nationality = "미국";
		Actor actor = new Actor(name, sex, birthdate, nationality);
		actor.printInfo();
		
		System.out.println("===== Movie Info =====");
		
		String title = "탑건 매버릭";
		String category = "액션";
		String director = "조셉 코신스키";
		int runningTime = 130;
	
	
		Movie m = new Movie(title, category, director, runningTime, actor);
		m.printInfo();
	
	}

}
