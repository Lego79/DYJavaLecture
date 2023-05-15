package ch06.exam03;

public class MovieApp {
	
	public static void main(String[] args) {
		
		MovieMethod movie = new MovieMethod();
		
		movie.setTitle("탑건:매버릭");
		System.out.println(movie.getTitle());
		
		movie.setCategory("액션");
		System.out.println(movie.getCategory());
		
		movie.setDirector("탑건:매버릭");
		System.out.println(movie.getDirector());
		
		movie.setRunningtime(132);
		System.out.println(movie.getRunningtime());
		
		
	}

}
