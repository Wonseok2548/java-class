package quiz;

import java.util.Scanner;

public class B06_monthToSeason {
	
	// 사용자로부터 달을 입력받으면 해당하는 계절을 출력.
	// switch-case문 이용하기.

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몇월인가요 ? 입력해주세요 : ");
		
		int month = sc.nextInt();
		
		switch (month) {
			case 1 :
				System.out.println("한겨울입니다.");
				break;
			case 2 :
				System.out.println("늦겨울입니다.");
				break;
			case 3 :
				System.out.println("초봄입니다.");
				break;
			case 4 :
				System.out.println("봄입니다.");
				break;
			case 5 :
				System.out.println("늦봄입니다.");
				break;
			case 6 :
				System.out.println("초여름입니다.");
				break;
			case 7 :
				System.out.println("한여름입니다.");
				break;	
			case 8 :
				System.out.println("늦여름입니다.");
				break;
			case 9 :
				System.out.println("초가을입니다.");
				break;
			case 10 :
				System.out.println("한가을입니다.");
				break;
			case 11 :
				System.out.println("늦가을입니다.");
				break;
			case 12 : 
				System.out.println("초겨울입니다.");
				break;		
		}	
	}
}



























