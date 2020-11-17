package quiz;

import java.util.Scanner;

public class B04_scoreToGrade {
	
	public static void main(String[] args) {
		
		
		
		// 점수 입력받아 등급 출력 프로그램
		// 90이상 a
		// 80이상 b
		// 70이상 c
		// 60이상 d
		// 그 외  f
		
		// 점수는 0~100점까지 있음.
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
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
		
		System.out.printf("당신의 성적은 %c 입니다.", grade);
		
		
		
		/* 강사님이 하신것.
		if (score < 0 || score >100) {
			System.out.println("점수가 이상해서 프로그램을 종료합니다.");
			
			return; // main을 끝낸다.
			System.exit(0);	// 프로그램을 종료한다.
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
		
		System.out.println("당신의 점수 : %d\n등급 : %c\n", score, grade);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


























