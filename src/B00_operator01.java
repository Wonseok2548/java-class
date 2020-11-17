
public class B00_operator01 {
	
	public static void main(String[] args) {
		
		// 연산자 (operator)
		//	- 계산할 때 사용하는 것
		
		// # 산술 연산자
		int a = 10, b = 3;
		double c = 7.0;
		
		System.out.printf("a : %d, b : %d 일 때\n", a, b);
		
		// ※ 연산의 우선순위는 사칙연산의 우선순위를 따른다.
		System.out.println("+ : " + (a + b));
		System.out.println("- : " + (a - b));
		System.out.println("x : " + a * b);
		
		// ※ 정수끼리 나누면 몫만 나온다.
		System.out.println(a / b); 
		// ※ 정수와 실수를 나누면 정확한 계산을 한다.
		System.out.println(a / c);
		System.out.println(a / (double)b); // 정수형이였던 b를 실수형으로 재선언
		System.out.println(a % b); // 나머지 
		
		// 제곱 (결과 double타입)
		System.out.println(Math.pow(a, b)); 
		// 제곱근
		System.out.println(Math.sqrt(2));
		// 절대값
		System.out.println(Math.abs(-20));
		// 반올림
		System.out.println(Math.round(1.234));
		// 올림
		System.out.println(Math.ceil(1.001));
		// 내림
		System.out.println(Math.floor(1.999));
		// 더 큰 숫자 
		System.out.println(Math.max(a, b)); 
		// 더 작은 숫자 
		System.out.println(Math.min(a, b));
		
		
		
		System.out.println(a ^ b); // 제곱이 아니다. (XOR연산)
		
		// 10 : 1010
		// 7  : 0111
		// 	  --------
		//	    1101 >> 13
		
		
		
		
		
	}
	

}




















































