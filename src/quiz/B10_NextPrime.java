package quiz;

import java.util.Scanner;

public class B10_NextPrime {
	
	// ����ڷκ��� ���ڸ� �Է¹�����
	// �Է¹��� ������ �� ũ�ų� ���� ���� �Ҽ��� ã�Ƽ� ���.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		
		int number = sc.nextInt();
		
		
		// i : �Ҽ����� �׽�Ʈ�غ� ����
		for (int i = number, num2 = number * number; i <= num2; i++) {
			int count = 0;
			
			// j : i�� ������� �׽�Ʈ�غ� ����
			// int sqrt = (int)Math.sqrt(num2); // ������
			
			for (int j = 2; j < i; j++) {		// j <= i �� �ȵǴ� ���� : ��ȣ(=)�� ������ �ڱ� �ڽű��� �����ؼ� ������ �۾��� �ݺ��ϱ� ����
				if (i % j ==0) {				//					   ������ count�� 1�� �̻��� �ȴ�. 
					count++;
					
				}
			}
			if (count == 0) {
				System.out.printf("���� �Ҽ��� %d�Դϴ�.\n", i);
				break;
			}
		}
		
		
		// ����� �ڵ�
		int user =123;
		for (int i = user; true; i++) {
			int count = 0;
			int sqrt = (int)Math.sqrt(i);
			for (int j = 2; j < sqrt; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.printf("�����Ҽ� : %d \n", i);
				break;
			}
		}
		
		
		
		
		
		
		
		
	}

}


















