package simpleJava;
import java.util.Scanner;
public class baekery_lesson {
/*
 * this lesson to count marketing of bakery
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
int sandwiches = 750;
double amount =0.0;
double money = 0.0;
int buys =0;
while(sandwiches > 0) {
	System.out.println("how many sandwiches you want to buy?");   // not 0
	amount = in.nextInt();
	buys++;
	if(amount > sandwiches) {
		System.out.println("there is only: " + sandwiches + " you can buy.. ");
		amount = sandwiches;  // to sell all we have
	}
	if(amount <10) {
		sandwiches -= amount;
		System.out.println("you have to pay: " + (amount*2));
		money += amount*2; // without super praise
	}
	else {
		sandwiches -= amount;
		System.out.println("you have to pay: " + (amount*1.5));
		money += amount * 1.5; // with super praise
	}
	
}
System.out.println("run out of sandwiches...");
System.out.println("total money: " + money + "total buys: " + buys);
	}

}
