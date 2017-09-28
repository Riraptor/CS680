package homework2;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;

public class TestHw1 {
	
	
	public static void main(String[] args){
		ArrayList<Polygon> p = new ArrayList<Polygon>();
		
		int RectangleCount = 1;
		int TriangleCount = 1;
		
		p.add( new Rectangle( new Point(2,0), new Point(0,2), new Point(2,2), new Point(0,0)));
		p.add( new Rectangle( new Point(1,1), new Point(1,0), new Point(0,0), new Point(0,1)));
		p.add(new Triangle( new Point(0,0), new Point(2,2), new Point(1,3)));	
		p.add(new Triangle( new Point(3,6), new Point(5,6), new Point(3,2)));
		
		Iterator<Polygon> it = p.iterator();
		
		while(it.hasNext()){
			Polygon nextP = it.next();
			
			ArrayList<Point> r1 = nextP.getPoints();
			if(r1.size() == 4){
				
				System.out.print("Rectangle " + RectangleCount+" :\n");
				RectangleCount = RectangleCount + 1;
				}
			
			else if(r1.size() == 3){
				
				System.out.print("Triangle " + TriangleCount+" :\n");
				TriangleCount = TriangleCount + 1;
			}
			
			for (Point value : r1) {
				  System.out.print("("+value.getX()+","+ value.getY()+")"+"\n");
				}
			System.out.println("Area= " +  nextP.getArea() ); 
			  
		}
		

	
	}

}
