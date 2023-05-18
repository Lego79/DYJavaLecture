package cp24_Array.movie.Movie;

public class MovieApp {

	public static void main(String[] args) {
		
		String title = "탑건 매버릭";
		String category = "액션";
		String director = "조셉 코신스키";
		int runningTime = 130;
		
		Actor[] actorArray = new Actor[3];

		actorArray[0] = Service.getActor("탐크루즈" , "남자", "1962.07.03", "미국");
		actorArray[1] = Service.getActor("카" , "나", "1962.07.03", "라");
		actorArray[2] = Service.getActor("마" , "바", "1962.07.03", "중국");
		
		
		
		Movie movie = new Movie(title, category, director, runningTime, actorArray);
		movie.printInfo();
		
				

	}

}
