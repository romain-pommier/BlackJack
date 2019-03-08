package blackjack;

public class DeckAndCardTest {
	public static void main(String[] args) {
		Game newGame = new Game("bob", "robertLaBank");

		// System.out.println(newGame.getDeck());

		newGame.addCardToPlayer();
		newGame.addCardToBank();
		newGame.addCardToPlayer();
		newGame.addCardToBank();

		newGame.displayResultBank();
		newGame.displayResultPlayer();

		newGame.getWinner();
		newGame.choixDuJoueur();
		newGame.displayResultBank();
		newGame.displayResultPlayer();

	}

}
