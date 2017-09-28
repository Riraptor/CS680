package homework9;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test
	public void getPrice2000_1999_10000() {
		Car car = new Car(2000, 1999, 10000);
		int expected = car.getPrice();
		int actual = 2000;
		assertThat(actual, is(expected));
				
		
	}
	@Test
	public void getYear2000_1999_10000() {
		Car car = new Car(2000, 1999, 10000);
		int expected = car.getYear();
		int actual = 1999;
		assertThat(actual, is(expected));
	}
	@Test
	public void getMilage2000_1999_10000() {
		Car car = new Car(2000, 1999, 10000);
		float expected = car.getMilage();
		float actual = 10000;
		assertThat(actual, is(expected));

		
	}


}
