public class Battle {
	private Jodai wo1;
	private Jodai wo2;
	private int idWin;
	private Date bDate;
	
	public Battle(Jodai wo1, Jodai wo2, int idWin, Date bdate)
	{
		this.wo1 = wo1;
		this.wo2 = wo2;
		this.idWin = idWin;
		this.bDate = new Date(bdate);
	}
	
	public Battle(Battle b)
	{
		this.wo1 = b.wo1;
		this.wo2 = b.wo2;
		this.idWin = b.idWin;
		this.bDate = new Date(b.bDate);
	}
	
	public int getIdwin() {
		return this.idWin;
	}
	
	public String toString()
	{
		return 	this.wo1.getName() + "  against " +
				this.wo2.getName() + "\n" +
				"win id: " + this.idWin + "\n" +
				"battle Date: " + this.bDate.ToString() + "\n";
	}
}
