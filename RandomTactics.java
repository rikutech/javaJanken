
public class RandomTactics implements Tactics
{
	public int readTactics()
	{
		double randomNum = Math.random() * 3;
		
		if (randomNum < 1) {
			return Player.STONE;
		}
		
		if (randomNum < 2) {
			return Player.SCISSORS;
		}
		
		return Player.PAPER;
	}
}
