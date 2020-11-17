package quiz;

import java.util.Scanner;

public class B09_strupcase {
	
	
	// 입력받은 문자열의 알파벳이 대문자 -> 소문자
	//					  소문자 -> 대문자
	// ※ 원본이 훼손되지 않고, 새로운 문자열이 생성되어야 함.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력 : ");
		String str = sc.nextLine();
		
				
		StringBuilder new_str = new StringBuilder();
		
		for (int i = 0, len = str.length(); i < len; i++) {
			char word = str.charAt(i);
			char new_word = ' ';

			
			if ((word >= 'A' && word <= 'Z')) {
				new_word = (char)((int)word + 32);
			}
			else if (word >= 'a' && word <= 'z') {
				new_word = (char)((int)word - 32);
			}
			else {
				new_word = word;
				
			}
			new_str.append(new_word);
			
			
			
			
		}
		
		System.out.println("원래 문자열 : " + str);
		System.out.println("변환된 문자열 : " + new_str);
		
		
		/* 소문자를 대문자로 변환하는 방법.
		 * ch는 임의의 변수
		 * ch -= Math.abs('a' - 'A')			
		 * ch -= Math.abs('A' - 'a')
		 * ch = (char)(ch - 'a' + 'A')
		 * ch -= 32;
		*/
			
		
		
		
		
	}
}
