public class Jclub {
	
	private String JclubName;
	private int numW;
	final int MAX_J = 50;
	private Jodai[] jodaim;
	
	//Constructor:
	public Jclub(String name)
	{
		this.jodaim = new Jodai[MAX_J];
		this.JclubName = name;
		this.numW = 0;
	}
	
	//getter:
	public String getName() {
		return this.JclubName;
	}
	public int getNum() {
		return this.numW;
	}
	public Jodai getWo(int id)
	{
		Jodai j = null;
		boolean found = false;
		for(int i = 0; i < this.numW && !found; i++)
		{
			if(jodaim[i].getId() == id)
			{
				found = true;
				j = this.jodaim[i];
			}
		}
		return j;
	}
	
	//methods:
	public void addWo(Jodai newJ)
	{
		if(this.numW < MAX_J)
		{
			this.jodaim[numW] = newJ;
			this.numW++;
		}
		else
			System.out.println("No Place!!!");
	}
	
	public Jodai[] getWoArray(int w1, int w2)
	{
		int count = 0;
		for(int i = 0; i < this.numW; i++)
		{
			if(jodaim[i].getWeight() > w1 && jodaim[i].getWeight() < w2)
				count++;
		}	
		Jodai[] newArr = new Jodai[count];	
		count = 0;
		for(int i = 0; i < numW; i++)
		{
			if(jodaim[i].getWeight() > w1 && jodaim[i].getWeight() < w2)
				newArr[count++] = new Jodai(jodaim[i]);	
		}
		return newArr;
	}
}
