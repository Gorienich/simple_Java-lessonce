package exam_lvl1;
/*
 * Special arr have even length
 * all numbers positive
 * all numbers have 3-5 digits
 * half of numbers is not even numbers
 * 
 * write function return true or false if the ar is special
 * 
 * algorithm complexity explain.
 */
public class spacialArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = { 152, 70002, 253, 500, 751, 9102, 817, 23423};
int[] arr2 = {311, 90, 112, -123};
System.out.println(CheckArr(arr));
System.out.println(CheckArr(arr2));
	} 
	public static boolean CheckArr(int[]arr) {
		if(arr.length%2 != 0) {
			return false;
		}
		int count = 0;    // counter for positive numbers
		for(int i =0; i<arr.length; i++) {
			if(arr[i] < 0 || arr[i] < 100 || arr[i] > 99999)  // check digits amount and positive numbers
				return false;
			if(arr[i] % 2 == 0)
				count++;
		}
		if(count != arr.length/2) {   // check if half numbers possitive
			return false;
		}
		
		return true;
	}
/*
 * Q (n)
 * 
 * we know length 
 * but we have to go thrue array with "for"
 */
 
	
}

