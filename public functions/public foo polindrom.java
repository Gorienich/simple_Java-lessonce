import java.util.Scanner;

public class hyper5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number:");
	    int number = input.nextInt();	
		System.out.println(polindrome(number));
     }
	public static boolean polindrome(int number) {
		    int num1 = number; // copied number into variable
		    int reverse = 0;
		    while (num1 != 0) {
		        int remainder = num1 % 10;
		        reverse = reverse * 10 + remainder;
		        num1 = num1 / 10;
		        
		    }
		    if (number == reverse) 
		        return true;
		        return false;
		}
	}

