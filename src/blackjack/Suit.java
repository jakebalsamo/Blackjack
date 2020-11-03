package blackjack;

/**
 * 
 * @author Jake Balsamo
 * @version 1.0.0
 *
 */
public enum Suit implements Comparable<Suit> {
	
	CLUBS("C"),      
	DIAMONDS("D"),    
	HEARTS("H"),     
	SPADES("S");

private final String fileID;
	
	private Suit(String fileID) {
		this.fileID = fileID;
	}
	
	public String getFileID() {
		return fileID;
	}
	
} // end Suit
