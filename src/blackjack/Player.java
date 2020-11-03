package blackjack;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Jake Balsamo
 * @version 1.0.0
 *
 */
public class Player extends GenericPlayer {
	private String name;

	/**
	 * Default constructor calls super
	 * 
	 * @param name
	 */
	Player(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public boolean isHitting(Scanner s) {
		if (this.isBusted() && h.containsRank(new Card(Suit.SPADES, Rank.ACE, 11))) {
			h.changeAce();
			System.out.printf("%nYou busted, but your Ace's rank was changed to 1.%nThe current score of your hand is %s.%nYour hand is: %s", h.getValue(),h.betterString());
		} else if (this.isBusted()) {
			System.out.printf("%nThe current value of your hand is %s, so you busted.%n", h.getValue());
			return false;
		} else {
			System.out.printf("%nThe current value of your hand is %s.%nYour hand is: %s", h.getValue(),h.betterString());
		}
		
		// check for valid input
		boolean error = true;
		String in = "";
		while (error) {
			try {
				System.out.printf("Enter 'H' to hit or 'S' to Stay: ");
				in = s.nextLine();
				error = false;
			} catch (InputMismatchException e) {
				System.out.printf("Error: Invalid input.%n");
				s.nextLine();
				error = true;
			}
			
			if (in.equalsIgnoreCase("s")) {
				return false;
			} else if (in.equalsIgnoreCase("h")) {
				return true;
			} else {
				System.out.printf("Error: Invalid input. ");
				error = true;
			}
		}
		
		return false;
	} // end isHitting()
	
	public static void main(String[] args) {
		
	} // end main()

} // end Player()