package counters;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Class_W_sortARR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	Random rnd = new Random();
	
/*
 * all function was checked use by your necessary follow instructions
 */
int [] arr = {1,5,7,10,11};
int [] arr2 = {17,14,9,6,2};
mergeMax(arr,arr2);
	}
	
// L4 
// in: array ,index start index, finish index
// out: sorted array to max from start to finish
public static void sortIndex(int[] arr, int start,int finish) {
	int temp;  // save next value
	for(int i=start; i <= finish; i++)
		for(int j = start; j<finish; j++)
		{
			if (arr[j] > arr[j+1])
			{
				temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
			}
		}		
	
	// show array
for(int i = 0; i< arr.length; i++)
	System.out.print(arr[i] + ", ");
}

// L5 
// in: array
//out: sorted array by halves
public static void sort2half(int [] arr) {
	// use prev function
	sortIndex(arr, 0, arr.length/2); 
	sortIndex(arr, arr.length/2, arr.length-1);	
}

//L6
// in: array , number
// out: sorted array by steps of number
public static void sortDivNumf(int [] arr,int num) { 
	for(int i =0; i < arr.length-num; i+=num)
		// use prev func
		sortIndex(arr, i, i+num);	
}

// L7 
// in: array of workers
// out: 10 workers with biggest stage and their number and 5 workers with lesses stage and their number
/*
 * i created random array of 25 workers just for check  in question needed 500
 * no validation to correct inputs
 */
public static void workers() {
    Random rnd = new Random();       // use to create workers stage
	int [] workers = new int[25];    // create array for save data of workers
	
	// random stage for each worker
	for(int i=0; i<workers.length; i++)      
		workers[i] = rnd.nextInt(50)+1;
	
	// check array do not loose index of workers!
	int [] WorkersStage_check = new int [workers.length]; 	
	for(int i =0; i<workers.length; i++)         
		WorkersStage_check[i] = workers[i];   // insert vals
	
	// sort stages of all workers from min to max 
	sortIndex(WorkersStage_check, 0, WorkersStage_check.length-1);	
	
    //Prepare array to 5 most new workers
	int [] newWorkers = new int [5]; 
	System.out.println("\n" + "check min");
	
	for(int i= 0; i< newWorkers.length; i++)
	{
		newWorkers[i] = WorkersStage_check[i];  // insert min values into array of new workers
		System.out.print(newWorkers[i] + ", "); // output min stage for check
	}
	System.out.println();
	
	//show most new workers
	System.out.println("most new workers");
     int check =0;        //  worker number from last loop for correct checking 
     boolean flag;        // need to know when stop the loop
     
    //run through most new workers
	for(int i = 0; i<newWorkers.length; i++)
	{	
		flag = true; // allow checking
		// find number of worker by his stage
		for(int j =0; j <workers.length && flag; j++)  
		{
			// if we had already this worker number 
            if(workers[j] == check)     
            {
            	 j++;         // next worker
            	 check =0;    // drop number of last worker
            }
			
            // if we found the same stage ass in newWorkers
			if( newWorkers[i] == workers[j]) 
			{			
			    check = newWorkers[i]; //save number of worker
				System.out.println("worker: " + (j+1) + ",  stage: " + newWorkers[i]);	 // show worker number and his stage in new Workers	
				flag = false; // stop checking this round
			   
			}
		}
	}
	// Prepare array for workers with biggest stage
    int [] oldWorkers = new int [10]; 	
	int index = WorkersStage_check.length-1;  // get index of max stage 
	
	System.out.println("most old workers");
	// loop for oldest workers
	for(int i = 0; i< oldWorkers.length; i++)         
		oldWorkers[i] = WorkersStage_check[index--];  // insert max stage in array of oldest workers 
	
	//output for check 
	for(int i=0; i<oldWorkers.length; i++)
		System.out.print(oldWorkers[i] + ", ");  // show oldest workers check
	System.out.println();
	
	
	// run through most oldest workers
	for(int i = 0; i<oldWorkers.length; i++)
	{		
		flag = true; // allow checking
		// find number of worker by his stage
		for(int j =0; j <workers.length && flag; j++)  
		{
            if(workers[j] == check)     // if we have already this worker
            {
            	 j++;         // go to check next worker
            	 check =0;    // drop check
            }
			  
			if( oldWorkers[i] == workers[j] ) // if we got same stage of worker
			{			
			    check = oldWorkers[i];       // collect stage in array of oldestWorkers
				System.out.println("worker: " + (j+1) + ",  stage: " + oldWorkers[i]);	 // show worker number and his stage in oldWorkers			
				flag = false;      // stop this round
			}
		}	
	}	
}

// L11 
// in: array, number , start index, finish index
// out: if number betwen start and finish return index if we didn't found number return -1
public static int findIndex_2indx(int [] arr,int num, int start, int finish) {   // finish can not be more than arr.length-1
	int index=-1;
	for(int i =start; i<=finish; i++)
		if(arr[i] == num)
			index = i;

	return index;
}

// L12 
// in: array
// out: if one half array have the same numbers as the second half => true  else false
public static boolean checkHalf(int [] arr) {
	int count = 0; // count the same numbers 
	int checkVal = 0;
	boolean flag;
	// doesn't Meter if array was sorted or not
	//    {1, 2, 3, 4, 5,    2,1,5,4,3}
	// go first half
	for(int i=0; i<arr.length/2; i++) 
	{
		flag = true;
		//go second half
		for(int j=arr.length-1; j>arr.length/2 && flag; j--)	
		{
			if(arr[i] == checkVal)
			 {
				 j++;
				 checkVal =0;
			 }
			
			if(arr[i] == arr[j])    // find matches number
			{
				count++;	            // collect matches
				checkVal = arr[j];
				flag =false;
				
			}
		}
			 
	}		

	// if we don't have same numbers in both halves of array
	if(count!=arr.length/2)         
		return false;  
						
	return true;   // all good
	
}


// L13
// in: 2 sorted arrays 
// out: 1 sorted array from both arrays
public static void merge(int [] a1, int [] a2) {
	int p1 =0, p2 =0, p3=0;
	int [] a3 = new int [a1.length + a2.length];
	
	while(p1<a1.length && p2<a2.length)
	{
		if(a1[p1] < a2[p2])
		{
			a3[p3] = a1[p1];
			p1++;
		}
		else
		{
			if(a2[p2] < a1[p1])
			{
				a3[p3] = a2[p2];
				p2++;
			}
			else 
			{
				a3[p3] = a1[p1];
				p3++;
				a3[p3] = a2[p2];
				p1++;
				p2++;
			}	
		
		}
		p3++;
	}
		while(p1 < a1.length)
		{
			a3[p3] = a1[p1];
			p2++;
			p3++;
		}
		while(p2 < a2.length)
		{
			a3[p3] = a2[p2];
			p2++;
			p3++;
		}
	

for(int i =0; i< a3.length; i++)
	System.out.print(a3[i] + ", ");
	
}

//L14
// in: 1 array min-max , 1 array max-min
// out: 1 sorted array min-max
public static void mergeMax(int [] a1, int [] a2) {
	int p1 =0, p2 =a2.length-1, p3=0;
	int [] a3 = new int [a1.length + a2.length];
	
	while(p1<a1.length && p2 >= 0)
	{
		if(a1[p1] < a2[p2])
		{
			a3[p3] = a1[p1];
			p1++;
		}
		else
		{
			if(a1[p1] > a2[p2])
			{
				a3[p3] = a2[p2];
				p2--;
			}
			else 
			{
				a3[p3] = a1[p1];
				p3++;
				a3[p3] = a2[p2];
				p1++;
				p2--;
			}	
		
		}
		p3++;
	}
		while(p1 < a1.length)
		{
			a3[p3++] = a1[p1++];		
		}
		while(p2 >= 0)
		{
			a3[p3++] = a2[p2--];	
		}
	

for(int i =0; i< a3.length; i++)
	System.out.print(a3[i] + ", ");
	
}

//L15
// in: 2 sorted arrays min-max with possible same numbers
// out: 1 sorted array min-max without same numbers
public static void mergeSameNum(int [] a1, int [] a2) { // sorted arrays min-max
	int [] a3;
	int p3 =0,  p1=0,  p2=0;  // pointers
	
	// correct index for ret arr	
	a3 = new int[a2.length + a1.length];
	
	while(p1<a1.length && p2 < a2.length)
	{
		if(a1[p1] < a2[p2])
		{
			if(a3[p3] == a1[p1])
				p1++;
			else
				a3[p3] = a1[p1++];						
		}
		else
		{
			if(a1[p1] > a2[p2])
			{
				if(a3[p3] == a2[p2])
					p2++;
				else
					a3[p3] = a2[p2++];								
			}	
		
		}
		p3++;
	}
	
	while(p1 < a1.length)
	{
		a3[p3++] = a1[p1++];		
	}
	while(p2 < a2.length)
	{
		a3[p3++] = a2[p2++];	
	}
	
	//print arr
	for(int i =0; i< a3.length; i++)
			System.out.print(a3[i] + ", ");
}



}
