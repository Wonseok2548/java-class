package quiz;

public class B13_count_letter_case {
	
	// ����ڷκ��� ������ �ϳ� �Է¹޾Ҵ� ġ��
	// �ش� ���忡 � ���ڰ� ��� �����ߴ��� ��� ����غ�����
	// (�빮��, �ҹ���, ���ڸ� ����˴ϴ�.)
	
	
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
				count[ch - 39] += 1;		// count[]�� �빮�� �ڸ� index
			}
		}
		
		for (int i = 0; i <52; i++) {
			if (count[i] > 0) {
				System.out.printf("%c�� ������ Ƚ���� %d�Դϴ�.\n", i+'a', count[i]);
			}
		}
		*/
		
		// # ����� �ڵ�
		
		
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
				System.out.printf("%c : %dȸ\n", i+'A', count_upper[i]);
			}
		}
		
		for (int i = 0; i < count_lower.length; i++) {
			if (count_lower[i] > 0) {				
				System.out.printf("%c : %dȸ\n", i+'a', count_lower[i]);
			}
		}
		
		for (int i = 0; i < count_number.length; i++) {
			if (count_number[i] > 0) {				
				System.out.printf("%c : %dȸ\n", i+'0', count_number[i]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}














