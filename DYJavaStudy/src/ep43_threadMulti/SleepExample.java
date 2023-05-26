package ep43_threadMulti;

public class SleepExample {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println("9 9");
			try {
				Thread.sleep(6000);
			} catch (Exception e) {

			}
		}

	}

}