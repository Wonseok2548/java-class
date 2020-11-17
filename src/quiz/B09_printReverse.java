package quiz;

import java.util.Scanner;

public class B09_printReverse {
	
	// 사용자가 문장을 입력하면 그 문장을 거꾸로 출력하세요.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장을 입력하세요 : ");
		
		String sentence = sc.nextLine();
		
		int a = sentence.length();
		
		String rvs = "";
		
		for (int i= a; i >= 0; i-- ) {
			char c = sentence.charAt(i);
			rvs += c;
		}
		System.out.println(rvs);
		
		
		
		// 강사님 코드
		/*
		System.out.print("문장 입력 : ");
		String sentence = new Scanner(System.in).nextLine();
		
		for (int i = sentence.length() -1; i >= 0; i--) {
			reverse += sentence.charAt(i);
		}
		System.out.println(reverse);
		*/
		
		// StringBuilder는 += 대신 append() 함수를 통해 문자열을 만든다.
		StringBuilder str = new StringBuilder("hello");
		str.append(", world!");
		
		// 다 만들고 난 뒤에 String으로 변환해서 사용하면 된다.
		String build_result = str.toString();
		System.out.println(build_result);
		
		// 거꾸로 만든 문자열을 저장할 변수
		String reverse = "";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
























