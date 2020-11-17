package quiz;
import java.util.Scanner;

public class B01_wonToDollar {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("한국 돈을 입력하세요 : ");
		double won = sc.nextDouble();
		
		double DOLLAR = 1138.60; 			// 현재 달러 환율
		
		double rate =  1/DOLLAR;
		
		double FEE = 0.9825; 				// 환전 수수료 1.75%
		
		double ExchangeResult = (won * rate * FEE);
		
		System.out.printf("수수료 제외한 총 달러 : %c%.2f", '$', ExchangeResult);		
		
	}
}
