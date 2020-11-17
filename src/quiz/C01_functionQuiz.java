package quiz;

public class C01_functionQuiz {
	
	// # 다음 함수를 정의해보세요
	// 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	// 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	// 3. 숫자를 한 개 전달하면 문자열 "짝수입니다." 또는 "홀수입니다."를 반환하는 함수
	// 4. 전달한 숫자가 소수인지 아닌지 판별해주는 함수 (boolean)
	// 5. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	//	  factorial : (n)*(n-1)*(n-2) ... 3*2*1
	// 6. 숫자 두개(a, b)를 전달하면 a의 b제곱을 반환하는 함수
	//	  (0제곱은 1을 반환해야함, Math.pow 금지)
	
	
	// Q1.
	public static boolean is_Alphabet(String alpha) {
		
		alpha = alpha.toUpperCase();
		boolean status = false;
		
		for (int i=0; i < alpha.length(); i++) {
			
			if (alpha.charAt(i) >= 'A' && alpha.charAt(i) <= 'Z') {
				status = true;
			}
			
		}
		
		return status;
		
		// return (alpha.charAt(i) >= 'A' && alpha.charAt(i) <= 'Z');   이거 한줄로 가능
		
		
	}
	
	// Q2.
	public static boolean is_3s(int number) {
		
		boolean status = false;
		
		if (number % 3 == 0) {
			status = true;
		}
		
		return status;
		
		// return number % 3 ==0;	이거 한줄로 가능
	}
	
	
	// Q3.
	public static String even_or_Odd(int number) {
		
		String answer = "홀수입니다.";
		
		if (number % 2 == 0) {
			return "짝수입니다.";
		}
		
		return answer;
		// return number % 2 ==0 ? "짝수입니다" : "홀수입니다";		이거 한줄로 가능
	}
	
	
	// Q4.
	public static boolean is_Prime(int number) {
		
//		boolean status = false;
//		int count = 0;
		
		if (number == 1) {
			return false;			// 숫자 1은 소수가 아니기 때문에 number가 1이라면 그자리에서 false를 return하고 함수 종료.	
		}
		
		for (int i=2; i < number; i++) {
			if (number % i == 0) {	// 인수가 발생하면
				// count++;			// 발생할 때 마다 count를 1씩 더하라
				return false;		// return을 하면 함수가 끝난다.
			}
			
		}
		
//		if (count == 0) {		// count가 0이라는 말은 인수가 없다는 뜻이다. 즉, 소수
//			status = true;		// number가 소수이면 status에 true를 넣어라.
//		}
//		
//		if (count > 0) {
//			status = false;
//		}
		
		return true;
		
	}
	
	// Q5. 
	public static int factorial(int number) {
		
		int answer = 1;
		
		for (int i=0; i < number; i++) {
			
			answer *= (number-i);
		}
		
		// 강사님 코드
//		for (int i=number; i>0; i--) {
//			answer *= 1;
//		}
		
		return answer;
	}
	
	
	// 재귀 함수 : 자기 자신을 부르는 함수 (성능 안좋음, 읽기 힘듦, 머리아픔)
	public static int recursive_factorial(int num) {
		if (num == 1) {
			return 1;
		}
		
		return num * recursive_factorial(num -1);
	}
	
	
	// Q6.
	public static int square(int main_number, int sub_number) {
		
		int answer = 1;
		
		if (sub_number == 0) {
			return 1;			// return을 하면 함수가 종료된다.
		}
		
		else {
			for(int i=1; i <= sub_number; i++) {				
				answer *= main_number; 
						
			}
		}
		return answer;
		
	}
	
	// Q6을 재귀함수로 만들기.
	public static int recursive_suqare(int first, int second) {
		
		
		if (second != 0) {
			return first * recursive_suqare(first, second-1);
		}
		
		else
			return 1;
		


		
	}
		
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("1번===================");
		String str = "12345";
		String str2 = "hello";
		System.out.println(is_Alphabet(str));
		System.out.println(is_Alphabet(str2));
	
		
		System.out.println("2번===================");
		int number = 363;
		System.out.println(is_3s(number));
		
		System.out.println("3번===================");
		int number2 = 126;
		int number2_1 = 127;
		System.out.println(even_or_Odd(number2));
		System.out.println(even_or_Odd(number2_1));
		
		System.out.println("4번===================");
		int number3 = 11;
		int number4 = 18;
		System.out.println(is_Prime(number3));
		System.out.println(is_Prime(number4));
		
		System.out.println("5번===================");
		int number5 = 5;
		int number6 = 7;
		System.out.println(factorial(number5));
		System.out.println(factorial(number6));
		
		System.out.println("6번===================");
		System.out.println(square(5, 3));
		System.out.println(square(10, 2));
		
		System.out.println("번외===================");
		System.out.println(recursive_suqare(6,3));
		
	
		
	}

}





















