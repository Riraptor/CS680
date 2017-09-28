package homework6;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class AccountTest {

	@Test
	public void withdrawTestNoChange() {
		Account acc = new Account();
		float actual = 200;
		
	    acc.deposit(200);
		acc.withdraw(100);
		float expected = acc.getBalance();
		assertThat(actual,is(expected));
	
	}

}
