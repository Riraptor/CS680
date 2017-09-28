package homework6;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void createCustomer() {
		Customer Jeff = new Customer("Jeffery", 100, 200);
		String actual_name = "Jeffery";
		float actual_savings = 100;
		float actual_checkings = 200;
		
		String expected_name = Jeff.name;
		float expected_savings = Jeff.savings.getBalance();
		float expected_checkings =Jeff.checking.getBalance() ;
		assertThat(actual_name, is(expected_name));
		assertThat(actual_checkings, is(expected_checkings));
		assertThat(actual_savings, is(expected_savings));
	}

}
