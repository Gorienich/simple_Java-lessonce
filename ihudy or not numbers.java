package simpleJava;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 1125564;
		int number = 312548;

		System.out.println(ihudy(x));
		System.out.println(isUniqe(number));

		// strongRankArr(arr);
		System.out.println();
		// strongRankArr(arr2);
		// strongRankArr(arr3);
	}



	///////////////////////////////////////////////////
	public static boolean ihudy(int num) {
		int check = num;

		while (check != 0)
		{
			int diggit = check % 10;
			check /= 10;
			int cherit = check % 10;
			if (diggit == cherit)
				return false;
			
			int step = check /= 10;
			while (diggit != cherit && step == 0)
			{
				cherit = step % 10;
				if (cherit == diggit)
					return false;
				else
					step /= 10;
			}

		}

		return true;

	}
//////////////////////////////////////////////////

	public static boolean isUniqe(int num) {
		int temp = num, count = 0;
		while (temp != 0) {
			count++;
			temp /= 10;
		}
		temp = num;
		int[] arr = new int[count];

		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = temp % 10;
			temp /= 10;
		}
		for (int i = 0; i < arr.length; i++)
			for (int j = i + 1; j < arr.length - 1; j++)
				if (arr[i] == arr[j])
					return false;

		return true;
	}
/*
	///////////////////////////////////////////////////

	public static boolean iHudiArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (!ihudy(arr[i]))

				return false;
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					return false;
			}
		}

		return true;

	}

	//////////////////////////////////////////////////
	public static int strongRank(int num) {
		int ans = num % 100;
		return ans;

	}

	/////////////////////////////////////////////////////////
	
	public static boolean strongRankArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (!ihudy(arr[i]))
				return false;
			for (int j = i + 1; j < arr.length; j++)
				if (strongRank(arr[i]) == strongRank(arr[j]))
					return false;

		}

		return true;

	}
	*/
}
