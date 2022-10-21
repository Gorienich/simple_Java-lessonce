package snks;
import java.util.Random;
public class targil2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random rnd = new Random();
int num = rnd.nextInt(1000000);
int counter = 0;
int a = num%10;
int b = num/10%10;
int c = num/100%10;
int d = num/1000%10;
int e = num/10000%10;
int f = num/100000;
if(a == 5)
	counter++;
if(b == 5)
	counter++;
if(c == 5)
	counter++;
if(d == 5)
	counter++;
if(e == 5)
	counter++;
if(f == 5)
	counter++;
System.out.println("num is: " + num + " counter of 5 " + counter);
	}

}
