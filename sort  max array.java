package simpleJava;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 11, 8, 91, 5, 14 };
		secret(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void secret(int arr[]) {
		int[] b = new int[100];
		int[] counter = new int[10];
		int i, j, k, r, a = 0, d = 1, l, p;
		l = arr[0];
		for (i = 1; i < arr.length; i++)
			if (arr[i] > l)
				l = arr[i];
		while (l > 0) 
		{
			a++;
			l /= 10;
		}
		for (p = 0; p < a; p++)
		{
			for (i = 0; i < 10; i++)
				counter[i] = 0;
			for (i = 0; i < arr.length; i++)
			{
				r = (arr[i] / d) % 10;
				System.out.println(b[r * 10 + counter[r]] = arr[i]);
				counter[r] += 1;
			}
			i = 0;
			for (k = 0; k < 10; k++) 
			{
				for (j = 0; j < counter[k]; j++)
				{
					arr[i] = b[k * 10 + j];
					i++;
				}
			}
			
			d *= 10;
		}
	}
}
