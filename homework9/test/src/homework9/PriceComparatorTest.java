package homework9;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class PriceComparatorTest {

	@Test
	public void PriceSortTest() {
		ArrayList<Car> one = new ArrayList<Car>();
		one.add(new Car(3000,2010,5200));
		one.add(new Car(1000,1995,11000)); //price,year,milage
		one.add(new Car(2000,2000,12000));
		one.add(new Car(4000,2005,3200));

	
		ArrayList<Car> two = new ArrayList<Car>();
		Collections.sort(one, new PriceComparator());
	
		two.add(new Car(4000,2010,5200));
		two.add(new Car(3000,2005,3200));
		two.add(new Car(2000,2000,12000));
		two.add(new Car(1000,1995,11000));
		
		assertThat(one.get(0).getPrice(),is(two.get(0).getPrice()));
		assertThat(one.get(1).getPrice(),is(two.get(1).getPrice()));
		assertThat(one.get(2).getPrice(),is(two.get(2).getPrice()));
		assertThat(one.get(3).getPrice(),is(two.get(3).getPrice()));
	}

}
