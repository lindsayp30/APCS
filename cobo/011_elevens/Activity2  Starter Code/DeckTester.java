/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		ranks = ["Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"];
		suits = ["Diamonds", "Clubs", "Hearts", "Spades"];
		values = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13];
		Deck turtle = new Deck(ranks, suits, values);
		Deck chicken = new Deck(ranks, suits, values);
		Deck bear = new Deck(null, null, null);
	}
}
