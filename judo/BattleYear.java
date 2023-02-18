public class BattleYear {
	private Battle[] battles;
	private int lastPosition;
	final int MAX_B = 100;
	
	//Constructor:
	public BattleYear()
	{
		this.battles = new Battle[MAX_B];
		this.lastPosition = 0;
	}
	
	public void addBattle(Battle b)
	{
		if(this.lastPosition < MAX_B)
			this.battles[this.lastPosition++] = b;
		else
			System.out.println("No place!!!");
	}
	
	
	public Battle[] getBattles()
	{
		Battle[] newArr = new Battle[this.lastPosition];
		
		for(int i = 0; i < this.lastPosition; i++)
			newArr[i] = this.battles[i];
		return newArr;
	}
}
