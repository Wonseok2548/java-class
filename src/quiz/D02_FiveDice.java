package quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import dice.Dice;

public class D02_FiveDice {
	
	// �������� 5���� �ֻ����� ���� ������ (�ֻ����� ���� 1 ~ 6)
	
	// Ǯ�Ͽ콺 (���� ���ڰ� 2�� + 3��)
	// ���� ��Ʈ����Ʈ (1234/2345/3456)
	// ���� ��Ʈ����Ʈ (12345/23456)
	// 4���̽� (���� ���� 4��)
	// 5���̽� (���� ���� 5��)
	
	// �� �����ϴ� Ŭ������ �ۼ��ϰ� �׽�Ʈ �غ�����
	
	// �� �ٸ� ���Ͽ� �ۼ��ϰ� ���⼭�� ������ ���⸸ �� ��
	
	public static void main(String[] args) throws InterruptedException {

		// ���� �ڵ�
//		Dice d = new Dice();
//		d.diceNumber();	
//		System.out.println(d);
//		
//		d.n_Dice();
//		d.straight();
//-----------------------------------------------------------------------------------------------------------------------		

		Dice dice = new Dice();
		
		while (true) {
			dice.roll();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("�ٲٱ� �׽�Ʈ > ");
			
			Set<Integer> rerolls = new HashSet<>();
			int i = -1;
			while ((i = sc.nextInt()) != -1) {
				rerolls.add(i);
			}
			
			System.out.println("�ٽ� ������ �ϴ� �ε��� : " + rerolls);
			dice.reroll(rerolls);
			
			
			Thread.sleep(2000);		// Exception
			
			
			
			
			
			
			
			
		}
	
	}
	
	
}





























