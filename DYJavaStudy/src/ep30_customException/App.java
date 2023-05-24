package ep30_customException;

public class App {

	public static void main(String[] args) {
		
		Account account = new Account();
		//예금하기
		
		account.deposit(50000);
		System.out.println("예금액: " + account.getBalnce());
		
		
		try {
			account.withdraw(80000);
		} catch(InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
				
	}

}
