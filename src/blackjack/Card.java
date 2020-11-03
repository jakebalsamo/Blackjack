package blackjack;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * 
 * @author Jake Balsamo
 * @version 1.0.0
 *
 */
public class Card implements Comparable<Card> {
	
	private Rank rank;
	private Suit suit;
	private int points = 0;
	private String url = "./images/";
	private Image back;
	private Image front;
	private ImageView frontView;
	private ImageView backView;
	
	
	/**
	 * Default Card Constructor
	 * 
	 * @param suit
	 * @param rank
	 * @param points
	 */
	public Card(Suit suit, Rank rank, int points) {
		this.rank = rank;
		this.suit = suit;
		this.points = points;
		
		// set back of card
		this.back = new Image("./images/gray_back.png", 172, 264, true, false);
		
		// set front of card
		for (Rank loopRank : Rank.values()) {
			if (rank.equals(loopRank)) {
				url += rank.getFileID();
			}
		}
		for (Suit loopSuit : Suit.values()) {
			if (suit.equals(loopSuit)) {
				url += suit.getFileID();
			}
		}
		url += ".png";
		this.front = new Image(url, 172, 264, true, false);
		
	}
	
	
	/**
	 * Extra Card Constructor for a change in face card
	 * 
	 * @param suit
	 * @param rank
	 * @param points
	 * @param faceUrl
	 */
	public Card(Suit suit, Rank rank, int points, String faceUrl) {
		this.rank = rank;
		this.suit = suit;
		this.points = points;
		back = new Image("./images/gray_back.png", 172, 264, true, false);
		front = new Image(faceUrl, 172, 264, true, false);
		backView.setImage(back);
		frontView.setImage(front);
		}	// end constructor

	
	// getter method for rank
	public Rank getRank() {	
		return rank;
	}
	
	// getter method for suit
	public Suit getSuit() {
		return suit;
	}
	
	// getter method for point value
	public int getPoints() {
		return points;
	}
	
	/**
	 * Access image of back of card
	 * 
	 * @return Image back of card
	 */
	public Image getBack() {
		return back;
	}
	
	/**
	 * Access image of front of card
	 * 
	 * @return Image front of card
	 */
	public Image getFront() {
		return front;
	}
	
	
	public ImageView getFrontView() {
		return frontView;
	}
	
	
	// compares the rank of cards
	// if first card is greater than card inside method, compareTo returns 1
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo( Card o )
	{
		if(getPoints() < o.getPoints()) {
		return -1;
		}	
		
		else if(getPoints() > o.getPoints()) {
		return 1;
		}
		
		else {
		return 0;
		}
	}


	
	// checks if the rank is equal to an object's rank
	/* (non-Javadoc)
	 * @see java.lang.Comparable#equals(java.lang.Object)
	 */
	@Override
	public boolean equals( Object o )
		{
		if(this.rank == o) {
			return true;
		}
		return false;
		
		}	// end equals()
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
		{
		return this.getRank() + " of " + this.getSuit();
		
		}	// end toString()


	/**
	 * @param args
	 */
	public static void main( String[] args ) {
		/**
		Card card1 = new Card(Suit.HEARTS, Rank.SIX, 6, "./images/6H.png");
		Card card2 = new Card(Suit.SPADES, Rank.KING, 10, "./images/KS.png");
		//Card card3 = new Card(Suit.HEARTS, Rank.Six, 6, "./images/6H.png");
		
		System.out.println("The rank of the card1: " +card1.getRank());
		System.out.println("The suit of the card1: "+ card1.getSuit());
		System.out.println("__________________________");
		
		System.out.println("The rank of the card2: " +card2.getRank());
		System.out.println("The suit of the card2: "+card2.getSuit());
		System.out.println("__________________________");
		
		System.out.println("Checking the compareTo rank method: ");
		System.out.println("Should throw -1: ");
		System.out.println(card1.compareTo(card2));
		System.out.println("Should throw 1");
		System.out.println(card2.compareTo(card1));
		System.out.println("__________________________");
		
		System.out.println("Checking the equals method");
		System.out.println("Checking if the two cards are equal: ");
		System.out.println("Should return false: ");
		System.out.println(card1.equals(7));
		System.out.println("Should return true: ");
		System.out.println(card1.equals(6));
		System.out.println("__________________________");
		
		System.out.println("Checking toString method: ");
		card1.toString();
		card2.toString();
		System.out.println("__________________________");
		
		System.out.println("Should return 6 for getPoint:");
		System.out.println(card1.getPoints());
		*/
		}	// end main()

	}	// end class Card