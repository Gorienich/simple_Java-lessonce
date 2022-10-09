package simpleJava;
import java.util.Random;
import java.util.Scanner;
public class avgOfrndNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random rnd = new Random();
Scanner in = new Scanner(System.in);
System.out.println("enter quantaty of random numbers between 0-100:");
int numbers = in.nextInt();
int sum = 0;
int []arr = new int[numbers];
for(int i =0; i<arr.length; i++) {
	arr[i] = rnd.nextInt(101);
	sum += arr[i];
}
System.out.println("avg is: " + sum/arr.length);
System.out.println("your numbers: ");
for(int i =0; i<arr.length; i++) {
	System.out.println(arr[i]);
}
	}
Scanner close;
}
