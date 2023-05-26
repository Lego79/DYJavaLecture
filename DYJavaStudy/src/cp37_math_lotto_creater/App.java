package cp37_math_lotto_creater;

public class App {

	public static void main(String[] args) {

		int[] winningNumber = new int[7];

		for (int i = 0; i < 7; i++) {

			if (winningNumber[i] == (((int) (Math.random() * 45)) + 1)) {
				System.out.print(" ");

			}
			// 중복
			// if - winningNumber[i] == ((int)(Math.random() * 45)) + 1)
			// 빈칸이 나오고
			// 아니면
		}
		for (int j = 0; j < 7; j++) {
			winningNumber[j] = (int) (Math.random() * 45);
			System.out.print(winningNumber[j] + " ");
		}
	}
}

//for(int j = 0; j <7; j++) {
//	winningNumber[j] = (int)(Math.random()*45);
//	System.out.print(winningNumber[i] + " ");
//}
