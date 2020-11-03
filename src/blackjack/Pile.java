package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

/**
 * 
 * @author Jake Balsamo
 * @version 1.0.0
 *
 */
public class Pile implements Iterable<Card> {
	
	// class variables
	private ArrayList<Card> cards ;
	private int size;
	Random rand = new Random();
	
	/**
	 * Default Constructor
	 */
	public Pile() {
		cards = new ArrayList<>();
	} // end constructor
	
	
	/**
	 * Adds a card to its pile of cards
	 * 
	 * @param c
	 */
	public void add(Card c) {
		cards.add(c);
		size++;	
	} // end add
	
	
	/**
	 * Searches pile for a card with rank equivalent to searching
	 * 
	 * @param Card card to search for instance of
	 * @return boolean explains if card is contained in pile or not
	 */
	public boolean containsRank(Card c) {
		for (int i = 0; i < this.size; i++) {
			if (cards.get(i).getRank().compareTo(c.getRank()) == 0) {
				return true;
			}
		} // end for
		
		return false;
	} // end containsRank()
	
	
	/**
	 * Accesses size of ArrayList for external classes
	 * 
	 * @return int size amount of cards in ArrayList
	 */
	public int getSize() {
		return size;
	} // end getSize()
	
	
	/**
	 * Shuffles cards in ArrayList
	 */
	public void shuffle() {
		Collections.shuffle(cards);
	} // end shuffle()
	
	
	/**
	 * Removes card at specified index from pile
	 * 
	 * @param int index of card to remove
	 * @return Card card that was removed
	 */
	public Card removeCard(int pick) {
		Card c = cards.remove(pick);
		size--; // decrement size variable
		
		return c;
	} // end removeCard()

	
	@Override
	public Iterator<Card> iterator() {
		return new IteratorForArrayList();
	} // end iterator()

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		String s = "";
		
		for(int i = 0; i < cards.size(); i++) {
				s = s + cards.get(i).toString();
				//System.out.printf("s: %s%n",s);
				if (i != cards.size()-1) {
					s = s + ", ";
				}
		}
		return s ;
	} // end toString()
	
	
	/**
	 * Creates an Iterator designed for an JCL ArrayList
	 * of object <Card>
	 * 
	 * @author Jake Sousa
	 * 
	 */
	private class IteratorForArrayList implements Iterator<Card>{
		private int nextIndex;
		private boolean wasNextCalled;
		
		private IteratorForArrayList() {
			nextIndex = 0;
			wasNextCalled = false;
		}

		@Override
		public boolean hasNext() {
			return nextIndex < cards.size();
		}

		@Override
		public Card next() {
			wasNextCalled = true;
			Card nextEntry = cards.get(nextIndex);
			nextIndex++;
			
			return nextEntry;
		}
	} // end IteratorForArrayList()
	
	
	/**
	 * Test Suite for Pile class
	 * 
	 * @param args
	 */
	public static void main( String[] args )
		{
		Pile pile = new Pile();
		Card card1 = new Card(Suit.HEARTS, Rank.ACE, 11);
		Card card2 = new Card(Suit.DIAMONDS, Rank.TEN, 10);
		Card card3 = new Card(Suit.SPADES, Rank.NINE, 9);
		Card card4 = new Card(Suit.CLUBS, Rank.EIGHT, 8);
		Card card5 = new Card(Suit.HEARTS, Rank.SEVEN, 7);
		Card card6 = new Card(Suit.DIAMONDS, Rank.SIX, 6);
		Card card7 = new Card(Suit.SPADES, Rank.FIVE, 5);
		Card card8 = new Card(Suit.CLUBS, Rank.FOUR, 4);
		Card card9 = new Card(Suit.CLUBS, Rank.TWO, 2);
		
		System.out.println("Adding cards to Pile: ");
		pile.add(card1);
		pile.add(card2);
		pile.add(card3);
		pile.add(card4);
		pile.add(card5);
		pile.add(card6);
		pile.add(card7);
		pile.add(card8);
		
		System.out.println("Checking if pile contains Ace: answer should be true: ");
		System.out.println(pile.containsRank(card1));
		System.out.println("__________________________");
		
		System.out.println("Checking if pile contains Two: answer should be false: ");
		System.out.println(pile.containsRank(card9));
		System.out.println("__________________________");
		
		System.out.println("Pile size should be 8: ");
		System.out.println(pile.size);
		System.out.println("__________________________");
		
		System.out.println("Pile should be turned to a string: ");
		System.out.println(pile.toString());
		System.out.println("__________________________");
		
		System.out.println("Removes card with rank 7 from pile: ");
		pile.removeCard(7);
		System.out.println("Checking if pile contains Two: answer should be false: ");
		System.out.println(pile.containsRank(card5));
		System.out.println("__________________________");

		} // end main()
	

	} // end class Pile4