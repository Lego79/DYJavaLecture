package ch01;

public class ep11_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int korean = 80;
		int english = 40;
		int math = 30;
		
		System.out.println("국어 = " + korean);
		System.out.println("영어 = " + english);
		System.out.println("수학 = " + math);
		
		// 시험 점수 합계, 평균
				
		
		int sum = korean + english + math;
		int avg = sum /3;
		int score;
		
		score = avg/10;
		
		System.out.println("합계 = " + sum);
		System.out.println("평균 = " + avg);
		
		avg = avg/10;
		
		switch(avg) {
		
		
		
		case 10: System.out.println("a등급입니다");
		break;
		
		case 9: System.out.println("A등급입니다");
		break;
		
		case 8: System.out.println("B등급입니다");
		break;
		
		case 7: System.out.println("C등급입니다");
		break;	
		
		case 6: System.out.println("D등급입니다");
		break;
		
		case 5: System.out.println("Fail 입니다");
		break;

		
		if(score>=90) {
			System.out.println("90~100점");
			System.out.println("A입니다");
		} else if(score >= 80) {
			System.out.println("80~90점");
			System.out.println("b입니다");
		} else (score >= 70) {
			System.out.println("c입니다");
			
		}
		
		}		

	}

}
