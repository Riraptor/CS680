package homework8;

import java.awt.Point;
import java.util.ArrayList;

public class RectangleAreaCalc implements AreaCalculator{
	private Point a; 
	private Point b; 
	private Point c;
	private Point d;
	
	private double ab;
	private double bc;
	private double ca;
	
	public float getArea(ArrayList<Point> points){
		 a = points.get(0);
		 b = points.get(1);
		 c = points.get(2);
		 d = points.get(3);
		 
		 ab = a.distance(b);
	     bc = b.distance(c);
	     ca = c.distance(a);
	     
	     //if (ab>bc && ab>ca) { return(float)(bc*ca);}
		 //if (bc>ab && bc>ca) { return(float)(ab*ca);}
		 return(float)(ab*bc);
		
	}

}
