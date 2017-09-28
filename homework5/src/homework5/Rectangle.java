package homework5;

import java.awt.Point;
import java.util.ArrayList;

public class Rectangle implements Polygon {

	private Point a;
	private Point b;
	private Point c;
	private Point d;
	
	public Rectangle(Point A, Point B, Point C, Point D){
		this.a = A;
		this.b = B;
		this.c = C;
		this.d = D;
		
	}
	
	@Override
	public ArrayList<Point> getPoints() {
		ArrayList<Point> v = new ArrayList<Point>();
			v.add(a);
			v.add(b);
			v.add(c);
			v.add(d);
			
		return v;
	}

	@Override
	public double getArea() {
		double ab = a.distance(b);
		double bc = b.distance(c);
		double ca = c.distance(a);
		/*
		double s = (ab + bc + ca)/2;
		
		return(2*Math.sqrt(s*(s-ab)*(s-bc)*(s-ca)));
		*/
		
		if (ab>bc && ab>ca) { return(bc*ca);}
		if (bc>ab && bc>ca) { return(ab*ca);}
		//if (ca>ab && ca>bc) { return(ab*bc);}
		return(ab*bc);
		
		
		}
		
	

	@Override
	public Point getCentroid() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
