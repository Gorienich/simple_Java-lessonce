package ColoryFood;
import java.util.Random;
import java.util.Scanner;
public class mainTest {

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner in = new Scanner(System.in);
		Food [] f = new Food[100];
		
		//insert in array food
		for(int i =0; i<f.length; i++)
		{
			System.out.println("enter food number: "  + (i+1) + " name/fat/cal/mineral");
			f[i] = new Food(in.next(), in.nextDouble(), in.nextDouble(), in.nextDouble());
		}
			
		//callback lean foo
		lean_less5(f);
		
	}

	// out: countr of food in arr that has fat less then 5%
	public static void lean_less5(Food [] arr)
	{
		int count =0;
		for(int i=0; i< arr.length; i++)
			if(arr[i].getFat() < 5)
				count++;
		System.out.println("count of lean food:  " + count );
				
	}
}
