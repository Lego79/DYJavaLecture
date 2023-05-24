package ep30_customException;

public class Account {
	
	private long balance;

	public Account(long balance) {
		this.balance = balance;
	}
	
	public Account() {
		
		
	}
	
	public long getBalnce() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws InsufficientException {
		if(balance < money) {
			throw new InsufficientException("잔고부족: " + (money - balance) + "모자람" );
		}
		balance -= money;
	}
	
	

}
