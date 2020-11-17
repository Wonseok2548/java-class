package quiz;

import java.util.Scanner;

public class B09_forQuizBasic {
	
	// 사용자가 숫자를 입력했을 때
	// 1. 10부터 입력한 숫자까지의 총 합을 구하시오.
	// 2. 1부터 입력한 숫자 사이의 3의 배수만 모두 출력하고, 몇개인지도 출력하시오.

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력 : ");
		
		int number = sc.nextInt();
		int total = 0;
		
		if (number < 10 && number >= 0) {
			for (int i = number; i <= 10; i++) {
				total += i;
			}
		} else if (number < 0) {
			for (int i = number; i <=10; i++) {
				total += i;
			}
		} else {
			for (int i = 10; i <= number; i++) {
				total += i;
			}
		}
		
			
		
		System.out.println(total);
		
		
		
		
		
		
		
		
		
		
		
		
		/*  강사님 코드 ********************/
		/*
		 
		// Q1.
		System.out.print("숫자입력 > ");
		int user = new Scanner(System.in).nextInt();
		// start = 10
		// end = -1
		int start = 10;
		int end = user;
		
		int sum = 0;
		
		if (start > end) {
			int temp = start;
			start = end;
			end = temp;
		}
		
		for (int i = start; i <= end; ++i) {
			sum += i;
		}
		
		System.out.println(sum);
		
		// Q2.
		
		int start2 = 1;
		int end2 = user;
		
		if (start2 > end2) {
			int temp = start2;
			start2 = end2;
			end2 = temp;
		
		}
		
		int count = 0;
		System.out.print("[");
		for (int i = start2; i <= end2; ++i) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
				count += 1;
			}
		}
		
		System.out.print("]\n");
		System.out.println("Q1. 10부터의 총합 - " + sum);
		System.out.println("Q2. 3의 배수의 개수 - " + count + "개");
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}


























