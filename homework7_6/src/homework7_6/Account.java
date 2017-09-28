package homework7_6;

public class Account {
	protected float balance;
	
	public float getBalance(){
		return this.balance;
		}
	
	public void deposit(float d){
		this.balance += d;
		}
	
	public void withdraw(float w) throws InsufficientFundsException{
		
	}
	public void setBalance(float bal){
		this.balance = bal;
	}
}
