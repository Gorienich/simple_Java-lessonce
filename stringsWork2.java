import java.util.Scanner;


public class Q18 {

	public static void main(String[] args) {
	
		/*
		 * 
		 
		Scanner input= new Scanner(System.in);
		System.out.println("enter a sentence:");
		String sentance=input.nextLine();
		if( sentance.length() % 2 == 0)
		System.out.println(sentance.charAt(0));
		else 
			System.out.println(sentance.charAt(sentance.length()-1) );
		input.close()
	}

}
*/
		
/*
 * L2
 * 
 */ 
	/*	
		Scanner input= new Scanner(System.in);
		int counter =0;	
		System.out.println("enter a sentence:");
		String sentance=input.nextLine();
		System.out.println("enter a tab that you whant to check");
		char str = input.next().charAt(0);
		for(int i = 0; i<sentance.length(); i++) {
			if(str== sentance.charAt(i))
		counter++;		
		}
		System.out.println("the sum of char repeat is:   " + counter);
		input.close();
	}
}

*/
	/*
	 * L3	
	 */
	
	/*	
		Scanner input= new Scanner(System.in);
	
		String maxsentance="";
		System.out.println("enter a sentances, to stop enter: '*** ' ");
		String sentance=input.nextLine();
		String stop="***";
		if(sentance==stop)
			System.out.println(stop);
		while(! (sentance.equals(stop))  ) {
			 sentance=input.nextLine();
			if(sentance.length() > maxsentance.length()) 
				maxsentance=sentance;
			
			
		
		}System.out.println(maxsentance);
	}
}
*/
	
		
		
	/*
	 * L4	
	 */
       
/*
		Scanner input= new Scanner(System.in);
         System.out.println("enter tree string");
          String str=input.nextLine();
          String str1=input.nextLine();
          String str2= input.nextLine();
          System.out.println(str.compareTo(str2 + str + str1));   
     

	}
}
*/
/*L5
 * 
 */
		/*
		Scanner input= new Scanner(System.in);
        System.out.println("enter a string");
        String str=input.nextLine();
        System.out.println(indexOf);
        
	}
}

*/

/*
 * L6
 */

/*
		Scanner input= new Scanner(System.in);
		System.out.println("enter a sentance to revers:");
		String sentance=input.nextLine();
		
	  String result = "";
	  for (int i = 0; i < sentance.length(); i++) {
	     result = sentance.charAt(i) + result;
	  }
	System.out.println(result);

	
	}
}
		
	*/	
		
