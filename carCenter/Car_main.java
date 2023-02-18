package carCenter;
import java.util.Scanner;
import java.util.Random;
public class Car_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
Random rnd = new Random();

// need 200 cars created 5 cars for check
Car [] arr = new Car[5];

//create cars in array
for(int i=0; i< arr.length; i++)
{
	System.out.println("enter name of car");
	arr[i] = new Car(in.next(), rnd.nextInt(20)+1, rnd.nextInt(100)+1);
}

//create car center
All_Cars carCenter = new All_Cars(arr);

//create new car
Car newc = new Car("egor",25,125487);
// add new car to car center
carCenter.addCar(newc);
System.out.println(carCenter.toString());
// check status of car center
carCenter.carStatus();

//delete car from car center
carCenter.remCar(125487);
// check status
carCenter.carStatus();

//show cars after remove in car center
System.out.println(carCenter.toString());  

// get all car center
Car [] arr1 = carCenter.getArr();

//check sorting from null
for(int i=0; i<arr1.length; i++) 
{
	if(arr1[i] == null)
		System.out.println("null");
	else
		System.out.print(arr1[i].toString());
}
carCenter.carStatus();
	}

}
