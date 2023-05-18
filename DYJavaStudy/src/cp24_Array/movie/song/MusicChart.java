package cp24_Array.movie.song;



public class MusicChart {
	
	Song[] songArray;



	public MusicChart(Song[] songArray) {

		this.songArray = songArray;
	}

	public static Song getSong(String album, String singer, String title, String composer, String lyricist, String releasedate) {
		return new Song(album, singer, title, composer, lyricist, releasedate);
		
	}
	
	public void printMusicChart () {
		
		for(int i = 0; i < songArray.length; i ++) {
			System.out.println((i + 1) + ".");
			System.out.println(songArray[i].album);			
			System.out.println(songArray[i].singer);			
			System.out.println(songArray[i].title);			
			System.out.println(songArray[i].composer);			
			System.out.println(songArray[i].lyricist);
			System.out.println(songArray[i].releaseDate);
			
		}
		
		
		
		
		
		
	}
	
	
	
	

}
