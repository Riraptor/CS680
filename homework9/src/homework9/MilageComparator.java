package homework9;

import java.util.Comparator;

public class MilageComparator implements Comparator<Car> {
	public int compare(Car car1, Car car2){
		return (int)(car2.getYear() - car1.getYear());
	}
}
