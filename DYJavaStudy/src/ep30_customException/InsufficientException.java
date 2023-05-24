package ep30_customException;

public class InsufficientException extends Exception{ 
	
	public InsufficientException() {
		
		
	}
	
	public InsufficientException(String message) {
		
		super(message);
		
	}

}
