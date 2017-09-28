package homework8;
import java.awt.Point;
import java.util.ArrayList;
public class TriangleAreaCalc implements AreaCalculator {
	private Point a; 
	private Point b; 
	private Point c;
	
	private double ab;
	private double bc;
	private double ca;
	private double s;
	@Override
	public float getArea(ArrayList<Point> points){
		 a = points.get(0);
		 b = points.get(1);
		 c = points.get(2);
		 
		 ab = a.distance(b);
		 bc = b.distance(c);
		 ca = c.distance(a);
		 
		 s = (ab + bc + ca)/2;
		 return ((float)Math.sqrt(s*(s-ab)*(s-bc)*(s-ca)));
	}
	
}
