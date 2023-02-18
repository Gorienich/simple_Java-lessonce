package HomeWork_Point;

public class Test_Point {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		Point P1= new Point(3,5);
		Point P2= new Point(6,9);
		Point P3 = new Point(P1);
		Rectangle R1= new Rectangle(P1,P2);
		Rectangle R2= new Rectangle(P1,P3);
		System.out.print("P1:  " + P1.toString() + "\n");
		System.out.print("P2:  " + P2.toString() + "\n");
		// // print the 2 rectangles : r1 , r2	
		P1.setX(9);
		P1.setY(12);
		Rectangle R3= new Rectangle(P1,P2);
		// print the 3 rectangles : r1 , r2 , r3
		System.out.println(R1.toString() + "\n");
		System.out.println(R2.toString() + "\n");
		System.out.println(R3.toString() + "\n");
*/
		Point point = new Point(100,100);
		Circle circle = new Circle(point,1);
		Cylinder cyl = new Cylinder(point, 1, 10);
		System.out.println(cyl.toString());
		System.out.println();
		System.out.println(circle.getArea());
		System.out.println(cyl.getArea());
		
		
		
		
	}

public static void changeX(Point A1, Point A2) {
	int x1 = A1.getX();
	int x2 = A2.getX();
	A1.setX(x2);
	A2.setX(x1);

}
public static void newCordinateX(Point A1, Point A2) {
	System.out.println("Attention! new cordinate!!!");
	System.out.println(A1.toString());
	System.out.println(A2.toString());	
}
}
