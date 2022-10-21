/*
 * algorithm:
 * 
 * 1. define a variable double: sandwiches = 750;
 * 2. define a variable double: amount = 0;
 * 3. define a variable double: double money = 0;
 * 4. define a variable int: buys = 0;
 * 5. until sandwiches>0;
 * 5.1 output: "how many sandwiches you want to buy? "
 * 5.2 input: amount from user;
 * 5.3 buys +1;
 * 5.4 condition: amount>sandwiches;
 * 5.4.1 output: how many sandwiches user can buy;
 * 5.4.2 define amount to sandwiches;
 * 5.5 condition: amount<10;
 * 5.5.1 define how many sandwiches left after buying
 * 5.5.2 define how money user have to pay
 * 5.5.3 output: display to user how money user have to pay
 * 5.6 opposite condition: define how many sandwiches left after buying
 * 5.6.1 define how money user have to pay
 * 5.6.2 output: display to user how money user have to pay
 * 6. output: display to user "no sandwiches left"
 * 7. output: total money earned,   total purchases;

 */
import java.util.Scanner;
public class Q1N7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		    double  sandwiches = 750;    // define total sandwiches
		    double amount = 0;           // define amount = 0
		    double money = 0;             // define money = 0
		    int buys = 0;                 // define buys = 0
		   while(sandwiches>0)            // program run until sandwiches>0
		    { 
		      System.out.println( "how many sandwiches you want to buy? "); // question to user 
		       amount = input.nextInt();                                    // input from user 
		       buys++;                                                      // buys +1
		       if(amount>sandwiches){                                       // condition: amount>sandwiches
		          System.out.println( "the is only  " + sandwiches + " sandwiches left"); // output to user how many sandwiches left
		          amount=sandwiches;                                                      // define user amount to sandwiches
		       }
		       if(amount <10)                                                              // condition: amount <10
		      { sandwiches=sandwiches-amount;                                              // define how many sandwiches left
		         money+=amount*2;                                                          // define cost of sandwiches     
		       System.out.println("You need to pay: " + (amount*2));                       // output: display to user cost of sandwiches
		       }
		       else                                                                        // opposite condition:
		       {
		    	   sandwiches=sandwiches-amount;                                           // define how many sandwiches left after user input
		           money+=amount*1.5;                                                      // define cost of sandwiches
		           System.out.println("You need to pay: " + (amount*1.5));                 // output to user: cost of sandwiches
		       }
		  }
		 System.out.println("Run out of sandiches: "  );                                   // output to user: no sandwiches left
	     System.out.println("total money earned: " + money + "IL;   total purchases: " + buys  );  // output to owner: total money earned:, total purchases
	}

}
