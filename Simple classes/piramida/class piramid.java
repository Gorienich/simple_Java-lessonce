package Piramida;

public class piramida {
private double side;
private double width;

public piramida()
{
	this.side = 1.0;
	this.width = 1.0;
}
public piramida(double side,double width)
{
	this.side = side;
	this.width = width;
	
}

public void baseArea(double side,double width)
{
	double areabase = Math.pow(side, 2) * Math.sqrt(3) / 4;
	System.out.println( "the area of base is:  " + (Math.pow(side, 2) * Math.sqrt(3) / 4  ));
}
public void piramidaArea(double side,double width)
{
	double areabase=  Math.pow(side, 2) * Math.sqrt(3) / 4;
	System.out.println("the area of piramida is: "  + (side * width * 3 + (2 * areabase) ) );
}

public void box(double high, double length,double sidebox)
{
	if ( high >  ((side * Math.sqrt(3) /2)) +1 &&  (length * sidebox) > ( (Math.pow(side, 2) * Math.sqrt(3) / 4)*2 +1 )  )
	System.out.println("box big enogth");
	else
		System.out.println("box too small!!!");
	
}

}
