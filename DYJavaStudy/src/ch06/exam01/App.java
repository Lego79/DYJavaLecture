package ch06.exam01;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie movie = new Movie();
		
		movie.title = "탑건:매버릭";
		System.out.println(movie.title);
		
		movie.category = "액션";
		System.out.println(movie.category);
		
		movie.director = "조셉 코신스키";
		System.out.println(movie.director);
		
		movie.runningtime = 132;
		System.out.println(movie.runningtime);

	}

}
