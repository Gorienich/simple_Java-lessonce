package simpleJava;
import java.util.Scanner;
public class SimpleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.println("enter a number to check Simple number"); // simple number division only 1 and himself without 
int number = in.nextInt();
System.out.println(SimpleNum(number));
	}
public static boolean SimpleNum(int number) {
	int num = number;
	if(num == 0 || num == 1 || num %2 == 0) {
		return false;
	}
	for(int i=3; i<num/2; i++) {  // check half number,impossible make division of number after half
		if(num%i == 0) 
		return false;
	}
	return true;
}
Scanner close;
}
