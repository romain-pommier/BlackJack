package blackjack;

import java.util.Random;

public class Game {
	private Player player1;
	private Bank bank1;
	private Deck DeckTest;
	private int valuePlayer;
	private static final int MAXSCORE = 21;
	private static final Random RANDOM = new Random();

	public Game(String nomPlayer, String nomBank) {

		player1 = new Player(nomPlayer);
		bank1 = new Bank(nomBank);
		DeckTest = new Deck();

	}

	public int getScorePlayer() {
		return getPlayer1().getHandPlayer().countValuesHand();

	}

	public int getScoreBank() {
		return getBank1().getHandBank().countValuesHand();
	}

	// ----METHODE-----
	public void getWinner() {

		String winner = "Le gagnant est: ";

		if (getScorePlayer() > getScoreBank() && getScorePlayer() <= MAXSCORE) {

			winner += getPlayer1().DisplayNamePlayer();
		}

		else {
			winner += getBank1().DisplayNameBank();
		}
		Utility.Log(winner);

	}

	public void choixDuJoueur() {
		valuePlayer = RANDOM.nextInt(2) + 1;
		if (getScorePlayer() > getScoreBank() && getScorePlayer() <= MAXSCORE && valuePlayer == 2) {
			getPlayer1().getHandPlayer().addCard(getDeck().getNextCard());

		}
		if (getScoreBank() > getScorePlayer() && getScoreBank() <= MAXSCORE && valuePlayer == 2) {
			getBank1().getHandBank().addCard(getDeck().getNextCard());
		}
	}

//-----------ADDCARD
	public void addCardToPlayer() {
		getPlayer1().getHandPlayer().addCard(getDeck().getNextCard());
	}

	public void addCardToBank() {
		getBank1().getHandBank().addCard(getDeck().getNextCard());
	}

//--------------DISPLAY RESULT
	public void displayResultBank() {
		String result = getBank1().getName() + ": " + getBank1().getHandBank().countValuesHand();
		Utility.Log(result);
	}

	public void displayResultPlayer() {
		String result = getPlayer1().getName() + ": " + getPlayer1().getHandPlayer().countValuesHand();
		Utility.Log(result);
	}

	// -------------------
	// GETTER
	// -------------------
	public Player getPlayer1() {
		return player1;
	}

	public Bank getBank1() {
		return bank1;
	}

	public Deck getDeck() {
		return DeckTest;
	}

	// -------------------
	// SETTER
	// -------------------
	public void setDeckTest(Deck deckTest) {
		DeckTest = deckTest;
	}

	public void setBank1(Bank bank1) {
		this.bank1 = bank1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}
}
