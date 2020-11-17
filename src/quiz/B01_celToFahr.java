package quiz;

import java.util.Scanner;

public class B01_celToFahr {
	public static void main(String[] args) {
		
		// 사용자로부터 섭씨 온도를 입력받으면
		// 화씨 온도로 변환하여 출력해주는 프로그램을 만드시오.
		// 출력은 소수 첫째 자리까지.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨 온도를 입력하세요 : ");
		double celsius = sc.nextDouble();
		
		double Fahr = (celsius * 1.8) + 32;
		
		System.out.printf("화씨온도 : %.1f%s", Fahr, "f");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
