package snks;
import java.util.Scanner;
public class targil4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println(" enter 'a'");
double a = input.nextDouble();
System.out.println("enter 'b'");
double b = input.nextDouble();
System.out.println("enter 'c'");
double c = input.nextDouble();

if(  Math.sqrt ( Math.pow(b, 2) -( 4 * a*c)) == 0) {
		System.out.println("there is one way to acount");

System.out.println(-b/(2*a));}

if(Math.sqrt ( Math.pow(b, 2) -( 4 * a*c)) < 0) {
	System.out.println("there is no way to acount");}


if(Math.sqrt ( Math.pow(b, 2) -( 4 * a*c)) > 0) {
	System.out.println("there is two way to acount");

System.out.println((-b + (Math.sqrt ( Math.pow(b, 2) -( 4 * a*c))))   /(2*a)  );
System.out.println( ( -b - (Math.sqrt ( Math.pow(b, 2) -( 4 * a*c))))  /(2*a));
}
	}

}
