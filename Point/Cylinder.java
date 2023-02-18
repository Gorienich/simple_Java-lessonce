package HomeWork_Point;

public class Cylinder extends Circle{
	protected int height;
	
	
public Cylinder(Point center, int radius, int height){
	super(center, radius);
	this.height = height;
}

//out: area of Cylinder
public double getArea() {
	return 2 * super.getArea() + (2 * Math.PI * super.rudius) * this.height;
}

//out: V of cylinder

public double getVolume() {
	return super.getArea() * this.height;
}

//overwriting
public String toString() {
	return  "the Cylinder: \n the center of the base: " + 
             super.center.toString() + "\n" + "the radius: " +  super.rudius; 
}
}
