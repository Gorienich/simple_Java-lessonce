package simpleJava;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int[] b = new int[5];
		int[] c = new int[4];
		for (int i = 0; i < b.length; i++) {
			System.out.println("enter number of two diggits " + (i + 1) + " of arr b");
			b[i] = in.nextInt();
			while (b[i] < 10 || b[i] > 99) {
				System.out.println("incorrect input enter a number");
				b[i] = in.nextInt();
			}

		}
		System.out.println();
		for (int i = 0; i < c.length; i++) {
			System.out.println("enter number of two diggits" + (i + 1) + " of arr c");
			c[i] = in.nextInt();
			while (c[i] < 10 || c[i] > 99) {
				System.out.println("incorrect input enter new number");
				c[i] = in.nextInt();
			}
		}
		int[] a = Intersect(b, c);
		System.out.println();
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		in.close();
	}

	public static int[] Intersect(int[] b, int[] c) {
		
		int check = 0;   //  variable to checking 
		 // check minimum length
		if(b.length <= c.length) 
			check = b.length;	
		else 
			check = c.length;
		// create arrA length minimum  with position true
		 boolean [] steparr =new boolean [check];
		 for(int i = 0; i< steparr.length; i++)  
			 steparr[i] = true;
		 // create correct length of arrA
		 int [] a =new int[check];
          // checking numbers between arrB & arrC and create in arrA
              for (int i = 0; i < a.length; i++)  // loop arrA
              
            	 
		       	for (int k = 0; k < b.length; k++) { // loop arrB
				    for (int j = 0; j < c.length; j++)  // loop arrC
				    {  
				    	if (b[k] == c[j] && steparr[i]==true); //    condition if numbers between arrB & arrC are equals and field is free
							a[i] = c[j];
				    }
		        // close free field of stepArr[i]
		            steparr[i] =false;
		       	}
           
		return a;
	}
}

