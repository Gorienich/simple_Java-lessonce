package HomeWork_Point;

public class Test_Point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first x second y
			Point A1=new Point(43,7);
			Point A2=new Point(5,5);
			System.out.println(A1.toString());
			System.out.println(A2.toString());
			changeX(A1, A2);
			newCordinateX(A1,A2);

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
