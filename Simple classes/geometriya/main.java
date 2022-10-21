package R28q2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please choose option:\n 1- circle\n 2- polleogram\n 3- square\n 4- triangle\n 5- rectangle\n 6- exit");
		int option = input.nextInt();
		shape elem;
		while (option!=6)
		{
			switch(option)
			{
			case 1:
				System.out.println("Enter double radius and pi (3.14)");
				elem = new circle(input.nextDouble(),input.nextDouble());
				elem.print();
				break;
			case 2:
				System.out.println("Enter double length and width");
				elem = new polleogram(input.nextDouble(),input.nextDouble());
				elem.print();
				break;
			case 3:
				System.out.println("Enter  double length and width");
				elem = new square(input.nextDouble(),input.nextDouble());
				elem.print();
				break;
			case 4:
				System.out.println("Enter double length and width");
				elem = new triangle(input.nextDouble(),input.nextDouble());
				elem.print();
				break;
			case 5:
				System.out.println("Enter  double length and width");
				elem = new rectangle(input.nextDouble(),input.nextDouble());
				elem.print();
				break;
			default:
				System.out.println("Error enter num between 1-5");
				break;
			}
			System.out.println("Please choose option:\n 1- circle\n 2- polleogram\n 3- square\n 4- triangle\n 5- rectangle\n 6- exit");
			 option = input.nextInt();
		}
	System.out.println("goodbuy");
	input.close();
	}

}
