package quiz;

import java.util.Scanner;

public class B09_forQuizBasic {
	
	// ����ڰ� ���ڸ� �Է����� ��
	// 1. 10���� �Է��� ���ڱ����� �� ���� ���Ͻÿ�.
	// 2. 1���� �Է��� ���� ������ 3�� ����� ��� ����ϰ�, ������� ����Ͻÿ�.

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է� : ");
		
		int number = sc.nextInt();
		int total = 0;
		
		if (number < 10 && number >= 0) {
			for (int i = number; i <= 10; i++) {
				total += i;
			}
		} else if (number < 0) {
			for (int i = number; i <=10; i++) {
				total += i;
			}
		} else {
			for (int i = 10; i <= number; i++) {
				total += i;
			}
		}
		
			
		
		System.out.println(total);
		
		
		
		
		
		
		
		
		
		
		
		
		/*  ����� �ڵ� ********************/
		/*
		 
		// Q1.
		System.out.print("�����Է� > ");
		int user = new Scanner(System.in).nextInt();
		// start = 10
		// end = -1
		int start = 10;
		int end = user;
		
		int sum = 0;
		
		if (start > end) {
			int temp = start;
			start = end;
			end = temp;
		}
		
		for (int i = start; i <= end; ++i) {
			sum += i;
		}
		
		System.out.println(sum);
		
		// Q2.
		
		int start2 = 1;
		int end2 = user;
		
		if (start2 > end2) {
			int temp = start2;
			start2 = end2;
			end2 = temp;
		
		}
		
		int count = 0;
		System.out.print("[");
		for (int i = start2; i <= end2; ++i) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
				count += 1;
			}
		}
		
		System.out.print("]\n");
		System.out.println("Q1. 10������ ���� - " + sum);
		System.out.println("Q2. 3�� ����� ���� - " + count + "��");
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}


























