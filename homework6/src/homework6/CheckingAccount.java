package homework6;

public class CheckingAccount extends Account {
	SavingsAccount savingsAccount;
	public CheckingAccount(SavingsAccount s) {
		this.savingsAccount = s;
	}
	
	@Override
	public void withdraw(float w) throws InsufficientFundsException {
		if(this.getBalance() >= w) {	
			this.balance = this.balance - w;
			System.out.println("Checking Account: "+"$"+w+" Successfully withdrawn");
		}
		
		else if (( savingsAccount.getBalance() + this.getBalance()) >= w) {
		
			savingsAccount.setBalance(savingsAccount.getBalance() + this.getBalance() - w - 50);
			this.setBalance(0);
			System.out.println("$" + w + " Successfully withdrawn with $50 penalty on Savings Account");
		 }
		
		else if(savingsAccount.getBalance()+this.getBalance() < w) {
			throw new InsufficientFundsException();
		}
		
	}
}
