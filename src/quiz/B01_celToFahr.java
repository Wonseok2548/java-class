package quiz;

import java.util.Scanner;

public class B01_celToFahr {
	public static void main(String[] args) {
		
		// ����ڷκ��� ���� �µ��� �Է¹�����
		// ȭ�� �µ��� ��ȯ�Ͽ� ������ִ� ���α׷��� ����ÿ�.
		// ����� �Ҽ� ù° �ڸ�����.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �µ��� �Է��ϼ��� : ");
		double celsius = sc.nextDouble();
		
		double Fahr = (celsius * 1.8) + 32;
		
		System.out.printf("ȭ���µ� : %.1f%s", Fahr, "f");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
