package galaxy23ultraMethod;

public class MobilePhone {
	
	private String name;
	private String uniformNumber;
	private String teamName;
	private int speed;
	private int tech;
	

	public MobilePhone(String name, String uniformNumber, String teamName, int speed, int tech) {
	
		this.name = name;
		this.uniformNumber = uniformNumber;
		this.teamName = teamName;
		this.speed = speed;
		this.tech = tech;
	}
	
	public MobilePhone() {
		this.name = "unknown";
		this.uniformNumber = "unknown";
		this.teamName = "unknown";
		this.speed = 0;
		this.tech = 0;
	}
	
	

	

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniformNumber() {
		return uniformNumber;
	}

	public void setUniformNumber(String uniformNumber) {
		this.uniformNumber = uniformNumber;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getTech() {
		return tech;
	}

	public void setTech(int tech) {
		this.tech = tech;
	}
	
	public void printInfo() {
		System.out.println("======선수정보=======");
		System.out.println("선수=" + getName());
		System.out.println("백넘버=" + getUniformNumber());
		System.out.println("팀=" + getTeamName());
		System.out.println("스피드=" + getSpeed());
		System.out.println("기술=" + getTech());
	}
	

	


}
