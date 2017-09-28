package homework6;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SavingsAccountTest {
	

	@Test
	public void constructorTest() {
		SavingsAccount sav = new SavingsAccount();
		float actual = 0;
		float expected = sav.getBalance();
		assertThat(actual, is(expected));
	}
	
	@Test
	public void deposit100(){
		SavingsAccount sav = new SavingsAccount();
		sav.deposit(100);
		float expected = sav.getBalance();
		float actual = 100;
		assertThat(actual, is(expected));
		
	}
	
	@Test
	public void setBalance0(){
		SavingsAccount sav = new SavingsAccount();
		sav.deposit(100);
		sav.setBalance(0);
		float expected = sav.getBalance();
		float actual = 0;
		assertThat(actual, is(expected));
	}
	
	@Test
	public void withdraw40from100() {
		//Checking if the balance remaining in Savings is $60
		SavingsAccount sav = new SavingsAccount();
		sav.deposit(100); 
		
		try {
		 sav.withdraw(40);
		}
		catch(InsufficientFundsException e) {
			
		}
		float actual = 60;
		float expected = sav.getBalance();
		assertThat(actual, is(expected));
	}
	
	@Test (expected = InsufficientFundsException.class)
	public void withdraw200from100(){
		//Should throw exception
		SavingsAccount sav = new SavingsAccount();
		sav.deposit(100);
	    sav.withdraw(200);
	}
}
