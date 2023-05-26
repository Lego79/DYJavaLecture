package ep34_Exit;

public class ExitExample {
	
	public static void main(String[] args) throws Exception {
		
		for(int i=0; i < 10; i++) {
			
			System.out.println(i);
			if(i == 5) {
				System.out.println("프로그램 강제종료");
				System.exit(30);
			}
		}
		
	}

}
