package quiz;

public class B11_whileQuiz {
	
	// while���� �̿��Ѵ�.
	
	// 1. 1���� 100������ 3�� ����� ������ ���غ�����.
	
	// 2. 200���� 1���� ����غ�����.
	
	/* 3. 1���� 200������ ���� ��
		  2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ������ ���Ͻÿ�. */
	
	
	
	public static void main(String[] args) {
		
		System.out.println("���� 1�� -----------------------");
		// Q1.
		int i = 1;
		int sum = 0;
		
		while (i <= 100) {
			if (i % 3 == 0) {	// 3�� ������� Ȯ���ϱ�
				sum = sum+i;
			}
			i++;
		
		}
		System.out.println("�� : " + sum);
		
		System.out.println("���� 2�� -----------------------");
		
		
		// Q2.
		int j = 200;
		
		while (j >= 1) {			
			System.out.println(j);
			j--;
		}
		
		System.out.println("���� 3�� -----------------------");
		
		
		// Q3.
		
		int k = 1;
		int answer = 0;
		
		while (k <= 200) {
			if ((k % 2 != 0) && (k % 3 !=0)) {
				
				answer = answer + k;
			}
			k++;
		}
		System.out.println("�� : " + answer);
		
		
		
		
		
		
		
	}
}













