package blackjack;

public enum Suit {
	CLUB("Trefle"), DIAMOND("Carreau"), HEART("Coeur"), SPADE("Pique");

	private String nameInFrench;

	private Suit(String nomEnFrancais) {
		nameInFrench = nomEnFrancais;
	}

	public String getNameInFrench() {
		return nameInFrench;
	}

}
