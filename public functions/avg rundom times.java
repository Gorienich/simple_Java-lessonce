import java.util.Random;
import java.util.Scanner;

public class hyper4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		Scanner input = new Scanner(System.in);

		System.out.println("enter 'n' number:");
		int counter = 0;
		int n = input.nextInt();
		double avrg = average(n); // import average function to main class
		for (int i = 0; i < n; i++) {
			int grad = rnd.nextInt(101);
			if (grad >= avrg)
				counter++;
		}
		System.out.println(" the average of marks is: " + average(n) + "    number of pass marks is: " + counter);
	}

	public static double average(int n) {
		Random rnd = new Random();
		double sum = 0; // create variable sum
		for (int i = 0; i < n; i++) { // run 'n' times
			int grad = rnd.nextInt(101);
			sum += grad; // save random number in sum
		}
		double average = sum / n; // create average
		return average; // return function to the main class
	}
}
