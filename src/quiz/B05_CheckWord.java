package quiz;

import java.util.Scanner;

public class B05_CheckWord {
	
	// 사용자로부터 단어를 하나 입력받고
	// 첫번째 글자와 마지막 글자가 일치하면 "OK" 출력.
	// 아니라면 "NOT OK" 출력.
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아무 단어나 입력하세요 : ");
		String word = sc.nextLine();
		
		int length = word.length();		// 입력받은 단어의 길이		
		int last = word.length() - 1;	// 마지막 글자의 index 번호
		
		
		
		if (length <= 1)	// null : 아무 값도 없는 상태.
			System.out.println("단어의 길이가 부족합니다.");
		
		else
			if (word.charAt(0) == word.charAt(last)) 
				System.out.println("OK");
			else
				System.out.println("NOT OK");
		
		
		/* 강사님이 하신것.
		
		String WORD = "A";
		
		char first_letter = word.charAt(0);
		char last_letter = word.charAt(word.length() - 1);
		
		if (first_letter == last_letter)
			System.out.println("OK");
		else
			System.out.println("NO OK");
			
		*/	
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}





































