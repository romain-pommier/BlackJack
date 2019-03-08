package blackjack;

public class Bank {
	private String name;
	private Hand handBank;

	public Bank(String name) {
		super();
		this.name = name;
		handBank = new Hand("bank");

	}

	public String DisplayNameBank() {
		return name;
	}

	// -------------------
	// GETTER
	// -------------------
	public String getName() {
		return name;
	}

	public Hand getHandBank() {
		return handBank;
	}

	// -------------------
	// SETTER
	// -------------------
	public void setHandBank(Hand handBank) {
		this.handBank = handBank;
	}

	public void setName(String name) {
		this.name = name;
	}

}
