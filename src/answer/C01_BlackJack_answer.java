package answer;

import java.util.Random;

public class C01_BlackJack_answer {
	
	// # ������ ����� ������.
	
	// * ���� ����
	// 1. ����(��ǻ��)�� �÷��̾ ī�带 2�徿 �޴´�
	//	  �� ��, ������ ī��� �� �� �������´�. 
	// 2. ����ڴ� ī�带 ���� �� ������(hit) ������(stand)�� �����Ѵ�.
	// 3. ����ڰ� ���߸� ������ ������ �ִ� ī�带 ������ �� ��Ģ�� ���� ī�带 �̴´�.
	//    (��ǻ�ʹ� ���� ī�� ���� 16������ �� ������ �̰�, 17 �̻��̸� ������ �����.)
	// 4. �������� ���� ���ų� ��Ȯ�ϰ� 21�̶�� �¸� (���� �ݾ׸�ŭ �÷��̾��� ���� ������.)
	//	  �������� ���� ���ų� 21�� ������ �й� (���� �ݾ׸�ŭ �÷��̾��� ���� ��������.)
	//	  ������ ī���� ���� ���ٸ� ���º�
	
	// �� A�� ���� 21�� �������� 1�� ����ϰ� 21������ ���� 11�� ����Ѵ�.
	// �� J, Q, K�� 10�� �ش��Ѵ�.
	// �� �� ī��� ���纰�� ���徿 �����Ѵ�.
	
	// 1 ~ 9�� ����
	// A : 10, B: J, C : Q, D : K
	
	
	public static void main(String[] args) {
		
		
		
		int [] deck = {2, 3, 4, 5, 6, 7, 8, 9, 10};	//
		
		
		
		//while(true) {
			
			int com_total = 0;
			//for (int i=0; i<2; i++) 
			while (true){
				
				int com_num = (int)(Math.random()*9);
				int com_deck = deck[com_num];
				System.out.println("��ǻ�Ͱ� ���� ���� : " + com_deck);
				
				com_total += com_deck;
				System.out.println("������� ��ǻ�� �հ� : " + com_total);
		
				
				if (com_total > 16 && com_total < 21) {
					System.out.println("�� �հ谡 17�̻��̹Ƿ� ī�带 �׸� �̽��ϴ�.");
					break;
				}
				
				else if (com_total == 21) {
					System.out.println("��ǻ���� �¸��Դϴ�.");
					break;
				}
				
				else if (com_total > 21) {
					System.out.println("�� �հ谡 21�ʰ��̹Ƿ� �й��Դϴ�.");
					break;
				}
				
				
			}
			
			
			
		
			
			
			
		//}
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
	}
	
}














