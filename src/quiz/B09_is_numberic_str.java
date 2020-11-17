package quiz;

import java.util.Scanner;

public class B09_is_numberic_str {
	
	// 입력받은 문자열에 숫자만 포함되어있으면 결과에 1을 저장
	// 다른문자가 포함되어 있으면 0을 저장하여 출력
	
	// ※ 단, 문자열이 비어있을 때는 결과가 2
	
	
	public static void main(String[] args) {
		
		/*
		System.out.print("문자열 입력 : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		char result = '2';
		
		
		if (str.equals("") || str == null || str.length() == 0) 		// 문자열 비교는 equls()
			System.out.println(result); 		//str.length() == 0 와 str.equals("")는 같은 뜻
		
				
		int length = str.length();
		
		for (int i = 0; i < length; i++) {
			char ch = str.charAt(i);
			
			/*if (ch >= '0' && ch <= '9') {
				result = '1'; 							// 다시봐야 할 부분.
				break;
			}
			/
			
			
			
			if (!(ch >= '0' && ch <= '9')) {
				result = '0';
				break;}
			
			if (i == length -1)
				result = '1';
			
		
		}
		
		System.out.println(result);
	
		*/
		
		// 강사님
		
		System.out.print("문자입력 > ");
		String str = new Scanner(System.in).nextLine();
		
		int status = 1;
		
		if (str == null || str.length() == 0)
			status = 2;
		else
			for (int i = 0, len = str.length(); i < len; i++) {
			
				char ch = str.charAt(i);
			
				if (ch < '0' || ch > '9') {
					status = 0;
					break;
				}	
			
		}
		System.out.println("문자열 상태 : " + status);
		
		
	}
}


