package blackjack;

import java.util.Scanner;

/**
 * 
 * @author Jake Balsamo
 * @version 1.0.0
 *
 */
public class Dealer extends GenericPlayer {
	
	// class variables
	private String name;
	
	/**
	 * Default Constructor
	 * 
	 * @param name
	 */
	Dealer(String name){
		super(name);
		this.name = name;
	} // end constructor
	
	
	@Override
	public boolean isHitting(Scanner s) {
		if (this.isBusted() && h.containsRank(new Card(Suit.SPADES, Rank.ACE, 11))) {
			h.changeAce();
			System.out.printf("%s is going to hit.%n", name);
			return true;
		} else if (h.getValue() <= 16) {
			System.out.printf("%s is going to stay.%n", name);
			return false;
		}
		return false;
	} //end isHitting()
	
} // end Dealer
