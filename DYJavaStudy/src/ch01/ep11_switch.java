package ch01;

public class ep11_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int korean = 88;
		int english = 92;
		int math = 60;
		
		System.out.println("국어 = " + korean);
		System.out.println("영어 = " + english);
		System.out.println("수학 = " + math);
		
		// 시험 점수 합계, 평균
				
		
		int sum = korean + english + math;
		int avg = sum /3;
		
		System.out.println("합계 = " + sum);
		System.out.println("평균 = " + avg);
		
		avg = avg/10;
		
		switch(avg) {
		case 9: System.out.println("A학점입니다");
		break;
		case 8: System.out.println("B학점입니다");
		break;
		case 7: System.out.println("C학점입니다");
		break;	
		
		
		
		}
		
		

	}

}
