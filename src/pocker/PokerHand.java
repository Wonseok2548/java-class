package pocker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PokerHand implements Comparable<PokerHand>{
	
	// PokerHand 클래스를 구현해보세요	
	// 1. 다섯장의 PokerCard를 가지고 있어야 함	
	// 2. 다섯장의 PokerCard의 숫자/무늬를 통해 족보를 완성해야 함	
	// 3. 다른 PokerHand 인스턴스와 족보를 통한 크기비교가 가능해야 함	
	// 4. 다섯장 중 원하는 카드만 공개하는 기능이 있어야 함	
	// 5. 카드를 한장씩 추가하는 기능이 있어야 함 
	
	ArrayList<PokerCard> hands;
	String name;
	
	boolean[] opens;
	
	public PokerHand(int handSize) {
		hands = new ArrayList<>(handSize);
		opens = new boolean[handSize];
		
		for (int i=0; i < handSize; i++) {
			if (i < 2) {
				opens[i] = false;
			}
			else {
				opens[i] = true;
			}
		}
	}
	
	public void add(PokerCard card) {
		hands.add(card);
	}
	
	public void show() {
		for (int i=0, size = hands.size(); i < size; i++ ) {
			System.out.print((i+1) + "번째 카드 : " );
			if (opens[i]) {
				System.out.print(hands.get(i));
			}
			else {
				System.out.print("NOT OPENED");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public void open(int hand_index) {
		opens[hand_index] = !opens[hand_index];
	}
	
	public void openAllCard() {
		Arrays.fill(opens, true);
	}
	
	Set<Rank> getRankSet() {
		Set<Rank> ranks = new HashSet<>();
		
		for (PokerCard hand : hands) {
			ranks.add(hand.rank);
		}
		return ranks;
	}
	
	public static void main(String[] args) {	
		
		
		int round = 0;
		
		while (true) {
			System.out.println("-------------Round" + round++ + "-------------");
			PokerDeck deck = new PokerDeck();
			PokerHand player01 = new PokerHand(5);
			
			player01.name = "철수";
			
			player01.add(deck.draw());
			player01.add(deck.draw());
			player01.add(deck.draw());
			player01.add(deck.draw());
			player01.add(deck.draw());
			
			PokerHand player02 = new PokerHand(5);
			
			player02.name = "영희";
			
			player02.add(deck.draw());
			player02.add(deck.draw());
			player02.add(deck.draw());
			player02.add(deck.draw());
			player02.add(deck.draw());
			
			System.out.println(player01.name + "'s deck");
			player01.show();
			System.out.println(player02.name + "'s deck");
			player02.show();
			
			ArrayList<PokerHand> players = new ArrayList<>();
			players.add(player01);
			players.add(player02);
			
			System.out.println("이긴사람 : " + Collections.max(players).hands);
			
		//	Collections.max(players);
			break;
			
		}
		
	}
	


	public int compareTo(PokerHand o) {
		PokerHandRanking rank1 = new PokerHandRanking(this);
		PokerHandRanking rank2 = new PokerHandRanking(o);
		
		System.out.println(this.name + ": " + rank1.getHandRank());
		System.out.println(o.name + ": " + rank2.getHandRank());
		
		return rank1.getHandRank().compareTo(rank2.getHandRank());
	}

	
}






































