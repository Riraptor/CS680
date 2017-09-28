package homework8;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.awt.Point;
import java.util.ArrayList;

import org.junit.Test;


public class RectangleAreaCalcTest {

	@Test
	public void RectangleAreaTest4by3() {
		ArrayList<Point> al = new ArrayList<Point>();
		al.add( new Point(0,0)); 
		al.add( new Point(4,0));
		al.add( new Point(4,3));
		al.add( new Point(0,3));
		Polygon p = new Polygon( al, new  RectangleAreaCalc() );
		float expected = p.getArea();
		float actual = 12;
		assertThat(actual, is(expected));
	}
	
	@Test
	public void RectangleAreaTest4by3toTriangle() {
		ArrayList<Point> al = new ArrayList<Point>();
		al.add( new Point(0,0)); 
		al.add( new Point(4,0));
		al.add( new Point(4,3));
		al.add( new Point(0,3));
		Polygon p = new Polygon( al, new  RectangleAreaCalc() );
		p.removePoint(al.get(3));
		p.setAreaCalc(new TriangleAreaCalc());
		float expected = p.getArea();
		float actual = 6;
		assertThat(actual, is(expected));
	}
}
