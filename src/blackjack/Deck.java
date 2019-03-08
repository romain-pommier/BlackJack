package blackjack;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck {
	private static final String CARD_SEPARATOR = " // ";
	private List<Card> cardList;
	private static final Random RANDOM = new Random();

	public Deck() {
		super();
		cardList = new LinkedList<>();

		// Remplir paquet de cartes

		for (Suit currentSuit : Suit.values()) {

			for (Rank currentRank : Rank.values()) {
				Card card = new Card(currentSuit, currentRank);
				cardList.add(card);
			}
		}

		shuffleDeck();
	}

//---------------------METHOD--------------------
	public void shuffleDeck() {

		for (int i = 0; i < cardList.size(); i++) {
			int numberIndexRandom = RANDOM.nextInt(cardList.size() - 1);

			Card holdIndex = cardList.get(i);
			cardList.set(i, cardList.get(numberIndexRandom));
			cardList.set(numberIndexRandom, holdIndex);

		}
	}

	public void DisplayDeck() {
		for (int i = 0; i < cardList.size(); i++) {
			System.out.println(cardList.get(i).toString());

		}
	}

	@Override
	public String toString() {
		StringBuffer sBuffer = new StringBuffer();
		for (Card currentCard : cardList) {
			sBuffer.append(currentCard.toString());
			sBuffer.append(CARD_SEPARATOR);
		}
		return sBuffer.toString();
	}

	public Card getNextCard() {

		Card card = cardList.remove(0);
		return card;
	}

	// -------------------
	// GETTER
	// -------------------
	public int getTailleDeck() {
		return cardList.size();
	}

	// -------------------
	// SETTER
	// -------------------

}
