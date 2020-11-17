package pocker;

import java.util.ArrayList;
import java.util.Collections;

public class PokerCard {	
	Rank rank;
	Suit suit;

	
	public PokerCard(Rank rank, Suit suit) {
		this.rank = rank;					// Type 자체를 내가 만들 수 있다.
		this.suit = suit;

		
	}
	
	@Override
	public String toString() {
		
		return suit.getSuitPic() + " " + rank.getSimpleName();
	}
	
	public static void main(String[] args) {
		ArrayList<PokerCard> deck = new ArrayList<>(52);
		
		for (Rank rank : Rank.values()) {			
			for (Suit suit : Suit.values()) {
				deck.add(new PokerCard(rank, suit));
				
			}
		}
		Collections.shuffle(deck);
		System.out.println(deck);
		System.out.println(deck.size());
	}

}
