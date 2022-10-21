import java.util.Scanner;
public class hyper7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int number =0;  int counter =0;

do {   //   
	System.out.println("enter a number");
	number =input.nextInt();
	counter++;
	SimpleNum(number);       // chek number with function
	Polindrome(number);      // check number with function

	if(SimpleNum(number)== true || Polindrome(number)== true) {   // if functions == true
		System.out.println("you got polindrom or simple namber with one try!");
		break;              // stop
	}
}
while(SimpleNum(number) != true || Polindrome(number) != true ); {   // if function == false
	SimpleNum(number);
	Polindrome(number);
}
System.out.println("there was: " +( counter ) +  ", times trying till you got Polindrom or Simple number!");
	}
	
	//  function to Simple number
	public static boolean SimpleNum(int number) {
		int num = number;
		boolean flag = true;
		for (int i = 2; i < num; i++)  // run without '1' and without number
			if (num % i == 0)          // if number split by other numbers without leftover
				return flag = false;   
		return flag = true;            // if number split only by '1' or himself return true 
			}
		// function to polindrome
	public static boolean Polindrome(int number) {
		 int num1 = number; // copied number into new variable
		    int reverse = 0;    // Variable backing to polindrome
		    while (num1 != 0) {  // check all diggits in into number
		        int remainder = num1 % 10;  // leftover
		        reverse = reverse * 10 + remainder; // create backing polindrome
		        num1 = num1 / 10;  // dropout leftover
		           }
		    if (number == reverse)  // if number == backing
		        return true;
		        return false;
		}
	}
