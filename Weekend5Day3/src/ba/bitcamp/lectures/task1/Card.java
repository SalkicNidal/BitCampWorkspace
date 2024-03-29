package ba.bitcamp.lectures.task1;

/**
 * This class represents a card from a standard deck The value go from 1 - 13,
 * 11 - Jack. 12 - Queen. 13 - King. Suits go from 0 - 4. 0 - Heart. 1 -
 * Diamonds. 2 - Clubs. 3 - Spades. 4 - Joker.
 * 
 * @author nidal.salkic
 *
 */
public class Card {

	private static final int MIN_VALUE = 1;
	private static final int MAX_VALUE = 13;
	private static final int MIN_SUIT = 0;
	private static final int MAX_SUIT = 4;

	public static final int HEART = 0;
	public static final int DIAMOND = 1;
	public static final int CLUBS = 2;
	public static final int SPADE = 3;
	public static final int JOKER = 4;

	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;

	private int value;
	private int suit;
	private boolean isJoker = false;

	public Card() {
		this.suit = JOKER;
		this.value = 0;
		isJoker = true;
	}

	public Card(int value, int suit) throws IllegalArgumentException {

		if (this.value < MIN_VALUE && this.value > MAX_VALUE) {
			throw new IllegalArgumentException("Value must be in range 1 to 13");
		}
		if (this.suit < MIN_SUIT || this.suit > MAX_SUIT) {
			throw new IllegalArgumentException("Suit has to be in range 0 to 4");
		}
		this.value = value;
		this.suit = suit;
		if (suit == MAX_SUIT) {
			this.isJoker = true;
		}
	}

	public int getValue() {
		return value;
	}

	public int getSuit() {
		return suit;
	}

	public void setValue(int value) {
		if (isJoker == false) {
			throw new UnsupportedOperationException(
					"Can't change the value of a non Joker");
		}
		this.value = value;
	}

	public void setSuit(int suit) {

		if (isJoker == false) {
			throw new UnsupportedOperationException(
					"Can't change the value of a non Joker");
		}
		if (this.suit < MIN_SUIT || this.suit > MAX_SUIT) {
			throw new IllegalArgumentException("Suit has to be in range 0 to 4");
		}

	}

	public String getValueString() {

		if (this.value <= 10 && this.value > 1) {
			return Integer.toString(value);
		} else {
			switch (this.value) {
			case ACE:
				return "Ace";
			case JACK:
				return "JAck";

			case QUEEN:
				return "Queen";

			case KING:
				return "King";

			default:

				return "";

			}
		}

	}

	public String getSuitString() {
		switch (suit) {

		case HEART:
			return " Heart";

		case DIAMOND:
			return " Diamonds";

		case CLUBS:
			return " Clubs";

		case SPADE:
			return " Spades";

		default:
			return "JOKER";

		}

	}

	public String getCard() {
		return getValueString() + " " + getSuitString();

	}

	public String toString() {
		return getCard();
	}

}
