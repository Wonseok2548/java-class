package quiz;

// Ctrl + Shift + O : 자동 import
import java.util.Scanner;


public class B04_appleQuiz {
	
	public static void main(String[] args) {
		
		// 사과를 10개씩 담을 수 있는 바구니가 있다.
		// 사용자가 사과의 개수를 입력하면 사과를 모두 담기위해 필요한 바구니의 개수를 출력해보세요.
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("사과의 개수를 입력하세요 : ");
		int amount = sc.nextInt();
		
		
		int a = amount % 10;		// 개수를 10으로 나눈 나머지
		int b = amount / 10;		// 개수를 10으로 나눈 몫
		int c = b + 1;				// 개수가 10의 배수가 아닐 때 필요한 바구니 개수
		
		int basket = 0;		 		// 바구니 개수
		
		if (amount > 10)
			if (amount % 10 == 0)
				basket = a;
				//System.out.println("필요한 바구니 개수는 " + a + "개 입니다.");
			else
				basket = c;
				//System.out.println("필요한 바구니 개수는 " + c + "개 입니다.");		
		
		else if  (amount > 0)
			basket = 1;
			//System.out.println("필요한 바구니 개수는 1개 입니다.");
		
		
		else
			System.out.println("사과가 없습니다.");
		
		System.out.printf("필요한 바구니는 %d개 입니다\n", basket);
		
		
		
		/* 강사님 풀이 
		 final int BASKET_SIZE = 10;	//변수 앞에 final : 수정이 불가능한 변수가 된다.
		
		
		System.out.println("사과 > ");
		int appleCount = new Scanner(System.in).nextInt();
		
		if (appleCount < 0)
			System.out.println("0 이상의 숫자를 입력하세요");
		else {
			int needBasket = (int)Math.ceil(appleCount / BASKET_SIZE);
			System.out.printf("필요한 바구니는 %d개 입니다.\n", needBasket);
		}
		
		
		System.out.println("프로그램을 종료합니다.");
		*/
		
		
		
		
		
		
		
		
		
		
		
		
	}

}









































