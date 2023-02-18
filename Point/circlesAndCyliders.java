package HomeWork_Point;

public class circlesAndCyliders {
/*
 * 	Circle[] arr = new Circle[5];
	arr[0] = new Cylinder(new Point(3,4), 7, 11);
	arr[1] = new Cylinder(new Point(34,46), 11, 23);
	arr[2] = new Cylinder(new Point(13,9), 4, 19);
	arr[3] = new Cylinder(new Point(23,14), 5, 31);
	arr[4] = new Cylinder(new Point(32,-45), 45, 112);
	
	for (int i =0; i< arr.length; i++)
		System.out.println(arr[i].toString());
	}
 */
	public static void main(String[] args) {
		
		Object[] arr1 = new Object[2];
		Circle[] arr2 = new Circle[2];
		
		Circle circle = new Circle(new Point(1,1),5);
		Cylinder cylinder = new Cylinder (new Point(1,1),5,3);
		
		arr1[0] = circle;
		arr1[1] = cylinder;
		arr2[0] = circle;
		arr2[1] = cylinder;
		
		System.out.println(arr1[0]);
		System.out.println(((Circle) arr1[0]).getArea());
		System.out.println(arr2[0]);
		System.out.println(arr2[0].getArea());
		System.out.println(arr2[1].getArea());
		System.out.println(arr2[1].getArea());

		for (int i=0; i<arr1.length; i++)
			if( arr1[i] instanceof Cylinder)
				((Cylinder) arr1[i]).getArea();				
	}
}