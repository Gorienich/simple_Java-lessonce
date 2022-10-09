package simpleJava;
import java.util.Scanner;
public class polindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.println("enter a num to check polindrom");
long num = in.nextLong();
if(polindrom(num)) 
  System.out.println("number is polindrom");
else
	System.out.println("number is not polindrom");
	}
	public static boolean polindrom(long num) {
		long check = num;//copied number into a variable
		long rev = 0; // variable for collect digits
		while(check !=0) {
			long remainder = check%10;// get last digit
			rev = rev*10 + remainder;   // create reveres number
			check /= 10; // drop last digit
		}
		if(num == rev)
			return true;
		    return false;
	}
Scanner close;
}
