

package quiz;

import java.util.Scanner;

public class B01_GuessAge {
	
	
	// 사용자로부터 올해의 년도와 태어난 년도를 입력받으면
	// 한국 나이를 계산하여 몇 살인지 알려주는 프로그램을 만들어보세요.
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("올해의 연도를 입력하세요 : ");
		int year = sc.nextInt();
		
		System.out.print("태어난 연도를 입력하세요 : ");
		int birth = sc.nextInt();
		
		int KoreanAge = (year - birth) + 1;
		
		System.out.println("올해 당신의 한국 나이는 " + KoreanAge + "살 입니다.");
		
		
		
		
		
		
		
		
	}
}
































