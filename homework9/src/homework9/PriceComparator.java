package homework9;

import java.util.Comparator;

public  class PriceComparator implements Comparator<Car> {
	
	public int compare(Car car1, Car car2){
		return car2.getPrice() - car1.getPrice();
	}


}