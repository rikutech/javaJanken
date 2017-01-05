
public class ObjectJanken {
	public static void main(String[] args)
	{
		Judge saito = new Judge();
		
		Player murata = new Player("村田");
		Player yamada = new Player("山田");
		
		saito.startJanken(murata, yamada);
	}
}
