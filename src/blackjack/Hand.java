package blackjack;

import java.util.Iterator;

/**
 * @author Jake Balsamo
 * @version 1.0.0
 *
 */
public class Hand extends Pile  {
	
	// class variables
	Pile hand;
	private int handValue;
	
	
	/**
	 * Default Hand constructor
	 * Instantiates handValue at 0
	 */
	public Hand() {
		hand = new Pile();
		handValue = 0;
	} // end constructor

	
	/**
	 * Accepts card from another pile and adds to ArrayList in super
	 * 
	 * @param Card card to be drawn from a deal()
	 */
	public void draw(Card c) {
		hand.add(c);
		handValue += c.getPoints();
	} // end draw()
	
	
	/**
	 * Accesses value of hand for external classes
	 * 
	 * @return int handValue value of hand
	 */
	public int getValue() {
		return handValue;
	} // end getValue()
	
	
	/**
	 * Changes the value of the Ace in hand from 11 to 1
	 */
	public void changeAce() {
		handValue -= 10;;
	} // end changeAce()
	

	@Override
	public Iterator<Card> iterator() {
		return null;
	} // end iterator()
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String betterString() {
		Iterator cardIterator = hand.iterator();
		String s = "";
		
		while(cardIterator.hasNext()) {
			Card aCard = (Card) cardIterator.next();
			s += "[ " + aCard.getRank() + " of " + aCard.getSuit() + " ] ";
		} // end while
		
		return s + "\n";
	} // end toString()
	
	
	/**
	 * Test suite for Hand
	 * 
	 * @param args
	 */
	public static void main( String[] args ) {
		
	Hand hand = new Hand();
	Card card1 = new Card(Suit.HEARTS, Rank.ACE, 11);
	Card card2 = new Card(Suit.HEARTS, Rank.TEN, 10);

	
	System.out.println("Hand is empty, handValueshould be zero: ");
	System.out.println(hand.getValue());
	System.out.println("__________________________");
	
	System.out.println("Testing draw(), should update getValue()");
	hand.draw(card1);
	hand.draw(card2);
	System.out.println("Finished drawing, handValue should be 21");
	System.out.println(hand.getValue());
	System.out.println("__________________________");

	} // end main()


} // end class Hand