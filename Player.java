
public class Player
{
	public static final int STONE    = 0;
	public static final int SCISSORS = 1;
	public static final int PAPER    = 2;

	private String name;
	private int    winCount;
	
	public Player(String name)
	{
		this.name = name;
	}
	
	public int showHand()
	{
		double randomNum = Math.random() * 3;
		
		if (randomNum < 1) {
			return STONE;
		}
		
		if (randomNum < 2) {
			return SCISSORS;
		}
		
		return PAPER;
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
}
