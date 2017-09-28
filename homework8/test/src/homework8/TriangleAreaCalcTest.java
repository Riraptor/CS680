package homework8;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.awt.Point;
import java.util.ArrayList;

import org.junit.Test;

public class TriangleAreaCalcTest {

	@Test
	public void TriangleAreaTest0_0by4_0by4_3() {
		ArrayList<Point> al = new ArrayList<Point>();
		al.add( new Point(0,0)); 
		al.add( new Point(4,0));
		al.add( new Point(4,3));
		
		Polygon p = new Polygon( al, new  TriangleAreaCalc() );
		float expected = p.getArea();
		float actual = 6;
		assertThat(actual, is(expected));
	}
	@Test
	public void Triangle0_0by4_0by4_3add0_3() {
		ArrayList<Point> al = new ArrayList<Point>();
		al.add( new Point(0,0)); 
		al.add( new Point(4,0));
		al.add( new Point(4,3));
		
		Polygon p = new Polygon( al, new  TriangleAreaCalc() );
		p.addPoint(new Point(0,3));
		p.setAreaCalc(new RectangleAreaCalc());
		float expected = p.getArea();
		float actual = 12;
		assertThat(actual, is(expected));
	}
}
