package blackjack;

import java.util.Scanner;

/**
 * 
 * @author Jake Balsamo
 * @version 1.0.0
 *
 */
abstract public class GenericPlayer {

	// class variables
	protected Hand h;
	private String name;
	
	
	/**
	 * Default Constructor
	 * 
	 * @param name
	 */
	GenericPlayer(String name){
		h = new Hand();
		this.name = name;
	} // end constructor
	
	
	/**
	 * Adds card to a hand
	 * 
	 * @param Card to add
	 */
	public void addCard(Card c) {
		h.draw(c);
	} // end addCard()
	
	
	/**
	 * Accesses handValue for external classes
	 * 
	 * @return int handValue
	 */
	public int getHandValue() {
		return h.getValue();
	} // end getHandValue()
	
	
	/**
	 * Controls the hitting/staying of players in game
	 * 
	 * @param Scanner for logical console input
	 * @return boolean states of continuing to hit
	 */
	abstract public boolean isHitting(Scanner s);
	
	
	/**
	 * Simple logical method to determine if a player is 
	 * busted
	 * 
	 * @return boolean state of player (busted or not)
	 */
	public boolean isBusted() {
		if(h.getValue() > 21) {
			return true;
		} else {
			return false;
		} // end if
	} // end isBusted()
	
	
	/**
	 * Prints win message
	 */
	public void win() {
		System.out.printf("%s wins with value of %d.%n",name,h.getValue());
	} // end win()
	
	
	/**
	 * Prints loss message
	 */
	public void lose() {
		System.out.printf("%s loses with value of %d.%n",name,h.getValue());
	} // end lose()
	
	
	/**
	 * Test Suite for GenericPlayer
	 * 
	 * @param args
	 */
	public static void main (String[] args) {
		
		
	}

	public boolean isHitting() {
		// TODO Auto-generated method stub
		return false;
	}

}