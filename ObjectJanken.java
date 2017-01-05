
public class ObjectJanken {
	public static void main(String[] args)
	{
		Judge saito = new Judge();
		
		Player murata = new Player("あなた");
		Player yamada = new Player("山田");
		
		Tactics murataTactics = new AskTactics();
		murata.setTactics(murataTactics);
		
		Tactics yamadaTactics = new RandomTactics();
		yamada.setTactics(yamadaTactics);
		
		saito.startJanken(murata, yamada);
	}
}
