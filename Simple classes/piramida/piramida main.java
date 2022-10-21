package Piramida;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
piramida P = new piramida();
System.out.println("enter a side ");
double side = input.nextDouble();
System.out.println("enter a high of piramida");
double width = input.nextDouble();
P = new piramida(side,width);
P.baseArea(side, width);
System.out.println();
P.piramidaArea( side, width);
System.out.println();
System.out.println("enter a length of box");
double length =input.nextDouble();
System.out.println("enter a side of box");
double sidebox = input.nextDouble();
System.out.println("enter a high of box");
double high = input.nextDouble();

P.box(high, length, sidebox);
input.close();
	}

}
