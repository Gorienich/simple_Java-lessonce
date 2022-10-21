/*
 * 
 * 1. output: "enter a package weight:"
 * 2. input number and save in Define a variable weight
 * 3.  Define a variable: sum=0
 * 4.  Define condition: weight>1000 
 * 4.1 output:  the weight of package must be low then 1000 kg
 * 5.  Define  a variable: sum+=weight
 * 6.  Until: sum<1000 (do around) 
 * 6.1 output:  "enter a package weight: "
 * 6.2 input number and save in Define a variable weight
 * 6.3 condition: weight>1000
 * 6.3.1 output: "the weight of package must be low then 1000 kg"
 * 6.4  Define  a variable: sum+=weight
 * 7.  condition: sum>1000
 * 7.1 output with calculation drop last package:  "the ship is full and ready to left" + sum-=weight + "kg"
 * 8. condition: (sum<=1000)
 * 8.1 output:  "the ship is full and ready to left:  " + sum + "kg"
 **************
 * end program.
 */
import java.util.Scanner;
public class Q1N5
{
	public static void main(String[] args) {
	       Scanner input = new Scanner(System.in);
	       System.out.println( "enter a package weight:"); // question to user 
	   	int weight= input.nextInt();                       // user's input
	   	int sum =0;                                        //  Define a variable: sum=0
	  	if(weight>1000 )                                   //  condition overload
		   System.out.println("the weight of package must be low then 1000 kg"); // Message  to user overload
	       sum+=weight;                                    // user's inputs saved in sum
	    while(sum<1000)  {                                 // condition for operator while sum less 1000
	       System.out.println( "enter a package weight:"); // question to user 
	       weight= input.nextInt();                        // user's inputs to the system
	    if(weight>1000 )                                   //  condition user's input more then 1000
		   System.out.println("the weight of package must be low then 1000 kg");  //  Massage  to user overload
	       sum+=weight;}                                   // user's input saved in sum
	    if(sum>1000 )                                      // condition sum more then 1000
	       System.out.println("the ship is full and ready to left:  " + (sum-=weight  ) + "kg"); // Message  to user the ship is ready to left with calculating drop last box 
	    else if(sum<=1000)                                 // condition sum <=1000
		   System.out.println("the ship is full and ready to left:  " + sum + "kg");  // message to user the ship is ready to left + sum
 
	}
}
