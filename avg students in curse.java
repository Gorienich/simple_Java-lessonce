package classWork1907;
import java.util.Scanner;
public class lesson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
System.out.println("enter how many students have saiber fuculture");
int saiber =input.nextInt();
System.out.println("enter how many students have electricy fuculture");
int el =input.nextInt();
System.out.println("enter how many students have Math fuculture");
int Math= input.nextInt();
System.out.println("enter how many students have Biotechnology fuculture");
int bio =input.nextInt();
double sum = 0.0;
double allsum = 0.0;


for(int i =0; i<saiber; i++) {
	System.out.println("enter age of student: " + (i+1) + ",  of saiber");
	sum += input.nextInt();
}
System.out.println("avarege of saiber age is: " + (sum/saiber));

allsum +=sum;
sum = 0;

for(int i =0; i<el; i++) {
	System.out.println("enter age of student: " + (i+1) + ",  of electicy fuculture");
	sum += input.nextInt();
}
System.out.println("avarege of saiber age is: " + (sum/el));
allsum +=sum;
sum = 0;

for(int i =0; i<Math; i++) {
	System.out.println("enter age of student: " + (i+1) + ",  of Math fuculture");
	sum += input.nextInt();
}
System.out.println("avarege of saiber age is: " + (sum/Math));
allsum +=sum;
sum = 0;


for(int i =0; i<bio; i++) {
	System.out.println("enter age of student: " + (i+1) + ",  of Biotechnology fuculture");
	sum += input.nextInt();
}
System.out.println("avarege of saiber age is: " + (sum/bio));
allsum +=sum;
sum = 0;

System.out.println(" all avarege is " +  (allsum/ (saiber + Math + bio + el)));
	}

}
