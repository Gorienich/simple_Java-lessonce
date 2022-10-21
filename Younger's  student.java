/*
 * algorithm:
 *  1. output: "enter an age of student "
 *  2. Define a variable age1 = 1
 *  3. define a variable age2 = 0
 *  4. input: define a variable age with user's input
 *  5. until: age> -1
 *  5.1 condition: age<age1
 *  5.1.1 define age1 = age
 *  5.2 condition: age>age2
 *  5.2.1 define age2 = age
 *  5.3 input: user's input age to the system
 *  6.output: message to user "The oldest student: "   + age2 + "     The youngest student: " + age1
 */
import java.util.Scanner;

public class Q1N3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println( "enter an age of student: ");
	 
	    int age1 = 1;         // define age1 = 1
	    int age2 = 0;         // define age2 = 0
	    int age = input.nextInt(); //  user's input age of student	
	    while(age > -1) {   // until age be less then 0 continue 
	    if(age<age1)          // condition to age1
	    age1 = age;           // input user input to age1
	    else if(age>age2 )    // condition to age2
	    age2 = age;           // input age to age2
	    age = input.nextInt();  // user's input age
	     }   
	   System.out.print("The oldest student: "   + age2 + "     The youngest student: " + age1); // output youngest and oldest students
	   
	}

}
