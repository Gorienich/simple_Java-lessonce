import java.util.Scanner;
public class Q1N1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a number:");  // question to user 
		int num = input.nextInt();                     // input from user to the system
		int sum = 0;                                   // Define a variable
		while(num !=0 ) {                              // operator while with condition 
		sum+=num%10;                                   // save leftover in Sum
		num/=10;                                       // drop out leftover and division number
		}
		System.out.println("the sum of digits is:  " + sum);  // output  with answer
	}
}
