package quiz;

import java.util.Scanner;

public class B10_GCD {
	
	// �� ���ڸ� �Է¹ް� �� ������ �ִ������� ���غ�����.
	// �� �ִ����� : �� ������ ����� �� ���� ū �����.
	
	
	public static void main(String[] args) {
		
		
		System.out.print("���� �� �Է� : ");
		int num1 = new Scanner(System.in).nextInt(); 
		System.out.print("ū �� �Է� : ");
		int num2 = new Scanner(System.in).nextInt();

		int gcd = 0;
		
		
		
		
		for (int k = 1; k <= num2; k++) {					// k�� 16�� �ݺ���
															
				if ((num1 % k == 0) && (num2 % k ==0)) {						
					gcd = k;								// 
					//System.out.print(count1 + " ");
				}
				
				
		}
		System.out.printf("�ִ������� %d�Դϴ�.", gcd);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("=====����� �ڵ�=====");
		System.out.println();
		System.out.println();
		System.out.println();
				
		
		// ����� �ڵ�
		System.out.print("ù��° ���� �Է� : ");
		int num_1 = new Scanner(System.in).nextInt(); 
		System.out.print("ù��° ���� �Է� : ");
		int num_2 = new Scanner(System.in).nextInt();
		
		// num1�� �� ũ�� ���� �ٲ۴�.
		
		if (num_1 > num_2) {
			int temp = num_1;
			num_1 = num_2;
			num_2 = temp;
		}
		
		int GCD = 1;
		for (int i = num_1; i >0; i--) {
			
			if (num_1 % i ==0 && num_2 % i == 0) {
				GCD = i;
				break;
			}
			
		}
		System.out.printf("�ִ������� %d�Դϴ�.", GCD);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}






















