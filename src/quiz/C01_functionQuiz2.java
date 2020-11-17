package quiz;

import java.util.Arrays;

public class C01_functionQuiz2 {
	
	// 1. 최소값과 최대값을 매개변수로 받으면, 그 사이의 모든 값을 포함하는 int배열을 생성하여 반환하는 range함수를 만들어보세요.
	//	  (최소값 이상, 최대값 미만)
	
	// 2. 최대값을 매개변수로 전달받으면, 0부터 최대값 미만의 모든 값을 포함하는 int 배열을 생성하여 반환하는 range2 함수를 만들어보세요.
	
	// 3. 문자열 배열을 전달받으면, 해당 배열을 모두 "/"를 붙여 이어붙이는 join 함수를 만들어보세요.
	//	ex: {"apple", "banana", "orange"}
	//		-> "apple/banana/orange"
	
	// 4. 문자열 타입의 숫자(num), 원래 진법(base_from), 바꾸려는 진법(base_to)를 전달받으면
	//	  base_from의 진법이였던 num을 base_to 진법의 문자열로 변환하여 반환하는 함수를 만들어보세요.
	//	  ※ 만약, 진법이 잘못된 경우 null을 반환합니다.
	//	  ※ 변환할 수 있는 최대진법은 36진법이고, 최소진법은 2진법이다.
	
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
		System.out.println("48을을 7진법으로 변환 : " + ans);
		
		
		
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























