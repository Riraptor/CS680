package homework7_6;

public class InsufficientFundsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InsufficientFundsException() {
		super("Transaction not successful");
	
	}
}


