package reportCard;

public class ReportCard {
	
	String name;
	int korean;
	int english;
	int math;
	
	public ReportCard(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public int getKorean() {
		return korean;
	}

	public int getEnglish() {
		return english;
	}

	public int getMath() {
		return math;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public void setMath(int math) {
		this.math = math;
	}	
	

	
	
	public int sum() {
		//return (math + korean + english);	
		
		int total = math + korean + english;
		return total;
	}
	
	public int average( ) {
		
		return (this.sum()/3);
		
	}
	
	public char hakjum() {
		
		if(this.average() >= 90) {			
			return 'A';
			
			
		} else if(this.average() >= 80) {
			return 'B';
			
			
		} else if(this.average() >= 70) {
			return 'D';
			
		} else {
			return 'F';
		}	
		
		}
	}
	
	
	
	

