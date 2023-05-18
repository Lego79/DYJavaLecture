package practice.songname;

public class Song {
	
	private String title;
	private String album;
	private String composer;
	private String lyricist;
	private String releaseDate;
	private Singer singer;
	
	public Song(String title, String album, String composer, String lyricist, String releaseDate, 
			Singer singer) {

		this.title = title;
		this.album = album;
		this.composer = composer;
		this.lyricist = lyricist;
		this.releaseDate = releaseDate;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public String getAlbum() {
		return album;
	}

	public String getComposer() {
		return composer;
	}

	public String getLyricist() {
		return lyricist;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public Singer getSinger() {
		return singer;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public void setSinger(Singer singer) {
		this.singer = singer;
	}
	
	public void printInfo() {
		
		System.out.println("제목=" + getTitle());
		System.out.println("앨범=" + getAlbum());
		System.out.println("작곡=" + getComposer());
		System.out.println("작사=" + getLyricist());
		System.out.println("발매일=" + getReleaseDate());
		System.out.println("\n---- Singer Info ----");
		
		getSinger().printInfo();
		
		
	}
	

	
	
	
	

}
