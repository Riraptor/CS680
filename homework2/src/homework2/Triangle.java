package homework2;

import java.awt.Point;
import java.util.ArrayList;

public class Triangle implements Polygon {

	private Point a;
	private Point b;
	private Point c;
	
	
	Triangle(Point A, Point B, Point C){
		this.a = A;
		this.b = B;
		this.c = C;
		
		
	}
	
	@Override
	public ArrayList<Point> getPoints() {
		ArrayList<Point> v = new ArrayList<Point>();
			v.add(a);
			v.add(b);
			v.add(c);
			
			
		return v;
	}

	@Override
	public double getArea() {
		double ab = a.distance(b);
		double bc = b.distance(c);
		double ca = c.distance(a);
		
		double s = (ab + bc + ca)/2;
		return(Math.sqrt(s*(s-ab)*(s-bc)*(s-ca)));
	}

	@Override
	public Point getCentroid() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
