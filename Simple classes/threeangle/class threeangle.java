package asinhron3;


public class triangle {
	private double side;
	private double side2;
	private double base;
	
	public triangle() {	
		side =1;
		side2 =1;
		base =1;
	}
	public triangle(int side,int side2,int base)
	{
		this.side = side;  // setSide(side);
		this.side2 = side2;   // setSide(side2);
		this.base = base;     // setBase(base);
		correctTriangle(side,side2,base);
		equaAllsides(side, side2, base);
		equalTwoSides(side,side2,base);
		straitAngle(side,side2,base);
	}
	public triangle( double side, double side2, double base)
	{
		this.side = side;
		this.side2 = side2;
		this.base = base;
		correctTriangle(side,side2,base);
		equaAllsides(side, side2, base);
		equalTwoSides(side,side2,base);
		straitAngle(side,side2,base);
	}
	
	public boolean equaAllsides( double side, double side2,double base) {
		boolean ans = true;
		if( !   (side == side2 && side == base) ) 
			ans =false;
		return ans;	
	}
	public boolean equalTwoSides( double side, double side2,double base) {
		boolean ans = false;
		if( side == side2 || side == base || side2 == base) 
			ans = true;
		return ans;
	}
	
	public boolean correctTriangle( double side, double side2,double base)
	{
		boolean ans = true;
		if( side + side2 < base || side + base < side2 || side2 + base < side )
			ans = false;
		return ans;	
	}
	public boolean straitAngle( double side, double side2,double base)
	{
		boolean ans = true;
		if( Math.pow(side, 2) + Math.pow(base, 2) != Math.pow(side2, 2) )
			ans = false;	
		return ans;	
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}

	//
	
	
	
}
