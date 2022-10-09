package simpleJava;
import java.util.Scanner;
public class reversNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.println("enter a number to revers");
int num = in.nextInt();
int digit = 0;
while(num != 0) {
	digit = num%10;
	System.out.print(digit);
	num/=10;
}
	}
Scanner close;
}
