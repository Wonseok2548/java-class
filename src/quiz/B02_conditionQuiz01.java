package quiz;

import java.util.Scanner;

public class B02_conditionQuiz01 {

	/*
		[ �˸��� �񱳿����� �������� ]
		    
		1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
		2. int�� ���� b�� ¦���� �� true		
		3. int�� ���� c�� 7�� ����� �� true
		4. int�� ���� hour�� 0�̻� 24�̸��� �ƴϰ� 12�̻��� �� true
		5. int�� ���� d�� e�� ���̰� 30�� �� true		
		6. int�� ���� year�� 400���� ������ �������ų� 
		   �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true
		7. �μ��� ö������ 2�� ������ true
		8. �μ��� ö������ ������ 3�� ������ true  
 		9. boolean�� ���� powerOn�� false�� �� true
		10. ���ڿ� �������� str�� "yes"�� �� true
		11. �ﰢ�� A�� �����ﰢ���̸� true
	*/
	public static void main(String[] args) {
		
		// Scanner sc = new Scanner(System.in);
		
		// System.out.print("int�� ���� a�� �Է��ϼ��� : ");
		// 1��
		int a = 15;
		System.out.println("1�� : " + (a>10 && a<20));		// �����ϸ� ������ ���ʿ� ���°��� ����.
		
		
		
		
		
		// 2��
		// System.out.print("int�� ���� b�� �Է��ϼ��� : ");
		int b = 20;
		System.out.println("2�� : " + (b % 2 == 0));
		
		
		
		
		// 3��
		// System.out.print("int�� ���� c�� �Է��ϼ��� : ");
		int c = 49;
		System.out.println("3�� : " + (c % 7 == 0));
		
		
		
		
		// 4��
		//System.out.print("int�� ���� hour�� �Է��ϼ��� : ");
		int hour = 16;
		System.out.println("4�� : " + (!(hour < 0 || hour >= 24) && hour >= 12));
		//System.out.println("4�� : " + (!(hour<0) && !(hour>=24) && hour>=12));		// �����Ѱ�.
		
		
		
		
		// 5��
		//System.out.print("int�� ���� d�� �Է��ϼ��� : ");
		//System.out.print("int�� ���� e�� �Է��ϼ��� : ");
		int d = 60;
		int e = 30;
		System.out.println("5�� : " + (Math.abs(d-e) >= 30));
		// System.out.println("5�� : " + (d-e>=30 || e-d>=30));		// �����Ѱ�.
		
		
		
		// 6��
		//System.out.print("int�� ���� year�� �Է��ϼ��� : ");
		int year = 2020;
		System.out.println("6�� : " + ((year % 400 == 0) || (year % 4 == 0) && year % 100 != 0));
		
		
		
		// 7��
		//System.out.print("�μ��� ���̸� �Է��ϼ��� : ");
		//System.out.print("ö���� ���̸� �Է��ϼ��� : ");
		int minsu_age = 18;
		int cheol_age = 16;
		System.out.println("7�� : " + (minsu_age == cheol_age + 2));
		
		
		
		// 8��
		// System.out.print("�μ��� ������ �Է��ϼ��� : ");
		//System.out.print("ö���� ������ �Է��ϼ��� : ");
		int minsu_month = 12;
		int cheol_month = 9;
		System.out.println("8�� : " + (minsu_month == cheol_month - 3));
		
		
		
		
		
		// 9��
		// System.out.print("true/false �� �� �ϳ��� �Է��� �ּ��� : ");
		boolean powerOn = false;
		System.out.println("9�� : " + (!powerOn));
		// System.out.println("9�� : " + (powerOn == false));			// �����Ѱ�
		
		
		
		// 10��
		//System.out.print("yes/no ���� �ϳ��� �Է��� �ּ��� : ");
		String str = "yes";
		System.out.println("10�� : " + 	str.equals("yes")); // ���� ���� ��
		
		// �ҹ��ڷ� �����ϴ� Ÿ�� - ���� �����Ѵ�.
		// �빮�ڷ� �����ϴ� Ÿ�� - �ּҸ� �����Ѵ�. (������) >>> A03_varTypes.java�� �����Ǿ� ����.
		
		String str2 = "yes"; 
		String str3 = "yes";
		System.out.println(str == str2); // �ּҸ� ���� ��1
		System.out.println(str == str3); // �ּҸ� ���� ��2
		
		
		
		// 11��
		//System.out.println("���� �ﰢ�� A�� ���� �亯 a1�� ���̸� �Է��ϼ��� : ");
		//System.out.println("���� �ﰢ�� A�� �� �� a2�� ���̸� �Է��ϼ��� : ");
		//System.out.println("���� �ﰢ�� A�� �� �� a3�� ���̸� �Է��ϼ��� : ");
		
		// # ������ Ǫ�� ���
		double a1 = 8;
		double a2 = 15;
		double a3 = 17;
		
		double A1 = Math.pow(a1, 2);
		double A2 = Math.pow(a2, 2);
		double A3 = Math.pow(a3, 2);
		
		System.out.println("11�� : " + (A1 == A2 + A3 || A2 == A1 + A3 || A3 == A1 + A2)); 
		
		// # ������ Ǫ�� ���
		int b1 = 50, b2 = 40, b3 = 90;
		System.out.println(b1 + b2 + b3 == 180 && (b1 == 90 || b2 == 90 || b3 == 90)
				&& (b1 != 0 && b2 != 0 && b3 !=0));
		
		
		
		
		
		
		
		
		
	}
}








































