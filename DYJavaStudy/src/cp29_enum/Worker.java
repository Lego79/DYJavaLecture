package cp29_enum;

public class Worker {
	
	private String name;
	private int carrer;
	private Job job;
	
	public Worker(String name, int carrer, Job job) {
		super();
		this.name = name;
		this.carrer = carrer;
		this.job = job;
	}
	
	public String getName() {
		return name;
	}
	public int getCarrer() {
		return carrer;
	}
	public Job getJob() {
		return job;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCarrer(int carrer) {
		this.carrer = carrer;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	
	
	public void printInfo() {
		
		System.out.println("이름 = " + getName() + "|" + "커리어 =" + getCarrer() + "(년)" + "|" + "직업 =" + getJob());
		
	}	


		
		
	

}
