package homework7_6;



public class SavingsAccount extends Account {
	
	public SavingsAccount() {
		
	}
	
	@Override
	public void withdraw(float w) throws InsufficientFundsException{
		if(this.getBalance() - w >= 0){
			this.balance = this.balance - w;
			System.out.println("Savings Account: " + "$" + w + " Successfully withdrawn");
			
			
		}
		
		else if (this.getBalance() - w < 0 ){
			throw new InsufficientFundsException();
			
		}
		

	}	
}
