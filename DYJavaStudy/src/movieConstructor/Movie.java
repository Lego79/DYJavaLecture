package movieConstructor;

public class Movie {
	


	String title;
	String category;
	String director;
	int runningTime;
	
	public Movie() {
		System.out.println("Movie()");
	}
	
	public Movie(String title, String category, String director, int runningTime) {	
		System.out.println("Movie(String newTitle, String newDiretor" + "String newDirector, String newRunningTime)");
		this.title = title;
		this.category = category;
		this.director = director;
		this.runningTime = runningTime;
	}
	
//	public Movie(String newTitle, String newCategory, String newDirector, int newRunningtime  ) {
//		System.out.println("Movie(String newTitle, String newDiretor" + "String newDirector, String newRunningTime)");
//		
//		title = newTitle;
//		category = newCategory;
//		director = newDirector;
//		runningTime = newRunningtime;
//		
//	}

}
