package blackjack;

/**
 * 
 * @author Jake Balsamo
 * @version 1.0.0
 *
 */
public class Deck extends Pile {
	
	// class variables
	Pile deck = new Pile();
	
	/**
	 * Default Constructor
	 * 
	 */
	public Deck() {
		
		Card c1  = new Card(Suit.HEARTS, 	Rank.ACE, 	11	);
		Card c2  = new Card(Suit.DIAMONDS,  Rank.ACE, 	11	);
		Card c3  = new Card(Suit.SPADES, 	Rank.ACE, 	11	);
		Card c4  = new Card(Suit.CLUBS, 	Rank.ACE, 	11	);
		Card c5  = new Card(Suit.HEARTS, 	Rank.TWO, 	2	);
		Card c6  = new Card(Suit.DIAMONDS,  Rank.TWO, 	2	);
		Card c7  = new Card(Suit.SPADES, 	Rank.TWO, 	2	);
		Card c8  = new Card(Suit.CLUBS, 	Rank.TWO, 	2	);
		Card c9  = new Card(Suit.HEARTS, 	Rank.THREE, 3	);
		Card c10 = new Card(Suit.DIAMONDS, 	Rank.THREE, 3	);
		Card c11 = new Card(Suit.SPADES, 	Rank.THREE, 3	);
		Card c12 = new Card(Suit.CLUBS, 	Rank.THREE, 3	);
		Card c13 = new Card(Suit.HEARTS, 	Rank.FOUR, 	4	);
		Card c14 = new Card(Suit.DIAMONDS, 	Rank.FOUR, 	4	);
		Card c15 = new Card(Suit.SPADES, 	Rank.FOUR, 	4	);
		Card c16 = new Card(Suit.CLUBS, 	Rank.FOUR, 	4	);
		Card c17 = new Card(Suit.HEARTS, 	Rank.FIVE, 	5	);
		Card c18 = new Card(Suit.DIAMONDS, 	Rank.FIVE, 	5	);
		Card c19 = new Card(Suit.SPADES, 	Rank.FIVE, 	5	);
		Card c20 = new Card(Suit.CLUBS, 	Rank.FIVE, 	5	);
		Card c21 = new Card(Suit.HEARTS, 	Rank.SIX, 	6	);
		Card c22 = new Card(Suit.DIAMONDS, 	Rank.SIX, 	6	);
		Card c23 = new Card(Suit.SPADES, 	Rank.SIX, 	6	);
		Card c24 = new Card(Suit.CLUBS, 	Rank.SIX, 	6	);
		Card c25 = new Card(Suit.HEARTS, 	Rank.SEVEN, 7	);
		Card c26 = new Card(Suit.DIAMONDS, 	Rank.SEVEN, 7	);
		Card c27 = new Card(Suit.SPADES, 	Rank.SEVEN, 7	);
		Card c28 = new Card(Suit.CLUBS, 	Rank.SEVEN, 7	);
		Card c29 = new Card(Suit.HEARTS, 	Rank.EIGHT, 8	);
		Card c30 = new Card(Suit.DIAMONDS, 	Rank.EIGHT, 8	);
		Card c31 = new Card(Suit.SPADES, 	Rank.EIGHT, 8	);
		Card c32 = new Card(Suit.CLUBS, 	Rank.EIGHT, 8	);
		Card c33 = new Card(Suit.HEARTS, 	Rank.NINE, 	9	);
		Card c34 = new Card(Suit.DIAMONDS, 	Rank.NINE, 	9	);
		Card c35 = new Card(Suit.SPADES, 	Rank.NINE, 	9	);
		Card c36 = new Card(Suit.CLUBS, 	Rank.NINE, 	9	);
		Card c37 = new Card(Suit.HEARTS, 	Rank.TEN, 	10	);
		Card c38 = new Card(Suit.DIAMONDS, 	Rank.TEN, 	10	);
		Card c39 = new Card(Suit.SPADES, 	Rank.TEN, 	10	);
		Card c40 = new Card(Suit.CLUBS, 	Rank.TEN, 	10	);
		Card c41 = new Card(Suit.HEARTS, 	Rank.JACK, 	10	);
		Card c42 = new Card(Suit.DIAMONDS, 	Rank.JACK, 	10	);
		Card c43 = new Card(Suit.SPADES, 	Rank.JACK, 	10	);
		Card c44 = new Card(Suit.CLUBS, 	Rank.JACK, 	10	);
		Card c45 = new Card(Suit.HEARTS, 	Rank.QUEEN, 10	);
		Card c46 = new Card(Suit.DIAMONDS, 	Rank.QUEEN, 10	);
		Card c47 = new Card(Suit.SPADES, 	Rank.QUEEN, 10	);
		Card c48 = new Card(Suit.CLUBS, 	Rank.QUEEN, 10	);
		Card c49 = new Card(Suit.HEARTS, 	Rank.KING, 	10	);
		Card c50 = new Card(Suit.DIAMONDS, 	Rank.KING, 	10	);
		Card c51 = new Card(Suit.SPADES, 	Rank.KING, 	10	);
		Card c52 = new Card(Suit.CLUBS, 	Rank.KING, 	10	);

		deck.add(c1);
		deck.add(c2);
		deck.add(c3);
		deck.add(c4);
		deck.add(c5);
		deck.add(c6);
		deck.add(c7);
		deck.add(c8);
		deck.add(c9);
		deck.add(c10);
		deck.add(c11);
		deck.add(c12);
		deck.add(c13);
		deck.add(c14);
		deck.add(c15);
		deck.add(c16);
		deck.add(c17);
		deck.add(c18);
		deck.add(c19);
		deck.add(c20);
		deck.add(c21);
		deck.add(c22);
		deck.add(c23);
		deck.add(c24);
		deck.add(c25);
		deck.add(c26);
		deck.add(c27);
		deck.add(c28);
		deck.add(c29);
		deck.add(c30);
		deck.add(c31);
		deck.add(c32);
		deck.add(c33);
		deck.add(c34);
		deck.add(c35);
		deck.add(c36);
		deck.add(c37);
		deck.add(c38);
		deck.add(c39);
		deck.add(c40);
		deck.add(c41);
		deck.add(c42);
		deck.add(c43);
		deck.add(c44);
		deck.add(c45);
		deck.add(c46);
		deck.add(c47);
		deck.add(c48);
		deck.add(c49);
		deck.add(c50);
		deck.add(c51);
		deck.add(c52);
		
		
		//shuffle deck on creation
		deck.shuffle();
		
	} // end constructor
	
	
	/**
	 * Removes a card at a random index from deck
	 * 
	 * @return Card card to be dealt
	 */
	public Card deal() {
		Card c = deck.removeCard(this.getDeckSize()-1);
		return c;
	} // end deal()
	
	
	/**
	 * Returns size of deck
	 * 
	 * @return int size of deck
	 */
	public int getDeckSize() {
		return deck.getSize();
	} // end getDeckSize()


	/**
	 * Test suite for Deck
	 * 
	 * @param args
	 */
	public static void main( String[] args ) {
		
		Deck deck = new Deck();
		System.out.printf("Deck:%s%n ",deck.toString());
		System.out.println("Tests out deal functionality");
		System.out.println("Should print out two different cards:");
		System.out.println("Card one: "+deck.deal());
		System.out.println("Card two: " +deck.deal());
		System.out.println("__________________________");
		System.out.println("Size of deck: ");
		System.out.println(deck.getSize());
		System.out.println("__________________________");

	} // end main()

} // end class Deck
