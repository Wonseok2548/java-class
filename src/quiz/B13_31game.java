package quiz;

import java.util.Scanner;

public class B13_31game {
	
	// # 31������ ��������.
	
	// 1. ��ǻ�Ϳ� ����� �����ư��鼭 ���ڸ� �����Ѵ� (1, 2, 3)
	// 2. ��ǻ�ʹ� �������� ���ڸ� �����Ѵ�.
	// 3. �������� 31 �̻��� ���ڸ� ����� ��� Ȥ�� ��ǻ�Ͱ� �й��Ѵ�.
	
	// ���� �� : 
	// ��ǻ�� > 2
	//		���� ���� : 2
	// ��� > 3
	//		���� ���� : 5
	// ...
	// ��ǻ�� > 3
	//		���� ���� : 32
	//		��ǻ���� �й��Դϴ�.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ran_number = (int)(Math.random()*2 + 1);
		boolean status = true;
		
		System.out.println("�������� ������ ���մϴ�.");
		System.out.println("1 : ��ǻ�� ����");
		System.out.println("2 : ����� ����");
		
		System.out.println("���� ���� : " + ran_number);		// 1�� ��ǻ�� ����, 2�� �������
		System.out.println("----------------<Game Start>----------------");

		


		
		int amount = 0;
		
		if (ran_number == 1) {
			System.out.println("��ǻ�� ���� �̽��ϴ�.");
	
		
			for (int i=0; i<31; i++){
				int computer_number = (int)(Math.random()*3 + 1);
				
				System.out.println("��ǻ�Ͱ� ���� �� : " + computer_number);
				amount = amount + computer_number;
				System.out.println("���� ���� : " + amount);
				System.out.println("------------------------------");
				if (amount >= 31) {
					System.out.println("��ǻ���� �й��Դϴ�.");
					break;
					}
				
				
				System.out.print("����� ���� �Է� : ");
				int num = sc.nextInt();
				
		
				while (true) {
					if (num < 1 || num > 3) {
						System.out.print("1,2,3 �߿��� ������ �ּ��� : ");
						int new_num =sc.nextInt();
						num = new_num;
					}
					else {
						status = false;
						break;
					}
				}
				
				amount = amount + num;
				System.out.println("���� ���� : " + amount);
				System.out.println("------------------------------");
				if (amount >= 31) {
					System.out.println("������� �й��Դϴ�.");
					break;
					}
				
			
			}
		
		
		}
		
		if (ran_number == 2) {
			System.out.println("��� ���� �̽��ϴ�.");
			
			
			for (int i=0; i<31; i++){
				
				System.out.print("����� ���� �Է� : ");
				int num = sc.nextInt();
				
				while(true) {
					if (num < 1 || num > 3) {
						System.out.print("1,2,3 �߿��� ������ �ּ��� : ");
						int new_num =sc.nextInt();
						num = new_num;	
					}
					else {
						status = true;
						break;
					}
				}
				
				amount = amount + num;
				
				System.out.println("���� ���� : " + amount);
				System.out.println("------------------------------");
				if (amount >= 31) {
					System.out.println("������� �й��Դϴ�.");
					break;
					}
				
				int computer_number = (int)(Math.random()*3 + 1);
				System.out.println("��ǻ�Ͱ� ���� �� : " + computer_number);
				amount = amount + computer_number;
				System.out.println("���� ���� : " + amount);
				System.out.println("------------------------------");
				if (amount >= 31) {
					System.out.println("��ǻ���� �й��Դϴ�.");
					break;
					}
				
				
				
				
			
			}
		
		
		}
		
		
		
	}	
	
}














