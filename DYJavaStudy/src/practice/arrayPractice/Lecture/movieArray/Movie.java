package practice.arrayPractice.Lecture.movieArray;

public class Movie {
	
	private String title;
	private String category;
	private String director;
	private int runningTime;
	private String[] actorArray;
	

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


	public String[] getActorArray() {
		return actorArray;
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


	public void setActorArray(String[] actorArray) {
		this.actorArray = actorArray;
	}



	
	public Movie(String title, String category, String director, int runningTime, String[] actorArray) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.runningTime = runningTime;
		this.actorArray = actorArray;
	}
	
	
	public void printInfo() {
		
		System.out.println("==== Movie Info ====");
		System.out.println("제목 = " + title + "|" + "분류 = " + category 
				+ "|" + "감독= " + director + "|"  + "상영시간= " + runningTime+"(분)" );
		System.out.print("배우 = ");
		for (int i = 0; i < actorArray.length; i++) {
		        System.out.print(actorArray[i]);
		        if(i != actorArray.length - 1) {
		        	System.out.print(",");
		        }
		        
		        
		        
		        
		    }
	}	
	
	public void printInf() {
	    System.out.println("==== Movie Info ====");
	    System.out.println("제목 = " + title + "|" + "분류 = " + category
	            + "|" + "감독 = " + director + "|"  + "상영시간 = " + runningTime + "(분)");
	    System.out.print("배우 = ");
	    
	    for (String actor : actorArray) {
	        System.out.print(actor);
	        if (!actor.equals(actorArray[actorArray.length - 1])) {
	            System.out.print(", ");
	        }
	    }
	    
	    System.out.println();
	}
	

}
