package moviceConstructor;

public class Movie {
	
	String title;
	String category;
	String director;
	int runningTime;
	
	
	public Movie(String title) {

		this(title, "", "", 0);
	}
	
	public Movie(String title, String category, String director) {
		
		
		this(title, category, director, 0);

	}
	
	
	public Movie(String title, String category) {

		this(title, category, "", 0);

	}
	
	public Movie(int runningTime) {
		
		this("", "", "", runningTime);

		this.runningTime = runningTime;
	}
	

	
	public Movie(String title, String category, String director, int runningTime) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.runningTime = runningTime;
	}
	
	public void printInfo() {
		
		
			System.out.println("\n===== Movie Info =====");
			System.out.println("제목=" + title);
			System.out.println("카테고리=" + category);
			System.out.println("감독=" + director);
			System.out.println("상영시간=" + runningTime);
	
		
	}
	
	
	

}
