
public class Player
{
	public static final int STONE    = 0;
	public static final int SCISSORS = 1;
	public static final int PAPER    = 2;

	private String name;
	private int    winCount;
	private Tactics tactics;
	
	public Player(String name)
	{
		this.name = name;
	}
	
	public int showHand()
	{
		return this.tactics.readTactics();
	}
	
	public void notifyResult(boolean result)
	{
		if (result == true) {
			this.winCount += 1;
		}
	}
	
	public int getWinCount()
	{
		return this.winCount;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	void setTactics(Tactics tactics)
	{
		this.tactics = tactics;
	}
}
