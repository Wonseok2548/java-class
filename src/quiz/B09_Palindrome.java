package quiz;

import java.util.Scanner;

public class B09_Palindrome {

	
	// 사용자로부터 단어를 하나 받고
	// 해당 단어가 회문이라면 "PALINDROME" 출력
	// 회문이 아니라면 "NOT PALINDROME" 출력
	
	// ※ ABBA, MADAM, BORROWORROB 처럼 좌우대칭인 단어를 회문이라고 한다.
	
	public static void main(String[] args) {
		

		System.out.print("단어를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		
		int len = word.length();
		
		String answer = "";
		
		
		
		if (len % 2 == 0) {
			
			for (int i = 0; i < len / 2; i++) {
				char ch = word.charAt(i);
				
				if (ch == word.charAt(len -i -1)) {
					answer = "PALINDROME";
				}
				else 
					answer = "NOT PALINDROME";
				
			}
		}
		
		
		
		else {
			for (int i = 0; i < len / 2; i++) {
				char ch = word.charAt(i);
				
				if (ch == word.charAt(len-i-1)) {
					answer = "PALINDROME";				
				}
				else
					answer = "NOT PALINDROME";			
			}
		}
			
		System.out.print(answer);				
	}


/*

	System.out.print("입력 : ")
	String word = sc.next();
	StringBuilder strb = new StringBuilder(word);
	String revers = strb.reverse().toString();

	int half = word.length() / 2;

	boolean palin = true;

	for (int i = 0; i < half; i++) {
		if (word.charAt(i) != reverse.charAt(i)) {
			palin = false;
			break;
		}
	}


*/

}






























