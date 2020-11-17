package quiz;

import java.util.Scanner;

public class B11_reverse_number {

	// 사용자로부터 정수를 하나 입력받고
	// 그 정수를 일의자리부터 순서대로 출력해보세요.
	
	// 12345 -> 54321
	
	public static void main(String[] args) {
		
		/*
		System.out.print("정수 입력 : ");
		String number = new Scanner(System.in).nextLine();
		
		int len = number.length();
		
		
		int i = len-1;
		while (i >= 0) {
			char word = number.charAt(i);
			System.out.print(word);
			i--;
		}
		*/
		
		
		// 강사님
		System.out.print("정수 입력 : ");
		
		int user = new Scanner(System.in).nextInt();
		
		int reversed = 0;
		
		
		while (true) {
			//System.out.print(user % 10);
			
			reversed += user % 10;	// 0 + 369 % 10 = 0 + 9 = 9;		90+6=96			960+3=963
			user = user /10;		// 369 / 10 = 36;					36/10=3			3/10=0
			
			if (user <= 0) {
				break;
			}
			reversed = reversed * 10;	// 9 * 10 = 90					960				
					
		}
		System.out.print(reversed);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
