package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_lotto_quiz {

	
	// 1부터 45사이의 중복없는 랜덤 숫자 6개로 이루어진 배열 생성.
	
	// ※ 중복이 있으면 다시 뽑기
	// ※ 뽑았던 숫자는 기록해두기
	// ※ 1 ~ 45의 숫자를 섞은 뒤 순서대로 6개 뽑기
	
	public static void main(String[] args) {
		Random ran = new Random();
		/*
		
		int[] ranNumArr = new int[6];
		
		int[] report = {};
		
		for (int i = 0; i < 6; i++) {
			int num = (int)(Math.random()*45 + 1);	
			ranNumArr[i] = num;
			report[i] = num;
			if (ranNumArr[i] == ranNumArr[i+1]) {
				ranNumArr[i] = report[i];
			}
			
		}
		System.out.println(Arrays.toString(ranNumArr));		// 배열의 값을 보는 방법.
		
		*/
		

		
		// 강사님 코드
		
		
	
		int[] lotto = new int[6];
		int i = 0;
		
		while (i != 6) {
			boolean duple = false;
			lotto[i] = (int)(Math.random()*45 + 1);
			
			// 3까지 뽑았을 때 0, 1, 2와 비교를 해서
			// 똑같은 값이 있다면 i를 증가시키지 않는다. -> 다시 뽑는다.
			for (int j = 0; j < i; j++) {
				
				if (lotto[i] == lotto[j]) {
					duple = true;
					break;
				}
			}
			if (!duple) {
				i++;
			}
			
		}
		
		
		System.out.println(Arrays.toString(lotto));			// 배열의 값 보는 방법
		
	
		
		
		}
}






























