package homework9;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;

public class MilageComparatorTest {

	@Test
	public void MilageSortTest() {
		ArrayList<Car> one = new ArrayList<Car>();
		one.add(new Car(1000,1995,11000)); //price,year,milage
		one.add(new Car(2000,2000,12000));
		one.add(new Car(20500,2005,3200));
		one.add(new Car(30000,2010,5200));
	
		ArrayList<Car> two = new ArrayList<Car>();
		Collections.sort(one, new MilageComparator());
		two.add(new Car(2000,2000,12000));
		two.add(new Car(1000,1995,11000));
		two.add(new Car(30000,2010,5200));
		two.add(new Car(20500,2005,3200));


		assertThat(one.get(0).getYear(),is(two.get(2).getYear()));
		assertThat(one.get(1).getYear(),is(two.get(3).getYear()));
		assertThat(one.get(2).getYear(),is(two.get(0).getYear()));
		assertThat(one.get(3).getYear(),is(two.get(1).getYear()));

		
	}

}
