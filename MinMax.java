package simpleJava;
import java.util.Scanner;
public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
System.out.println("enter quantaty of numbers (must be integer and at least 2 numbers)");
int quantaty = in.nextInt();
while(quantaty == 0) {                        // protect from 0 !!!
	System.out.println("it can't be 0 enter again");
	quantaty = in.nextInt();
}
int[]arr = new int[quantaty];  // create array for numbers
for(int i = 0; i<arr.length; i++) {  // get numbers to array
	System.out.println("enter number: " + (i+1));  
	arr[i] = in.nextInt();
}
int min = arr[0];
int max = arr[0];
for(int i = 1; i<arr.length; i++) {
	if(arr[i]>max)
		max = arr[i];
	else if(arr[i]<min)
		min = arr[i];
}
		System.out.println("min number: " + min +"\n" + "max number: " + max);
	}
Scanner close;
}
