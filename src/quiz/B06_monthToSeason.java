package quiz;

import java.util.Scanner;

public class B06_monthToSeason {
	
	// ����ڷκ��� ���� �Է¹����� �ش��ϴ� ������ ���.
	// switch-case�� �̿��ϱ�.

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ����ΰ��� ? �Է����ּ��� : ");
		
		int month = sc.nextInt();
		
		switch (month) {
			case 1 :
				System.out.println("�Ѱܿ��Դϴ�.");
				break;
			case 2 :
				System.out.println("�ʰܿ��Դϴ�.");
				break;
			case 3 :
				System.out.println("�ʺ��Դϴ�.");
				break;
			case 4 :
				System.out.println("���Դϴ�.");
				break;
			case 5 :
				System.out.println("�ʺ��Դϴ�.");
				break;
			case 6 :
				System.out.println("�ʿ����Դϴ�.");
				break;
			case 7 :
				System.out.println("�ѿ����Դϴ�.");
				break;	
			case 8 :
				System.out.println("�ʿ����Դϴ�.");
				break;
			case 9 :
				System.out.println("�ʰ����Դϴ�.");
				break;
			case 10 :
				System.out.println("�Ѱ����Դϴ�.");
				break;
			case 11 :
				System.out.println("�ʰ����Դϴ�.");
				break;
			case 12 : 
				System.out.println("�ʰܿ��Դϴ�.");
				break;		
		}	
	}
}



























