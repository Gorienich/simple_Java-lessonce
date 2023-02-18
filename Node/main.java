package counters;
import java.util.Scanner;
import java.util.Random;
public class main {

	public static void main(String[] args) {

	//System.out.println("best student is: " + bestSTD());
		//count1_10();
		rndCube1_19();
	}
// L1
public static void bestSTD() {  
	/*   /L1/
	*    program to find out who is the best from 5 students
	*    this program getting 40 times your chose from 1-5 
	*    output number of best student
	*/
	Scanner in = new Scanner(System.in);
	int [] arrSTD = new int[5];            //create counters
	int choase = 0;
	for(int i =0; i < arrSTD.length; i++)  // Prepare counters
		arrSTD[i] =0;
	
	System.out.println("enter your choise between 1-5 "); // no condition to less than 40 times no validation!
	int turn = 0;
	while(turn < 10)  // loop for chose
	{
		 choase = in.nextInt(); 
		for(int i =0; i< arrSTD.length; i++)   // up to counter
		{
			if(choase == i+1)
			{
				System.out.println("enter your choise of student ");
				arrSTD[i]++;
				continue;
			}
				
		}
		turn++;   // step forward
		
		
	}
	int max =0; 
	int check = arrSTD[0];
	for(int i =1; i < arrSTD.length; i++)
	{
		if(check < arrSTD[i])
		{
			check = arrSTD[i];
			max = i;
		}
			
	}  	
}

// L2
public static void count1_10() {  
	/*
	 * program get 1000 numbers
	 * output for each number between 1-10;
	 * numbers how many times was number 1-10 
	 */
	Scanner in =new Scanner(System.in);
	//vars
	int [] counters = new int [10];
	int number =0;
	
	for(int i = 0; i<counters.length; i++) // not all program create 0 in each index
		counters[i] =0;
	
	for(int i = 0; i< 10; i++)
	{
		System.out.println("input your number");
		number = in.nextInt();
		if(number>0 && number <11)
			counters[number-1]++;
	}
	for(int i =0; i < counters.length; i++)
		System.out.print( (i+1) + " was: " + counters[i] + "\n");
}


//L3
public static void printDigits0_9() {
	/*
	 * program get 8 positive numbers 
	 * no valid 0000000 without any other digits or 00001
	 * output how many times each digit was
	 * 
	 */
	Scanner in = new Scanner(System.in);
	int [] counters = new int [10];
	for(int i = 0; i<counters.length; i++) // not all program create 0 in each index
		counters[i] =0;
	
	int number =0; int check =0; int digit =0; // vars we don't know max number
	
	for(int i = 0; i < 8; i++)   // getting 8 numbers
	{
		System.out.println("enter a number");
		number = in.nextInt();   // num from user
		check = number;           // don't need to drop number var to check 
		if(check == 0)     // if we got 0 from user
			counters[0]++;
		
		while(check != 0)  // count digits
		{
			digit = check % 10; // get right digit from number
			counters[digit]++;  // ++ to counter
			check /= 10;   // drop right digit			
		}
	}
	for(int i =0; i < counters.length; i++)
		System.out.print(i + ", was: " + counters[i] + "\n");
}

//L4
public static void toys() {
	/* mission statement:
	 * 1 check for 7 days witch toys are more sally 1-500  and output their number and times of sails at least 1 sell
	 * 2 stop selling each day with sell -1
	 * 3 show two top toys and their sells
	 * 4 how many toy wasn't sold at all
	 * 5 what was avg of all sails in 7 days
	 * 6 how many toys was sold less than half of avg in 7 days
	 * 
	 * Algorithm:
	 * 1.create vars to use
	 * 1.1 array of counters[500]
	 * 1.2 drop counters
	 * 1.3 create 2 vars best toys    ( p.s in question wrote 3 best toys?!?!?! Incorrect condition!!!  i worked with 2 best toys next time please be correct in your missions statements)
	 * 1.4 counter of sails 
	 * 1.5 counter of toys
	 * 1.6 number of sold toy
	 * 
	 * 2. loop 7 days
	 * 2.1 output "input number of toy you what to sell"
	 * 2.2 input number of toy
	 * 2.3 if == -1
	 * 2.4 output "Good Buy"
	 * 2.5 start selling day (while)
	 * 2.5.1 count the sail
	 * 2.5.2 count the avg
	 * 2.5.3 output "input number of toy you what to sell"
	 * 
	 * 3.counter for toys
	 * 3.1  max toy counters[0]
	 * 4. loop find max
	 * 4.1 output how many toys was sold
	 * 5. max2 toy counters[1]
	 * 6. loop find max2
	 * 7. output avg 7 days
	 * 8. loop output how many toys was sold
	 * 9. output how many toys was sold with less than half of avg
	 */
	Scanner in = new Scanner(System.in);
	int [] toys = new int[5];
	   for(int i =0; i<toys.length; i++)
		   toys[i] =0;
	   
	   int countAvg =0;                   // count all sail 7 days
	   int numberSoldToy =0;              // input selling
	   
       // var to save toy number best toy  can not be same toys
	   int index2 =0;  int max2 =0;       
	   int max = toys[0]; int index =0;   
	   int counter =0;                    // in case of use drop counter after using
	   
	   // star selling test
	   for(int i =1; i<8; i++)   // week
	   {
		   System.out.println("starting selling day: " + i + "\n");
		   System.out.println("input number of sold toy 1-500 to finish enter -1");   
		   numberSoldToy = in.nextInt();     // no validation

		   while(numberSoldToy != -1)   // start selling
		   {
			   toys[numberSoldToy-1]++; // correct index -1
			   countAvg++;              // all sails
			   System.out.println("input number of sold toy 1-500 to finish enter -1"); 
			   numberSoldToy = in.nextInt(); 
		   } 
	
	   }
	    // show toys was sold at least one time
	   for(int i = 0; i < toys.length; i++)
	   {
		   if(toys[i] > 0)
			   System.out.println("toy number: " + (i+1) + "  was sold " + toys[i] + ",  times");
		   else
			   counter++;  // count toys was not sold
	   }
	
	   
	   // find 2 max toys
	   for(int i = 1; i < toys.length; i++)
	   {
		   if(toys[i] > max)
		   {
			   max = toys[i];
		       index = i;
		   }
	   }
	   if(max == toys[0])
	   {
		   max2 = toys[1];     // best toy2
		   for(int i = 2; i < toys.length; i++)
		   {
			   if(toys[i] > max && max2 > toys[i])
				   {
					   max2 = toys[i];
				       index2 = i;
				   }
		   }
	   }
	   else
	   {
		   max2 = toys[0];     // best toy2
		   for(int i = 1; i < toys.length; i++)
		   {
			   if(toys[i] > max && max2 > toys[i])
				   {
					   max2 = toys[i];
				       index2 = i;
				   }
		   }
	   }
	   if(index == 0)   
		   index++;
	   if(index2 == 0)
		   index2++;	     
System.out.println("best toys: \n toy number: " + index + ", solded  " + max + " times \n toy number: " + index2 + ", solded  " +max2);
//toys without selling
System.out.println(counter + ",  toys was'nt sold at all");  
//show avg 
System.out.println("avg of selling:  " + (double)countAvg/toys.length);   
	
counter = 0;   // Prepare counter for using
	   for(int i = 0; i < toys.length; i++) {
		   if(toys[i] > (((double)countAvg/toys.length)/2))
			   counter++;
	   }
	   System.out.println("shop sold " + counter + ", toys with each toy was sold more times then half average... ");
}

//L5
public static void rndCube1_19() {
	Random rnd = new Random();
	int [] counters = new int[19];  // Prepare counters
	   for(int i =0; i<counters.length; i++) 
		   counters[i] =0;
   
	// insert rnd numbers into array of counters
	   for(int i =0; i<10; i++)
		   counters[rnd.nextInt(19)]++;
        
	   for(int i = 0; i< counters.length; i++)
		   System.out.print( counters[i] + ", ");
	   int max = counters[0];
	   System.out.println();
       for(int i = 1; i< counters.length; i++)   // find maxCounter
		   if(counters[i] > max)
			   max = counters[i];
	   
	   for(int i = 0; i< counters.length; i++)   // find same number with maxCounter
		   if(counters[i] == max)
		        System.out.println("the max Counter is: " + (i+1) + " was " + max + " times");
	   

	   
}
}
