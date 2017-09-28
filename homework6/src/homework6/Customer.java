package homework6;

public class Customer {
	
	public String name;
	public SavingsAccount savings;
	public CheckingAccount checking;
	
	public Customer(String n, float s, float c){
		this.name = n;
		this.savings = new SavingsAccount();
		this.checking = new CheckingAccount(savings);
		this.savings.deposit(s);
		this.checking.deposit(c);
	}
	
}
