package quiz;

import java.util.Scanner;

public class B04_scoreToGrade {
	
	public static void main(String[] args) {
		
		
		
		// ���� �Է¹޾� ��� ��� ���α׷�
		// 90�̻� a
		// 80�̻� b
		// 70�̻� c
		// 60�̻� d
		// �� ��  f
		
		// ������ 0~100������ ����.
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		double score = sc.nextDouble();
		char grade = ' ';
		
		
		if (score > 100 || score < 0)
			grade = '!';
		
		else if (score >= 60)
			grade = 'd';
		
		else if (score >= 70)
			grade = 'c';
		
		else if (score >= 80)
			grade = 'b';
		
		else if (score >= 90)
			grade = 'a';
		
		else
			grade = 'f';
		
		System.out.printf("����� ������ %c �Դϴ�.", grade);
		
		
		
		/* ������� �ϽŰ�.
		if (score < 0 || score >100) {
			System.out.println("������ �̻��ؼ� ���α׷��� �����մϴ�.");
			
			return; // main�� ������.
			System.exit(0);	// ���α׷��� �����Ѵ�.
		}
		
		char grade = 'F';
		
		if (score >= 90)
			grade = 'A';
				
		if (score >= 80)
			grade = 'B';
		
		if (score >= 70)
			grade = 'C';
		
		if (score >= 60)
			grade = 'D';
		
		System.out.println("����� ���� : %d\n��� : %c\n", score, grade);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


























