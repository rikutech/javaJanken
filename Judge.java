
public class Judge {
	public void startJanken(Player player1, Player player2)
	{
		System.out.println("じゃんけん開始");
		
		for (int i=0; i<3; i++) {
			System.out.println((i + 1) + "回戦目");
			
			Player winner = this.judgeJanken(player1, player2);
			
			if (winner != null) {
				System.out.println(winner.getName() + "が勝ちました");
				winner.notifyResult(true);
			} else {
				System.out.println("引き分け");
			}
		}
		System.out.println("じゃんけん終了");
		
		Player finalWinner = judgeFinalWinner(player1, player2);
		
		System.out.println(player1.getWinCount() + "対" + player2.getWinCount() + "で");
		
		if (finalWinner != null) {
			System.out.println(finalWinner.getName() + "の勝ちです");
		} else {
			System.out.println("引き分けです");
		}
	}
	
	private Player judgeJanken(Player player1, Player player2)
	{
		int player1hand = player1.showHand();
		int player2hand = player2.showHand();
		
		printHand(player1hand);
		System.out.println("vs.");
		printHand(player2hand);
		
		if ((player1hand == Player.STONE && player2hand == Player.SCISSORS)
			|| (player1hand == Player.SCISSORS && player2hand == Player.PAPER)
			|| (player1hand == Player.PAPER && player2hand == Player.STONE)) {
			return player1;
		}
		
		if ((player1hand == Player.STONE && player2hand == Player.PAPER)
			|| (player1hand == Player.SCISSORS && player2hand == Player.STONE)
			|| (player1hand == Player.PAPER && player2hand == Player.SCISSORS)) {
			return player2;
		}
		
		return null;
	}
	
	private Player judgeFinalWinner(Player player1, Player player2)
	{
		int player1winCount = player1.getWinCount();
		int player2winCount = player2.getWinCount();
		
		if (player1winCount > player2winCount) {
			return player1;
		}
		
		if (player2winCount > player1winCount) {
			return player2;
		}
		
		return null;
	}
	
	private void printHand(int hand)
	{
		switch (hand) {
			case Player.STONE:
				System.out.println("グー");
				break;
			
			case Player.SCISSORS:
				System.out.println("チョキ");
				break;
				
			case Player.PAPER:
				System.out.println("パー");
				break;
				
			default:
				break;
		}
	}
	
	
}
