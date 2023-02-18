package HomeWork_Point;

public class Rectangle {
private Point bottomLeft;
private Point topRight;
private int width;
private int height;

public Rectangle(Point bottomLeft, Point topRight) {
	this.bottomLeft =new Point(bottomLeft);
	this.topRight = new Point(topRight);
}
// constructor
public Rectangle(Point bottomLeft, int width, int height) {
	this.bottomLeft =new Point(bottomLeft);
	this.width = width;
	this.height = height;
	
} 
// area
public int getArea() {
	return width * height;
}
// Parameter
public int getPerimeter() {
	return 2*width + 2*height;
}
// remove x,y
public void move(int deltaX, int deltaY) {
	if(deltaX < 0) // remove left 
	{
		bottomLeft.setX(-deltaX);
		topRight.setX(-deltaX);
	}	
	else      // remove right 
	{
		bottomLeft.setX(deltaX);
		topRight.setX(deltaX);
		
	}
	if(deltaY < 0)    // remove down
	{
		bottomLeft.setY(-deltaY);
		topRight.setY(-deltaY);
	}
	else     // remove up
	{
		bottomLeft.setY(deltaX);
		topRight.setY(deltaX);
		
	}	
}
// print x,y of bottom-left,  top-right
public String toString() {
	return "Rectangle:\n" + "Point bottom-left:\n"  + 
			"<" + bottomLeft.getX() + ">,<" + bottomLeft.getY() + ">" +
			"Point top-right:\n" + 
			"<" + topRight.getX() + ">,<" + topRight.getY() + ">";
}

}


