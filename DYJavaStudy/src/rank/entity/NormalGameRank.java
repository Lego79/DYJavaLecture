package rank.entity;

public class NormalGameRank {
	
	private String user;
	private String gameType;
	private int clearTime;
	
	public NormalGameRank(String user, String gameType, int clearTime) {

		this.user = user;
		this.gameType = gameType;
		this.clearTime = clearTime;
	}

	public String getUser() {
		return user;
	}

	public String getGameType() {
		return gameType;
	}

	public int getClearTime() {
		return clearTime;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public void setClearTime(int clearTime) {
		this.clearTime = clearTime;
	}
	
	
	
	

}
