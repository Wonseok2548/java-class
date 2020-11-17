package quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import dice.Dice;

public class D02_FiveDice {
	
	// 랜덤으로 5개의 주사위를 굴린 다음에 (주사위의 눈은 1 ~ 6)
	
	// 풀하우스 (같은 숫자가 2개 + 3개)
	// 스몰 스트레이트 (1234/2345/3456)
	// 라지 스트레이트 (12345/23456)
	// 4다이스 (같은 숫자 4개)
	// 5다이스 (같은 숫자 5개)
	
	// 를 구분하는 클래스를 작성하고 테스트 해보세요
	
	// ※ 다른 파일에 작성하고 여기서는 가져다 쓰기만 할 것
	
	public static void main(String[] args) throws InterruptedException {

		// 나의 코드
//		Dice d = new Dice();
//		d.diceNumber();	
//		System.out.println(d);
//		
//		d.n_Dice();
//		d.straight();
//-----------------------------------------------------------------------------------------------------------------------		

		Dice dice = new Dice();
		
		while (true) {
			dice.roll();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("바꾸기 테스트 > ");
			
			Set<Integer> rerolls = new HashSet<>();
			int i = -1;
			while ((i = sc.nextInt()) != -1) {
				rerolls.add(i);
			}
			
			System.out.println("다시 굴려야 하는 인덱스 : " + rerolls);
			dice.reroll(rerolls);
			
			
			Thread.sleep(2000);		// Exception
			
			
			
			
			
			
			
			
		}
	
	}
	
	
}





























