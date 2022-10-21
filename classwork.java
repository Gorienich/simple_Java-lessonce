import java.util.Random;
import java.util.Scanner;

public class R19L1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			/*
		 * L1
		 */

		// TODO Auto-generated method stub

		int[] grads = new int[3];
		int sumgrads = 0;
		for (int i = 0; i < grads.length; i++) {
			System.out.println("enter a grad of student:  " + (i + 1));
			grads[i] = input.nextInt();
			sumgrads += grads[i];
		}
		for (int i = 0; i < grads.length; i++) {
			if (grads[i] < (sumgrads / 3.0))
				System.out.println(i + " < " + sumgrads / 3.0);
			else if (grads[i] > (sumgrads / 3.0))
				System.out.println((i + 1) + " > " + sumgrads / 3.0);
			else if (grads[i] == (sumgrads / 3.0))
				System.out.println(i + " = " + sumgrads / 3.0);

		}
	}
	}

	/*
	 * L2
	 */
/*
	int[] num = new int[3];
	int maxmark = -1;
	int minmark = 101;
	int maxstd = 0;
	int minstd = 0;
	int mark=0;for(
	int i = 0;i<num.length;i++)
	{
		System.out.println("enter a mark of student: " + (i + 1));
		num[i] = input.nextInt();

		if (num[i] > maxmark) {
			maxmark = num[i];
			maxstd = i + 1;
		}
		if (num[i] < minmark) {
			minmark = num[i];
			minstd = i + 1;
		}
	}System.out.println("max mark is: "+maxmark+", by student: "+maxstd);System.out.println("min mark is: "+minmark+", by student  "+minstd);
	}
}

*/
	/*
	 * L3
	 */
/*
	int[] num = new int[10];
	double sum = 0;
	double avrg = 0;for(
	int i = 0;i<num.length;i++)
	{
		System.out.println(" enter a mark:");
		num[i] = input.nextInt();
		sum += num[i];
	}avrg=sum/num.length;for(
	int i = 0;i<num.length;i++)
	{

		System.out.println("average is: " + avrg + " the defarence to average is:  " + Math.abs(num[i] - avrg));

	}}}
*/
	/*
	 * L4
	 */
/*
	int[] num = new int[100];
	Random rnd = new Random();
	int sum = 0;
	int rnd1 = rnd.nextInt(101);
	int rnd2 = rnd.nextInt( 101)+100;for(
	int i = 0;i<num.length;i++)
	{
		if (i % 2 == 0)
			sum += rnd1;
		else
			sum += rnd2;
	}System.out.println("the sum of numbers: "+sum+"average is: "+(double)sum/num.length);}}
*/
	/*
	 * L5
	 */
/*
	System.out.println(" enter a number for array");
	int num = input.nextInt();if(num<0)System.out.println("enter only possitive numbers");
	int[] numbers = new int[num];
	int[] numberspossitive;
	int counter = 0;
	int nump = 0;
	int[] numbersnegative;
	int counter1 = 0;
	int numn = 0;for(
	int i = 0;i<numbers.length;i++)
	{
		System.out.println("enter a number: ");
		int num1 = input.nextInt();
		numbers[i] = num1;
		if (numbers[i] >= 0)
			counter++;
		nump = numbers[i];
		if (numbers[i] < 0)
			counter1++;
		numn = numbers[i];
	}numbersnegative=new int[counter1];numberspossitive=new int[counter];for(
	int j = 0;j<numberspossitive.length;j++)System.out.print(", ");for(
	int j = 0;j<numbersnegative.length;j++)System.out.print(", ");}}
	
	
	
	*/
	/*
	 * L6
	 */
	/*	
	System.out.println("enter a numbers of students in axem:");
	int students = input.nextInt();
	int[] std = new int[students];
	double sum = 0;
	int counter = 0;for(
	int i = 0;i<std.length;i++)
	{
		System.out.println("enter a grade of student:  " + (i + 1));
		std[i] = input.nextInt();
		sum += std[i];
	}
	double avrg = sum / std.length;for(
	int i = 0;i<std.length;i++)
	{
		if (std[i] >= avrg)
			counter++;
	}System.out.println("there is: "+counter+", students passed the axem!"+"more than average: "+avrg);
	}
}
*/
		/*
		 * L7
		 */
		/*
	System.out.println("enter number of players:");
	int players = input.nextInt();
	int[] pl = new int[players];
	int minplayer = pl[0];
	int choise = 0;
	int i;
	while(!(choise==-1))
	{
		System.out.println("enter your choises of player points from: 1,  to: " + pl.length  + " to stop enter -1:");
		choise = input.nextInt();
		for (i = 0; i <= pl.length; i++)
			if (pl[i]==choise)
			pl[i]+=choise;
		if (pl[i] < minplayer)
			minplayer = pl[i];
	}

	System.out.println("less voises is: " + minplayer);
    }
}
*/
	
/*
 * L8
 */
		/*
	int[] players = new int[4];
	int points = 0;
	int winner = players[0];System.out.println("how many rounds?");
	int rounds = input.nextInt();for(
	int j = 1;j<=rounds;j++)
	{
		for (int i = 0; i < players.length; i++) {
			if (players[i] > winner)
				winner = players[i];
		}

		System.out.println("enter points of first player:  " + " in round " + j);
		points = input.nextInt();
		while (!(points == 7 || points == 3 || points == 1 || points == 0)) {
			System.out.println("enter correct points");
			points = input.nextInt();
		}
		if (points == 7)
			players[0] += 7;
		if (points == 3)
			players[0] += 3;
		if (points == 1)
			players[0] += 1;
		if (points == 0)
			players[0] += 0;

		System.out.println("enter points of second player:  " + " in round " + j);
		points = input.nextInt();
		while (!(points == 7 || points == 3 || points == 1 || points == 0)) {
			System.out.println("enter correct points");
			points = input.nextInt();
		}
		if (points == 7)
			players[1] += 7;
		if (points == 3)
			players[1] += 3;
		if (points == 1)
			players[1] += 1;
		if (points == 0)
			players[1] += 0;

		System.out.println("enter points of third player:  " + " in round " + j);
		points = input.nextInt();
		while (!(points == 7 || points == 3 || points == 1 || points == 0)) {
			System.out.println("enter correct points");
			points = input.nextInt();
		}

		if (points == 7)
			players[2] += 7;
		if (points == 3)
			players[2] += 3;
		if (points == 1)
			players[2] += 1;
		if (points == 0)
			players[2] += 0;

		System.out.println("enter points of forth player:  " + " in round " + j);
		points = input.nextInt();
		while (!(points == 7 || points == 3 || points == 1 || points == 0)) {
			System.out.println("enter correct points");
			points = input.nextInt();
		}
		if (points == 7)
			players[3] += 7;
		if (points == 3)
			players[3] += 3;
		if (points == 1)
			players[3] += 1;
		if (points == 0)
			players[3] += 0;

	}System.out.println("player 1 has: "+players[0]+", points /"+" player 2 has: "+players[1]+", points /"+" player 3 has: "+players[2]+", points /"+" player 4 has: "+players[3]+", points");for(
	int i = 0;i<players.length;i++)
	{
		if ((players[i]) > (players[1]) && ((players[i]) > (players[2]) && ((players[i]) > (players[3]))))
			winner = i;
		if ((players[i]) > (players[0]) && ((players[i]) > (players[2]) && ((players[i]) > (players[3]))))
			winner = i;
		if ((players[i]) > (players[0]) && ((players[i]) > (players[1]) && ((players[i]) > (players[3]))))
			winner = i;
		if ((players[i]) > (players[0]) && ((players[i]) > (players[1]) && ((players[i]) > (players[i]))))
			winner = i;
	}System.out.println("the winner is: "+(winner+1)+",  player! congraglation!!!");

}}
*/
