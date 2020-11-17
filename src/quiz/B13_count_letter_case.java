package quiz;

public class B13_count_letter_case {
	
	// 사용자로부터 문장을 하나 입력받았다 치고
	// 해당 문장에 어떤 문자가 몇번 등장했는지 세어서 출력해보세요
	// (대문자, 소문자, 숫자만 집계됩니다.)
	
	
	public static void main(String[] args) {
		
		
		String msg = "The Quick Brown Fox Jumps Over 3 Lazy Dogs";
		
		/*
		System.out.println(msg.length());
		
		int[] count = new int[52];
		
		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			
			if ( ch >= 'a' && ch <= 'z') {
				count[ch - 'a'] += 1;
			}
			
			if ( ch >= 'A' && ch <= 'Z') {
				count[ch - 39] += 1;		// count[]의 대문자 자리 index
			}
		}
		
		for (int i = 0; i <52; i++) {
			if (count[i] > 0) {
				System.out.printf("%c가 등장한 횟수는 %d입니다.\n", i+'a', count[i]);
			}
		}
		*/
		
		// # 강사님 코드
		
		
		int[] count_upper = new int[26];
		int[] count_lower = new int[26];
		int[] count_number = new int[10];
		
		for (int i=0, len = msg.length(); i<len; i++) {
			
			char ch = msg.charAt(i);
			
			if (ch >= 'A' && ch < 'Z') {
				count_upper[ch - 'A'] += 1;
			}
			else if (ch >= 'a' && ch <= 'z') {
				count_lower[ch - 'a'] += 1;
			}
			else if (ch >= '1' && ch <= '9') {
				count_number[ch - '0'] += 1;
			}
		}
		
		for (int i = 0; i < count_upper.length; i++) {
			if (count_upper[i] > 0) {				
				System.out.printf("%c : %d회\n", i+'A', count_upper[i]);
			}
		}
		
		for (int i = 0; i < count_lower.length; i++) {
			if (count_lower[i] > 0) {				
				System.out.printf("%c : %d회\n", i+'a', count_lower[i]);
			}
		}
		
		for (int i = 0; i < count_number.length; i++) {
			if (count_number[i] > 0) {				
				System.out.printf("%c : %d회\n", i+'0', count_number[i]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}














