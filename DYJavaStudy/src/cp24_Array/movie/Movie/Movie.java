package cp24_Array.movie.Movie;



public class Movie {
	
	private String title; // 제목
	private String category; // 카테고리
	private String director; // 감독
	private int runningTime; // 상영시간
	private Actor[] actor; // 배우

	
	




	public Movie(String title, String category, String director, int runningTime, Actor[] actor) {
	
		this.title = title;
		this.category = category;
		this.director = director;
		this.runningTime = runningTime;
		this.actor = actor;
		
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getDirector() {
		return director;
	}

	public int getRunningTime() {
		return runningTime;
	}

	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

	
	

	
	
	public void printInfo() {
		
		System.out.println("==== Movie Info ====");
		System.out.println("제목 = " + title + "|" + "분류 = " + category 
				+ "|" + "감독= " + director + "|"  + "상영시간= " + runningTime+"(분)" );
		System.out.print("배우 = ");
		

	}	
	
	

}

class Service {
	
	

	
	public static Actor getActor(String name, String sex, String birthDate, String nationality) {
		return new Actor(name, sex, birthDate, nationality);
	}
	
}



//for (int i = 0; i < actorArray.length; i++) {
//System.out.print(actorArray[i]);
//if(i != actorArray.length - 1) {
//	System.out.print(",");
//}	        
//
//
//}
