package examTraining1;

public class storeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store myStore = new Store();
		Tablet t1 = new Tablet("galaxy", "revolution", 'A', 14.5, 1100.00);
		Tablet t2 = new Tablet("Asus", "westEyes", 'A', 14.5, 3000.00);
		System.out.println(t1.toString() + "***tostring***");
		System.out.println(myStore.addTablet(t1));

		System.out.println(myStore.addTablet(t2));
		myStore.toStringSystems();
		for (int i =0; i< 10; i++)
		{
			myStore.addTablet(new Tablet("name X" , "kind Z", 'W', ((double)(i+2)), ((double)((i+1) * (i+1)))) );
			myStore.addTablet(new Tablet("name X" , "kind Z", 'A', ((double)(i+2)), ((double)((i+1) * (i+1)))) );
			myStore.addTablet(new Tablet("name X" , "kind Z", 'I', ((double)(i+2)), ((double)((i+1) * (i+1)))) );
		}
		Tablet t3 = new Tablet("Asus", "westEyes", 'A', 14.5, 113000.00);
		System.out.println(myStore.addTablet(t3));
		System.out.println(myStore.toString() + "after adding");
		System.out.println("free space");
		int size = myStore.sortStore();
		System.out.println(size);
		//System.out.println();
		//int [] arr = {2,5,5,7,2,4,1,3,2,5,5,1};
		//int [] arr2 = myFun(arr);
		//for(int i = 0; i< arr2.length; i++)
			//System.out.print(arr2[i]  + "  ");
		
	}
public static int[] myFun(int [] arr) {
	int pos =0;
	int count =0;
	int [] result = new int[arr.length];
	for(int i=0; i< arr.length-1; i++)
	{
		for(int j = i+1; j< arr.length; j++)
		{
			if( arr[i] == arr[j])
				count++;
		}
			
		if(count >2)
			result[pos++] = arr[i];
		count =0;
	}
	return result;
}
}
