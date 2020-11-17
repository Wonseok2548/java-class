package quiz;

import java.util.Scanner;

public class B10_GCD {
	
	// 두 숫자를 입력받고 두 숫자의 최대공약수를 구해보세요.
	// ※ 최대공약수 : 두 숫자의 공약수 중 가장 큰 공약수.
	
	
	public static void main(String[] args) {
		
		
		System.out.print("작은 수 입력 : ");
		int num1 = new Scanner(System.in).nextInt(); 
		System.out.print("큰 수 입력 : ");
		int num2 = new Scanner(System.in).nextInt();

		int gcd = 0;
		
		
		
		
		for (int k = 1; k <= num2; k++) {					// k를 16번 반복함
															
				if ((num1 % k == 0) && (num2 % k ==0)) {						
					gcd = k;								// 
					//System.out.print(count1 + " ");
				}
				
				
		}
		System.out.printf("최대공약수는 %d입니다.", gcd);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("=====강사님 코드=====");
		System.out.println();
		System.out.println();
		System.out.println();
				
		
		// 강사님 코드
		System.out.print("첫번째 숫자 입력 : ");
		int num_1 = new Scanner(System.in).nextInt(); 
		System.out.print("첫번째 숫자 입력 : ");
		int num_2 = new Scanner(System.in).nextInt();
		
		// num1이 더 크면 값을 바꾼다.
		
		if (num_1 > num_2) {
			int temp = num_1;
			num_1 = num_2;
			num_2 = temp;
		}
		
		int GCD = 1;
		for (int i = num_1; i >0; i--) {
			
			if (num_1 % i ==0 && num_2 % i == 0) {
				GCD = i;
				break;
			}
			
		}
		System.out.printf("최대공약수는 %d입니다.", GCD);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}






















