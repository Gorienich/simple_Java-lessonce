package examTraining1;

public class Store {
	private Tablet [] tablets;
	private int[] systems;
	
	public Store()
	{
		this.tablets = new Tablet [1000];
		this.systems = new int[3];
// drop counters
		systems[0] = 0;
		systems[1] = 0;
		systems[2] = 0;
	}
	
	public boolean addTablet(Tablet tab) 
	{	
		boolean flag = false;
		if (tablets[tablets.length-1] != null)
			return false;
			
		for(int i = 0; i< tablets.length && (flag ==false); i++)
		{
			if(tablets[i] != null && tablets[i].isSame(tab))				
				{
					this.tablets[i].setPrice(Math.max(tab.getPrice(), tablets[i].getPrice()));
					flag =  true;
				}
			else if (tablets[i] == null)
			{
				this.tablets[i] = new Tablet(tab);
				flag = true;
				//break;
				
			}
		}
		
		return flag;
	}

	public int sortStore()
	{
		Tablet [] arr = new Tablet[tablets.length];
		int pos =0;
		
		for(int i =0; i<tablets.length; i++)
		  if(tablets[i] != null && tablets[i].getSystem()=='W')
			{
				arr[pos++] = new Tablet(tablets[i]);
				this.systems[0]++;
			}
				
		
		for(int i =0; i<tablets.length; i++)
			if(tablets[i] != null && tablets[i].getSystem()=='A')
				{
					arr[pos++] = new Tablet(tablets[i]);
					systems[1]++;
				}
		
		for(int i =0; i<tablets.length; i++)
			if(tablets[i] != null && tablets[i].getSystem()=='I')
			{
				arr[pos++] = new Tablet(tablets[i]);
				systems[2]++;
			}
		
		for(int i =0; i< tablets.length; i++)
			this.tablets[i] =arr[i];
		pos =0;
		return (1000 - (systems[0] + systems[1] + systems[2]));
				
	}
	
// print systems
	public void toStringSystems()
	{
		for(int i =0; i< this.systems.length; i++)
		{
			System.out.println( " system: " + (i+1) + ",  " + systems[i]);
		}
	}
//Overriding
	public String toString()
	{
		String str = "";
		for (int i =0; i<tablets.length; i++)
			if(this.tablets[i] != null)
				str += this.tablets[i].toString();
		if(str.equals(""))
			return "no Tablets";
		else
			return str;
	}

		
	
}
