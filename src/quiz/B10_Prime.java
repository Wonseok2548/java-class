package quiz;

import java.util.Scanner;

public class B10_Prime {
	
	// ����ڷκ��� ���ڸ� �Է¹�����
	// 1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����Ϥӿ�.
	
	public static void main(String[] args) {
		
		
		/*for(int i = 2; i < number; i++) {
			int rest = number % i;
			
			if (rest != 0 ) {
				PRIME = "�Ҽ���";
				break;
				
			}
			else
				PRIME = "�Ҽ� �ƴ�";
			
		}
		System.out.println(PRIME);
		
		System.out.println("�Ҽ� �Դϴ�.");
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int number = sc.nextInt();
		
		String PRIME = "�Ҽ���"; 
		
		for (int i = 2; i < number; i++) {
			int THE_REST = (number % i);
					
			if (THE_REST == 0) {				
				PRIME = "�Ҽ� �ƴ�";
				//System.out.println("NO PRIME");	
				break;
			} 
			//else
				//System.out.println("PRIME");
		}
		System.out.println(number + "�� " + PRIME);
		
		
		
		
		// �����
		
		System.out.print("���� > ");
		int user = new Scanner(System.in).nextInt();
		
		
		// i : �Ҽ����� �׽�Ʈ�غ� ����
		for (int i = 2; i <= user; i++) {
			int count = 0;
			// j : i�� ������� �׽�Ʈ�غ� ����
			int sqrt = (int)Math.sqrt(i);
			for (int j = 2; j < sqrt; j++) {
				if (i % j ==0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.printf("%d�� �Ҽ��Դϴ�.\n", i);
			}
		}
		
	}

}
