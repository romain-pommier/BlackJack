package blackjack;

public enum Rank {
	ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), HEIGHT(8), NINE(9), TEEN(10), JACK(10), QUEEN(10),
	KING(10);

	private int value;

	private Rank(int valeurEnInt) {
		value = valeurEnInt;
	}

	public int getValueEnInt() {
		return value;
	}

}
