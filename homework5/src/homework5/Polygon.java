package homework5;

import java.awt.Point;
import java.util.ArrayList;

public interface Polygon {
	ArrayList<Point> getPoints();
	double getArea();
	Point getCentroid();
	
}
