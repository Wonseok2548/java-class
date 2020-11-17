package quiz;

public class B13_count_letter {
	
	// 사용자로부터 문장을 하나 입력받았다 치고
	// 해당 문장에 어떤 알파벳이 몇번 등장했는지 세어서 출력해보세요
	// 대소문자 구분X

	
	
	public static void main(String[] args) {
		
		
		
		String msg = "The Quick Brown Fox Jumps Over a Lazy Dog";
		
		// int count_a = 0;
		// int count_b = 0;
		// int ocunt_c = 0;
		
		int[] count = new int[26];
		
		
		
		
		msg = msg.toLowerCase();	// 일괄적으로 소문자로 변경. 대문자는 .toUpperCase();
		System.out.println(msg);
		
		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			
			if ( ch >= 'a' && ch <= 'z') {	//	공백일 때는 에러가 나기 때문에 알파벳 일때만 동작하도록 설정
				count[ch - 'a'] += 1;	// i가 5 -> ch는 U. count[U - A] = count[85-65=20] -> count[20] = U
			}
			
			
		}
		
		for (int i = 0; i <26; i++) {
			if (count[i] > 0) {
				System.out.printf("%c가 등장한 횟수는 %d입니다.\n", i+'a', count[i]);
			}
		}
		
			
	
		
		
		
		
		
	}
}

















