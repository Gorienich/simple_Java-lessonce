package ClassWork;
import java.util.Scanner;
public class Nodes_List {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Node<Integer> chain = null;
		// simple node chain
		int sum =0;
		for (int i = 0; i< 5; i++) {
			chain = new Node<Integer>((i+2), chain);
		}
		int min = chain.getvalue();
		int max= chain.getvalue();
		Node<Integer> pos = chain;
		pos = pos.getNext();
		sum = chain.getvalue();
		while(pos != null)
		{
			sum += pos.getvalue();
			//check max
			if(pos.getvalue() > max)
				max = pos.getvalue();
			//check min
			if(pos.getvalue()< min)
				min = pos.getvalue();
			//next chain
			pos = pos.getNext();
		}
		System.out.println("sum: " + sum);
		System.out.println("min: " + min);
		System.out.println("max: " + max);
		
	}

}
