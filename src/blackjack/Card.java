package blackjack;

public class Card {

	private Rank value;
	private Suit color;

	// -------------------
	// GETTER
	// -------------------

	public Card(Suit color, Rank value) {
		this.color = color;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Rank : " + value + " Suit : " + color;
	}

	public Rank getRank() {
		return value;
	}

	public int getScore() {
		return value.getValueEnInt();
	}
}
