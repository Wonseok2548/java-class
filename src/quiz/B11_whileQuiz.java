package quiz;

public class B11_whileQuiz {
	
	// while문을 이용한다.
	
	// 1. 1부터 100까지의 3의 배수의 총합을 구해보세요.
	
	// 2. 200부터 1까지 출력해보세요.
	
	/* 3. 1부터 200까지의 숫자 중
		  2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합을 구하시오. */
	
	
	
	public static void main(String[] args) {
		
		System.out.println("문제 1번 -----------------------");
		// Q1.
		int i = 1;
		int sum = 0;
		
		while (i <= 100) {
			if (i % 3 == 0) {	// 3의 배수인지 확인하기
				sum = sum+i;
			}
			i++;
		
		}
		System.out.println("답 : " + sum);
		
		System.out.println("문제 2번 -----------------------");
		
		
		// Q2.
		int j = 200;
		
		while (j >= 1) {			
			System.out.println(j);
			j--;
		}
		
		System.out.println("문제 3번 -----------------------");
		
		
		// Q3.
		
		int k = 1;
		int answer = 0;
		
		while (k <= 200) {
			if ((k % 2 != 0) && (k % 3 !=0)) {
				
				answer = answer + k;
			}
			k++;
		}
		System.out.println("답 : " + answer);
		
		
		
		
		
		
		
	}
}













