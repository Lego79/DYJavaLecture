package movieApp;

public class Movie {

	private String title; // 제목
	private String category; // 카테고리
	private String director; // 감독
	private int runningTime; // 상영시간

	public String getTitle() {
		return title;
	}

	public void setTitle(String newTitle) {
		title = newTitle;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String newCategory) {
		category = newCategory;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String newDirector) {
		director = newDirector;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int newRunningTime) {
		runningTime = newRunningTime;
	}

	public void printInfo() {
		System.out.println("\n===== Movie Info =====");
		System.out.println("제목=" + title);
		System.out.println("카테고리=" + category);
		System.out.println("감독=" + director);
		System.out.println("상영시간=" + runningTime);
	}
}
