package blackjack;

public class Player {
	private String name;
	private Hand handPlayer;

	public Player(String name) {
		super();
		this.name = name;

		handPlayer = new Hand("bob");

	}

	public String DisplayNamePlayer() {
		return name;
	}

	// -------------------
	// GETTER
	// -------------------
	public Hand getHandPlayer() {
		return handPlayer;
	}

	public String getName() {
		return name;
	}
	// -------------------
	// SETTER
	// -------------------

	public void setName(String name) {
		this.name = name;
	}

}
