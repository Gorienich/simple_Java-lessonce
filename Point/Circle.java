package HomeWork_Point;

public class Circle{
protected Point center;
protected int rudius;

public Circle(Point some, int r) {
	this.center = new Point(some);
	this.rudius = r;
}

//out: area of circle
public double getArea() {
	return Math.PI * Math.pow(rudius, 2);
}
//out: perimetr of circle
public double getPerimeter() {
	return 2*Math.PI * this.rudius;
}
//overwriting
public String toString() {
	return "the Circle: \n the center of Circle: " +this.center.toString() + 
			"the radius: " + this.rudius +"\n";
}

}
