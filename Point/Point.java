package HomeWork_Point;

public class Point {
	private int x;
	private int y;
	
public Point(int x,int y)
{
	this.x=x;
	this.y=y;
}

public Point(Point p1) {
	this.x=p1.x;
	this.y=p1.y;
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

public String toString()
{
	return "(<"+x+">"+",<"+y+">)";
}

public static void changeX(Point A1, Point A2) {
	int x1 = A1.getX();
	int x2 = A2.getX();
	A1.setX(x2);
	A2.setX(x1);

}
}
