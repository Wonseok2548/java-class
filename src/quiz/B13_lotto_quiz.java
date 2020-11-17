package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_lotto_quiz {

	
	// 1���� 45������ �ߺ����� ���� ���� 6���� �̷���� �迭 ����.
	
	// �� �ߺ��� ������ �ٽ� �̱�
	// �� �̾Ҵ� ���ڴ� ����صα�
	// �� 1 ~ 45�� ���ڸ� ���� �� ������� 6�� �̱�
	
	public static void main(String[] args) {
		Random ran = new Random();
		/*
		
		int[] ranNumArr = new int[6];
		
		int[] report = {};
		
		for (int i = 0; i < 6; i++) {
			int num = (int)(Math.random()*45 + 1);	
			ranNumArr[i] = num;
			report[i] = num;
			if (ranNumArr[i] == ranNumArr[i+1]) {
				ranNumArr[i] = report[i];
			}
			
		}
		System.out.println(Arrays.toString(ranNumArr));		// �迭�� ���� ���� ���.
		
		*/
		

		
		// ����� �ڵ�
		
		
	
		int[] lotto = new int[6];
		int i = 0;
		
		while (i != 6) {
			boolean duple = false;
			lotto[i] = (int)(Math.random()*45 + 1);
			
			// 3���� �̾��� �� 0, 1, 2�� �񱳸� �ؼ�
			// �Ȱ��� ���� �ִٸ� i�� ������Ű�� �ʴ´�. -> �ٽ� �̴´�.
			for (int j = 0; j < i; j++) {
				
				if (lotto[i] == lotto[j]) {
					duple = true;
					break;
				}
			}
			if (!duple) {
				i++;
			}
			
		}
		
		
		System.out.println(Arrays.toString(lotto));			// �迭�� �� ���� ���
		
	
		
		
		}
}






























