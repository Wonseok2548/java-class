package quiz;

import java.util.Scanner;

public class B02_conditionQuiz01 {

	/*
		[ 알맞은 비교연산을 만들어보세요 ]
		    
		1. int형 변수 a가 10보다 크고 20보다 작을 때 true
		2. int형 변수 b가 짝수일 때 true		
		3. int형 변수 c가 7의 배수일 때 true
		4. int형 변수 hour가 0이상 24미만이 아니고 12이상일 때 true
		5. int형 변수 d와 e의 차이가 30일 때 true		
		6. int형 변수 year가 400으로 나누어 떨어지거나 
		   또는 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true
		7. 민수가 철수보다 2살 많으면 true
		8. 민수가 철수보다 생일이 3달 빠르면 true  
 		9. boolean형 변수 powerOn이 false일 때 true
		10. 문자열 참조변수 str이 "yes"일 때 true
		11. 삼각형 A가 직각삼각형이면 true
	*/
	public static void main(String[] args) {
		
		// Scanner sc = new Scanner(System.in);
		
		// System.out.print("int형 변수 a를 입력하세요 : ");
		// 1번
		int a = 15;
		System.out.println("1번 : " + (a>10 && a<20));		// 가능하면 변수가 왼쪽에 오는것이 좋다.
		
		
		
		
		
		// 2번
		// System.out.print("int형 변수 b를 입력하세요 : ");
		int b = 20;
		System.out.println("2번 : " + (b % 2 == 0));
		
		
		
		
		// 3번
		// System.out.print("int형 변수 c를 입력하세요 : ");
		int c = 49;
		System.out.println("3번 : " + (c % 7 == 0));
		
		
		
		
		// 4번
		//System.out.print("int형 변수 hour를 입력하세요 : ");
		int hour = 16;
		System.out.println("4번 : " + (!(hour < 0 || hour >= 24) && hour >= 12));
		//System.out.println("4번 : " + (!(hour<0) && !(hour>=24) && hour>=12));		// 내가한것.
		
		
		
		
		// 5번
		//System.out.print("int형 변수 d를 입력하세요 : ");
		//System.out.print("int형 변수 e를 입력하세요 : ");
		int d = 60;
		int e = 30;
		System.out.println("5번 : " + (Math.abs(d-e) >= 30));
		// System.out.println("5번 : " + (d-e>=30 || e-d>=30));		// 내가한것.
		
		
		
		// 6번
		//System.out.print("int형 변수 year를 입력하세요 : ");
		int year = 2020;
		System.out.println("6번 : " + ((year % 400 == 0) || (year % 4 == 0) && year % 100 != 0));
		
		
		
		// 7번
		//System.out.print("민수의 나이를 입력하세요 : ");
		//System.out.print("철수의 나이를 입력하세요 : ");
		int minsu_age = 18;
		int cheol_age = 16;
		System.out.println("7번 : " + (minsu_age == cheol_age + 2));
		
		
		
		// 8번
		// System.out.print("민수의 생일을 입력하세요 : ");
		//System.out.print("철수의 생일을 입력하세요 : ");
		int minsu_month = 12;
		int cheol_month = 9;
		System.out.println("8번 : " + (minsu_month == cheol_month - 3));
		
		
		
		
		
		// 9번
		// System.out.print("true/false 둘 중 하나를 입력해 주세요 : ");
		boolean powerOn = false;
		System.out.println("9번 : " + (!powerOn));
		// System.out.println("9번 : " + (powerOn == false));			// 내가한것
		
		
		
		// 10번
		//System.out.print("yes/no 둘중 하나를 입력해 주세요 : ");
		String str = "yes";
		System.out.println("10번 : " + 	str.equals("yes")); // 값을 통한 비교
		
		// 소문자로 시작하는 타입 - 값을 저장한다.
		// 대문자로 시작하는 타입 - 주소를 저장한다. (참조형) >>> A03_varTypes.java에 서술되어 있음.
		
		String str2 = "yes"; 
		String str3 = "yes";
		System.out.println(str == str2); // 주소를 통한 비교1
		System.out.println(str == str3); // 주소를 통한 비교2
		
		
		
		// 11번
		//System.out.println("직각 삼각형 A의 가장 긴변 a1의 길이를 입력하세요 : ");
		//System.out.println("직각 삼각형 A의 한 변 a2의 길이를 입력하세요 : ");
		//System.out.println("직각 삼각형 A의 한 변 a3의 길이를 입력하세요 : ");
		
		// # 변으로 푸는 방법
		double a1 = 8;
		double a2 = 15;
		double a3 = 17;
		
		double A1 = Math.pow(a1, 2);
		double A2 = Math.pow(a2, 2);
		double A3 = Math.pow(a3, 2);
		
		System.out.println("11번 : " + (A1 == A2 + A3 || A2 == A1 + A3 || A3 == A1 + A2)); 
		
		// # 각으로 푸는 방법
		int b1 = 50, b2 = 40, b3 = 90;
		System.out.println(b1 + b2 + b3 == 180 && (b1 == 90 || b2 == 90 || b3 == 90)
				&& (b1 != 0 && b2 != 0 && b3 !=0));
		
		
		
		
		
		
		
		
		
	}
}








































