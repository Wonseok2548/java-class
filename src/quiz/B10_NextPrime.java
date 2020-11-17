package quiz;

import java.util.Scanner;

public class B10_NextPrime {
	
	// 사용자로부터 숫자를 입력받으면
	// 입력받은 수보다 더 크거나 같은 다음 소수를 찾아서 출력.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		
		int number = sc.nextInt();
		
		
		// i : 소수인지 테스트해볼 숫자
		for (int i = number, num2 = number * number; i <= num2; i++) {
			int count = 0;
			
			// j : i의 약수인지 테스트해볼 숫자
			// int sqrt = (int)Math.sqrt(num2); // 제곱근
			
			for (int j = 2; j < i; j++) {		// j <= i 가 안되는 이유 : 등호(=)를 넣으면 자기 자신까지 포함해서 나누는 작업을 반복하기 때문
				if (i % j ==0) {				//					   무조건 count가 1이 이상이 된다. 
					count++;
					
				}
			}
			if (count == 0) {
				System.out.printf("다음 소수는 %d입니다.\n", i);
				break;
			}
		}
		
		
		// 강사님 코드
		int user =123;
		for (int i = user; true; i++) {
			int count = 0;
			int sqrt = (int)Math.sqrt(i);
			for (int j = 2; j < sqrt; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.printf("다음소수 : %d \n", i);
				break;
			}
		}
		
		
		
		
		
		
		
		
	}

}


















