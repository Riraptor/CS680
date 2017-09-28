package homework7_5;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.awt.Point;
import java.util.ArrayList;

import org.junit.Test;


public class TriangleTest {

	
	@Test
	public void constructorTest(){
		ArrayList<Point> v = new ArrayList<Point>();
		v.add(new Point(0,0));
		v.add(new Point(2,2));
		v.add(new Point(1,3));

		Polygon r =new Triangle( new Point(0,0), new Point(2,2), new Point(1,3));

		assertEquals(r.getPoints(), v);
	}
	@Test
	public void TriangleArea00_22_13() {
		Polygon r = new Triangle( new Point(0,0), new Point(2,2), new Point(1,3));
		double expected = r.getArea();
		double actual = 2.0000000000000013;
		assertThat(actual, is(expected));
		
	}

}
