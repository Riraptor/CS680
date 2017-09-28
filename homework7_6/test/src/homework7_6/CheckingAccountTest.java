package homework7_6;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import homework7_6.CheckingAccount;
import homework7_6.InsufficientFundsException;
import homework7_6.SavingsAccount;

public class CheckingAccountTest {


	

	@Test
	public void constructorTest() {
		
		SavingsAccount sav = new SavingsAccount();
		//sav.deposit(100);
		CheckingAccount che = new CheckingAccount(sav);
		float actual = 0;
		float expected = che.getBalance();
		assertThat(actual, is(expected));
	}
	
	@Test
	public void deposit100(){
		SavingsAccount sav = new SavingsAccount();
		//sav.deposit(100);
		CheckingAccount che = new CheckingAccount(sav);
		che.deposit(100);
		float expected = che.getBalance();
		float actual = 100;
		assertThat(actual, is(expected));
		
	}
	
	@Test
	public void SetBalance0(){
		SavingsAccount sav = new SavingsAccount();
		CheckingAccount che = new CheckingAccount(sav);
		che.deposit(100);
		che.setBalance(0);
		float expected = che.getBalance();
		float actual = 0;
		assertThat(actual, is(expected));
	}
	
	@Test
	public void Withdraw40from100() {
		SavingsAccount sav = new SavingsAccount();
		CheckingAccount che = new CheckingAccount(sav);
		che.deposit(100); 
		
		//try {
		 che.withdraw(40);
		//}
		//catch(InsufficientFundsException e) {
			
		//}
		float actual = 60;
		float expected = che.getBalance();
		assertThat(actual, is(expected));
	}
	
	@Test 
	public void Withdraw200fromChecking100WithSaving300(){
		SavingsAccount sav = new SavingsAccount();
		sav.deposit(300);
		CheckingAccount che = new CheckingAccount(sav);
		che.deposit(100);
		//try {
			 che.withdraw(200);
		//	}
			//catch(InsufficientFundsException e) {
		  //  }
		////checking if savings account decreased to $150 or not
		float sav_actual = 150;
		float sav_expected = sav.getBalance();
		assertThat(sav_actual, is(sav_expected));
		
		//checking if checking account decreased to $0 or not
		float che_actual = 0;
		float che_expected = che.getBalance();
		assertThat(che_actual, is(che_expected));
	}
	
	@Test (expected = InsufficientFundsException.class)
	public void Withdraw900fromChecking100WithSaving300(){
		SavingsAccount sav = new SavingsAccount();
		sav.deposit(300);
		CheckingAccount che = new CheckingAccount(sav);
		che.deposit(100);
		che.withdraw(900);
	}
}
