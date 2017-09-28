package homework5Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

import homework5.Polygon;
import homework5.Rectangle;

import java.awt.Point;
import java.util.ArrayList;


public class RectangleTest {
	
	
	@Test
	public void constructorTest(){
		ArrayList<Point> actual = new ArrayList<Point>();
		actual.add(new Point(2,0));
		actual.add(new Point(0,2));
		actual.add(new Point(2,2));
		actual.add(new Point(0,0));
		Polygon r = new Rectangle( new Point(2,0), new Point(0,2), new Point(2,2), new Point(0,0));
		//assertThat(r.getPoints(),  containsInAnyOrder( "item2"));
		 ArrayList<Point> expected = r.getPoints();
	
		assertThat(actual, is(expected));
	}
	@Test
	public void rectangleArea2by2() {
		Polygon r = new Rectangle( new Point(2,0), new Point(0,2), new Point(2,2), new Point(0,0));
		double expected = r.getArea();
		double actual = 4.0;
		assertThat(actual, is(expected));
		
	}

}
