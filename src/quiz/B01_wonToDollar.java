package quiz;
import java.util.Scanner;

public class B01_wonToDollar {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("�ѱ� ���� �Է��ϼ��� : ");
		double won = sc.nextDouble();
		
		double DOLLAR = 1138.60; 			// ���� �޷� ȯ��
		
		double rate =  1/DOLLAR;
		
		double FEE = 0.9825; 				// ȯ�� ������ 1.75%
		
		double ExchangeResult = (won * rate * FEE);
		
		System.out.printf("������ ������ �� �޷� : %c%.2f", '$', ExchangeResult);		
		
	}
}
