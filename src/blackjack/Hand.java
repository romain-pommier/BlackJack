package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {

	private List<Card> cardList;
	private String handName;
	private int ValueCard;

	// ----------------CONSTRUCTOR---------------
	public Hand(String handName) {
		super();
		cardList = new ArrayList<>();
		this.handName = handName;
	}

	// ------------------METHOD---------------
	public void addCard(Card card) {
		cardList.add(card);

	}

	public int countValuesHand() {
		ValueCard = 0;

		for (Card currentCard : cardList) {

			ValueCard += currentCard.getScore();
		}

		return ValueCard;
	}

	public void DisplayHand() {

		for (Card currentCard : cardList) {
			System.out.println(handName + " " + currentCard);
		}
	}

	// -------------------
	// GETTER
	// -------------------
	public List<Card> getHandList() {
		return cardList;
	}

	public int getValueCard() {
		return ValueCard;
	}

	// -------------------
	// SETTER
	// -------------------
	public void setHandList(List<Card> handList) {
		cardList = handList;
	}

	public void setValueCard(int valueCard) {
		ValueCard = valueCard;
	}

}
