package exam_lvl1;
import java.util.Scanner;
class Cube_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
Cube cube1 = new Cube(5,"blue","small", 150.0);
Cube cube2 = new Cube(12,"yellow", "big", 99.0);

System.out.println("enter name of cube");
String name3 = in.next();
System.out.println("enter side of cube 3");
int side3 = in.nextInt();
System.out.println("enter color of cube 3");
String color3 = in.next();
System.out.println("enter price of cube 3");
double price3 = in.nextDouble();
Cube cube3 = new Cube(side3,color3,name3,price3);



System.out.println(AreaCube(cube3));


Cube [] arr = {cube1, cube2, cube3};
temper(arr);

	}

private static int AreaCube(Cube cube) {
		// TODO  V of cube
		return (int) Math.pow( cube.getSide(),3);
	}

public int Scube(Cube cube) {
	return (int) (6*(Math.pow( cube.getSide(), 2)));   // return S of cue	
}
//return all cubes have color blue and price 100 and more...
public static void temper(Cube[] arr) {
	for (int i=0; i < arr.length; i++) {
		if(arr[i].getPrice() > 99 && arr[i].getColor().equals("blue")) {
			System.out.println(arr[i].getName());
			System.out.println(arr[i].getSide() + ", side...") ;
		    System.out.println(arr[i].getPrice() + ", price...") ;
		    System.out.println(arr[i].getColor() + ", color...") ;
		}
	}
}
}
