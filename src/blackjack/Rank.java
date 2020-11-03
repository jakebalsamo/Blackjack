package blackjack;

/**
 * 
 * @author Jake Balsamo
 * @version 1.0.0
 *
 */
public enum Rank {

	ACE("A"), 
	TWO("2"), 
	THREE("3"), 
	FOUR("4"), 
	FIVE("5"), 
	SIX("6"), 
	SEVEN("7"), 
	EIGHT("8"), 
	NINE("9"), 
	TEN("10"), 
	JACK("J"), 
	QUEEN("Q"), 
	KING("K");
	
	private final String fileID;
	
	private Rank(String fileID) {
		this.fileID = fileID;
	}
	
	public String getFileID() {
		return fileID;
	}

} // end Rank