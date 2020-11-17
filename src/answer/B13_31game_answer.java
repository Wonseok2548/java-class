package answer;

import java.util.Random;
import java.util.Scanner;

public class B13_31game_answer {
	
	
	public static void main(String[] args) {
		// 초기화 부분
		Scanner user = new Scanner(System.in);
		Random ran = new Random();
		
		int game_num = 0;
		
		boolean computer_turn = ran.nextBoolean();
		
		System.out.printf("<%s>의 선공입니다!\n", computer_turn ? "컴퓨터" : "사람");	// 삼항연산자
		
		while (true) {
			// 입력 부분
			int num;
			
			if (computer_turn) {
				
				// # 컴퓨터가 무조건 이기는 로직
				// 컴퓨터가 game_num을 본 후 
				// 2, 6, 10, 14, 18, 22, 26 30을 만들면 무조건 이김
				if (game_num % 4 == 0) {
					num = 2;
				}
				else if (game_num % 4 == 3) {
					num = 3;
				}
				else if (game_num % 4 == 1) {
					num = 1;
				}
				else {
					num = ran.nextInt(3) + 1;
				}
				
				
				
				
				//num = ran.nextInt(3) + 1;			// 컴퓨터가 랜덤으로 숫자를 뽑음
				System.out.print("컴퓨터 > " + num);
			}
			else {
				System.out.print("사람 > ");
				num = user.nextInt();
				
				if (num >3 || num < 1) {
					System.out.print("\t1~3만 입력하세요: ");
					continue;			// 1~3 이외의 숫자를 입력 받으면 다시 맨 위로 올라감
				}
				
			}
			
			// 처리 부분
			game_num += num;
			
			// 출력 부분
			if (game_num >= 31) {
				break;
			}

			System.out.println("\t현재상황 : " + game_num);
			computer_turn = !computer_turn;
			
		}
		
		System.out.printf("<%s>의 승리!\n", computer_turn ? "사람" : "컴퓨터");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}










