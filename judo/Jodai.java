public class Jodai {
	private int id;
	private String woName;
	private int weight;
	private int[] win;
	private final int SEASONS = 20;
	
	//Constructors:
	public Jodai(int id, String name, int weight)
	{
		this.id = id;
		this.woName = name;
		this.weight = weight;
		this.win = new int[SEASONS];
	}
	
	public Jodai(Jodai other)
	{
		this.id = other.id;
		this.woName = other.woName;
		this.weight = other.weight;
		this.win = new int[20];	
		for(int i = 0; i < win.length; i++)
			this.win[i] = other.win[i];
	}
	
	//getter:
	public String getName() {
		return this.woName;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public int[] getWin() 
	{
		int[] newWin = new int[SEASONS];
		for(int i = 0; i < SEASONS; i++)
			newWin[i] = win[i]; 
		return newWin;
	}
	
	//Setter:
	public void setWoName(String woName) {
		this.woName = woName;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//methods:
	public void moreWin(int s)
	{
		if (s < SEASONS)
			win[s-1]++;
	}
	
	@Override
	public String toString()
	{
		String str = "id: " + this.id + "\n" +
					  "name: " + this.woName + "\n" +
			    		"weight: " + this.weight + "\n" + "wins: \n";
		for(int i = 0; i < win.length; i++)
			str += "s:" + (i+1) + "=" + win[i] + " ";
		str+= "\n";
		return str;
	}
}
