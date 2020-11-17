package quiz;

import java.util.Scanner;

public class B09_printAlphabet {
	
	// 1. 반복문을 이용하여 A부터 Z까지 출력.
	// 2. 반복문을 이용하여 z부터 a까지 출력.
	
	public static void main(String[] args) {
		
		 System.out.println((int)'A'+32);
		 System.out.println((int)'a');
		 System.out.println((int)'Z');
		 System.out.println((int)'z');
		
		// Q1.
		String alpha = "";
		
		for (int i = 65; i <= 90; i++ ) {
			char a = (char)i;
			alpha += a;
		}
		System.out.println("Q1. : " + alpha);
		
		
		
		// Q2.
		
		String rev_alpha = "";
		
		for (int i = 122; i >=97; i--) {
			char a = (char)i;
			rev_alpha += a;
		}
		System.out.println("Q2 : " + rev_alpha);
		
		
		// 강사님 코드
		
		// Q1.
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}
		System.out.println("\n");
		
		
		// Q2.
		for (char ch = 'z'; ch >= 'a'; ch--) {
			System.out.print(ch);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}















