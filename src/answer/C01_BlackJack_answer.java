package answer;

import java.util.Random;

public class C01_BlackJack_answer {
	
	// # 블랙잭을 만들어 보세요.
	
	// * 게임 순서
	// 1. 딜러(컴퓨터)와 플레이어가 카드를 2장씩 받는다
	//	  이 때, 딜러의 카드는 한 장 가려놓는다. 
	// 2. 사용자는 카드를 보고 더 뽑을지(hit) 멈출지(stand)를 결정한다.
	// 3. 사용자가 멈추면 딜러가 가려져 있던 카드를 뒤집은 뒤 규칙에 따라 카드를 뽑는다.
	//    (컴퓨터는 뽑은 카드 합이 16이하일 때 무조건 뽑고, 17 이상이면 무조건 멈춘다.)
	// 4. 딜러보다 합이 높거나 정확하게 21이라면 승리 (베팅 금액만큼 플레이어의 돈이 오른다.)
	//	  딜러보다 합이 낮거나 21이 넘으면 패배 (베팅 금액만큼 플레이어의 돈이 떨어진다.)
	//	  딜러와 카드의 합이 같다면 무승부
	
	// ※ A는 합이 21이 넘을때는 1로 사용하고 21이하일 때는 11로 사용한다.
	// ※ J, Q, K는 10에 해당한다.
	// ※ 각 카드는 문양별로 한장씩 존재한다.
	
	// 1 ~ 9는 숫자
	// A : 10, B: J, C : Q, D : K
	
	
	public static void main(String[] args) {
		
		
		
		int [] deck = {2, 3, 4, 5, 6, 7, 8, 9, 10};	//
		
		
		
		//while(true) {
			
			int com_total = 0;
			//for (int i=0; i<2; i++) 
			while (true){
				
				int com_num = (int)(Math.random()*9);
				int com_deck = deck[com_num];
				System.out.println("컴퓨터가 뽑은 숫자 : " + com_deck);
				
				com_total += com_deck;
				System.out.println("현재까지 컴퓨터 합계 : " + com_total);
		
				
				if (com_total > 16 && com_total < 21) {
					System.out.println("총 합계가 17이상이므로 카드를 그만 뽑습니다.");
					break;
				}
				
				else if (com_total == 21) {
					System.out.println("컴퓨터의 승리입니다.");
					break;
				}
				
				else if (com_total > 21) {
					System.out.println("총 합계가 21초과이므로 패배입니다.");
					break;
				}
				
				
			}
			
			
			
		
			
			
			
		//}
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
	}
	
}














