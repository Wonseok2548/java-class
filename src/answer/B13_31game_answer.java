package answer;

import java.util.Random;
import java.util.Scanner;

public class B13_31game_answer {
	
	
	public static void main(String[] args) {
		// �ʱ�ȭ �κ�
		Scanner user = new Scanner(System.in);
		Random ran = new Random();
		
		int game_num = 0;
		
		boolean computer_turn = ran.nextBoolean();
		
		System.out.printf("<%s>�� �����Դϴ�!\n", computer_turn ? "��ǻ��" : "���");	// ���׿�����
		
		while (true) {
			// �Է� �κ�
			int num;
			
			if (computer_turn) {
				
				// # ��ǻ�Ͱ� ������ �̱�� ����
				// ��ǻ�Ͱ� game_num�� �� �� 
				// 2, 6, 10, 14, 18, 22, 26 30�� ����� ������ �̱�
				if (game_num % 4 == 0) {
					num = 2;
				}
				else if (game_num % 4 == 3) {
					num = 3;
				}
				else if (game_num % 4 == 1) {
					num = 1;
				}
				else {
					num = ran.nextInt(3) + 1;
				}
				
				
				
				
				//num = ran.nextInt(3) + 1;			// ��ǻ�Ͱ� �������� ���ڸ� ����
				System.out.print("��ǻ�� > " + num);
			}
			else {
				System.out.print("��� > ");
				num = user.nextInt();
				
				if (num >3 || num < 1) {
					System.out.print("\t1~3�� �Է��ϼ���: ");
					continue;			// 1~3 �̿��� ���ڸ� �Է� ������ �ٽ� �� ���� �ö�
				}
				
			}
			
			// ó�� �κ�
			game_num += num;
			
			// ��� �κ�
			if (game_num >= 31) {
				break;
			}

			System.out.println("\t�����Ȳ : " + game_num);
			computer_turn = !computer_turn;
			
		}
		
		System.out.printf("<%s>�� �¸�!\n", computer_turn ? "���" : "��ǻ��");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}










