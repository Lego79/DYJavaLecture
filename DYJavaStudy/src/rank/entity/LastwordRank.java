package rank.entity;

public class LastwordRank {
	
	private String user;
	private String gameType;
	private int winRatio;
	
	
	public LastwordRank(String user, String gameType, int winRatio) {

		this.user = user;
		this.gameType = gameType;
		this.winRatio = winRatio;
	}


	public String getUser() {
		return user;
	}


	public String getGameType() {
		return gameType;
	}


	public int getWinRatio() {
		return winRatio;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public void setGameType(String gameType) {
		this.gameType = gameType;
	}


	public void setWinRatio(int winRatio) {
		this.winRatio = winRatio;
	}	
	

}
