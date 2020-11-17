package quiz;

import java.util.Scanner;

public class B11_count_369_clap {

	// 사용자로부터 정수 하나를 입력받고
	// 해당 숫자까지 3,6,9 게임이 진행된다면 박수를 총 몇번 쳐야하는지 구하시오.


	public static void main(String[] args) {

		// # 프로그램 실행시간 측정
		long start_time = System.currentTimeMillis();


		System.out.print("숫자 입력 : ");
		int user = new Scanner(System.in).nextInt();

		int clap = 0;


		for (int i = 1; i <= user; i++) {	// i는 원래 user였음.
			int check = i;


			while (check != 0) {

				int digit = check % 10; 		// 이걸로 계속 1의자리 판단. 		1
				int b = check / 10;				// a로 계속 나누기 할 대상. 		0

				if (digit == 3 || digit == 6 || digit == 9) {
					clap++;

				}

				// check = i - digit;

				// 현재 user는 120

				check = check / 10;
				//i = i/10;		// 12	1

				/*if (i <= 0)
				break;*/


			}


		}		

		System.out.println(clap);
		
		long end_time = System.currentTimeMillis();
		
		System.out.println("걸린시간 : " + (end_time - start_time));
		

	}
}
