package simpleJava;

public class stars2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i = 1; i <=9; i++) {
	int x = (i <=5) ? 5 -i : i-5;
	for(int j = 1; j<=x; j++)
		System.out.print(" ");
	x= ( i <=5 ) ? i : 10-i;
	for(int k = 1; k <=x; k++)
		System.out.print("* ");
	    System.out.println();
}
	}

}
