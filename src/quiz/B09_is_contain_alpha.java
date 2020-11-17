package quiz;

import java.util.Scanner;

public class B09_is_contain_alpha {
	
	// 사용자가 입력한 문자열에 알파벳이 포함되어 있으면 true 출력
	// 없으면 false 출력
	
	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String sentence = sc.nextLine();
		
		int length = sentence.length(); // 문자열의 길이
		
		
		
		for (int i= 0; i <= length -1; i++) {
			
			char ch = sentence.charAt(i);
			
			
			if ((ch >= 'A' && ch <= 'z')) {
				System.out.println("true");
				break; 
				}
			
			if (i == length -1 )				// for문이 끝난지를 확인.
				System.out.println("false");
			
			
			
		}
		*/
		System.out.print("문장입력 : ");
		String str = new Scanner(System.in).nextLine();
		
		boolean result = false;
		
		// str.length()를 한번만 호출하는 방식
		for (int i = 0, len = str.length(); i < len; i++) {
			char ch = str.charAt(i);
			
			
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				result = true;
				break;	// 만나면 반복문을 끝낸다.
			}
		
		System.out.println(result);
			
			
			
			
		}
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

























