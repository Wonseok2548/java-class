package quiz;

import java.util.Arrays;

public class C01_functionQuiz2 {
	
	// 1. �ּҰ��� �ִ밪�� �Ű������� ������, �� ������ ��� ���� �����ϴ� int�迭�� �����Ͽ� ��ȯ�ϴ� range�Լ��� ��������.
	//	  (�ּҰ� �̻�, �ִ밪 �̸�)
	
	// 2. �ִ밪�� �Ű������� ���޹�����, 0���� �ִ밪 �̸��� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ� range2 �Լ��� ��������.
	
	// 3. ���ڿ� �迭�� ���޹�����, �ش� �迭�� ��� "/"�� �ٿ� �̾���̴� join �Լ��� ��������.
	//	ex: {"apple", "banana", "orange"}
	//		-> "apple/banana/orange"
	
	// 4. ���ڿ� Ÿ���� ����(num), ���� ����(base_from), �ٲٷ��� ����(base_to)�� ���޹�����
	//	  base_from�� �����̿��� num�� base_to ������ ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �Լ��� ��������.
	//	  �� ����, ������ �߸��� ��� null�� ��ȯ�մϴ�.
	//	  �� ��ȯ�� �� �ִ� �ִ������� 36�����̰�, �ּ������� 2�����̴�.
	
	public static int[] range(int min_num, int max_num) {
		
		
		int len = max_num - min_num;
		
		int[] answer = new int[len];
		
		answer[0] = min_num;
		
		for (int i=1; i<len; i++) {
			min_num++;
			answer[i] = min_num;
		}		
		return answer;
		
	}
	
	public static int[] range2(int max_num) {
			
			
			int len = max_num;
			
			int[] answer = new int[len];

			for (int i=0; i<len; i++) {
				answer[i] = i;				
			}		
			return answer;
			
		}
	
	public static String join(String[] arr) {
		
		String answer = "";
		
		int len = arr.length;
		
		answer = arr[0]; 
		
		for (int i=1; i<len; i++) {
			
			answer = answer + '/' + arr[i];			
		}
		

		
		return answer;
	}
	
	
	
	public static String new_base_number(String num, int base_from, int base_to) {
		
		String answer = "";
		int len = num.length();
		
		if (base_from <= 10) {
			
			for (int i=0; i < len; i++) {
				answer = answer + base_from * num.charAt(0);
			}
		}
		
		
		return answer;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Q1 : " + Arrays.toString(range(3,10)));
		System.out.println("Q2 : " + Arrays.toString(range2(5)));
		
		
		String[] arr = {"abc", "def", "ghi", "kkk", "dfadf"};
		System.out.println("Q2 : " + (join(arr)));
		
		
		int num = 48;
		String ans = "";
		while (num > 0) {
			ans = (num % 7) + ans;
			num = num /7;
		}
		System.out.println("48���� 7�������� ��ȯ : " + ans);
		
		
		
		System.out.println("---------------------------");
		
		int number = 70;
		int base_from = 8;
		
		int answer = 0;
		
		while (true) {
			int rest = number % 10;
			number = number / 10;
			
			answer += (rest * base_from);

			if ( number == 0 )
				break;
		}
		System.out.println(answer);
		
		
		
		
		
	}

}























