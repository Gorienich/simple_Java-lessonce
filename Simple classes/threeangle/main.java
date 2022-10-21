package asinhron3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
triangle trg = new triangle();
System.out.println("enter your chois of parameters '1' for integer or '2' for double");
int choise = input.nextInt();
if (choise == 1) {
		System.out.println(" enter a side 1 of triangle: ");
		int side = input.nextInt();
		System.out.println(" enter a side 2 of triangle: ");
		int side2 = input.nextInt();
		System.out.println(" enter a base of triangle: ");
		int base = input.nextInt();
		trg = new triangle    ((double)side,(double)side2,(double)base);
	
	if ( trg.correctTriangle  (side, side2, base) == false)
	{	
		while(trg.correctTriangle(side, side2,base) == false)
		{
			System.out.println("error input!!! please enter correct parameters ");
		System.out.println("enter side 1");
		side = input.nextInt();
		System.out.println("enter side 2");
		side2 = input.nextInt();
		System.out.println("enter a base");
		base = input.nextInt();
		trg = new triangle((double)side,(double)side2,(double)base);
			System.out.println();
		}
	}
	else
		System.out.println("triangle is correct\n");
	if (trg.equaAllsides(side, side2, base) == false)
			System.out.println("the triangle is not all sides equals\n ");
	else
		System.out.println("the triangle is all sides equals\n");
	
	if( trg.equalTwoSides(side, side2, base) == false)
		System.out.println("the triangle is not two side equals\n");
	else
		System.out.println("the triangle is two sides equals\n");
if(trg.straitAngle(side, side2, base) == false)   // 12. 13. 5
	System.out.println("the triangle is not strait angle");
else
	System.out.println("the triangle is strait angle");
		
}	
if (choise == 2) {
	System.out.println(" enter a side 1 of triangle: ");
	double side = input.nextDouble();
	System.out.println(" enter a side 2 of triangle: ");
	double side2 = input.nextDouble();
	System.out.println(" enter a base of triangle: ");
	double base = input.nextDouble();
	trg = new triangle    (side,side2,base);

if ( trg.correctTriangle  (side, side2, base) == false)
{	
	while(trg.correctTriangle(side, side2,base) == false)
	{
		System.out.println("error input!!! please enter correct parameters ");
	System.out.println("enter side 1");
	side = input.nextInt();
	System.out.println("enter side 2");
	side2 = input.nextInt();
	System.out.println("enter a base");
	base = input.nextInt();
	trg = new triangle(side,side2,base);
		System.out.println();
	}
}
else
	System.out.println("triangle is correct\n");
if (trg.equaAllsides(side, side2, base) == false)
		System.out.println("the triangle is not all sides equals\n ");
else
	System.out.println("the triangle is all sides equals\n");

if( trg.equalTwoSides(side, side2, base) == false)
	System.out.println("the triangle is not two side equals\n");
else
	System.out.println("the triangle is two sides equals\n");
if(trg.straitAngle(side, side2, base) == false)   // 12. 13. 5
System.out.println("the triangle is not strait angle");
else
System.out.println("the triangle is strait angle");
	
}	
			System.out.println();
input.close();		
	}

}
