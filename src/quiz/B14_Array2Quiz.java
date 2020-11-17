package quiz;

import java.util.Arrays;

public class B14_Array2Quiz {
	
	public static void main(String[] args) {
		
		int[][] numArr = {
				{10,10,10,10},
				{90,50,30,70},
				{800,500},
				{300,300,300}
		};
		
		// 1. numArr의 총합과 평균(소수점 둘째자리)을 구해서 출력하라.
		
		// 2. numArr의 각 행의 합과 열의 합을 모두 구해서 출력하라.
		//		0행의 합 : 10+10+10+10
		//		0열의 합 : 10+90+800+300
		
		
		int sum = 0;
		double average = 0;
		int[] yeol_sum = new int[4];
		
		int j_count = 0;
		
		for (int i=0; i < numArr.length; i++) {
			
			for (int j=0; j < numArr[i].length; j++) {
				sum += numArr[i][j];
				j_count++;
			}
			
			average = sum/j_count;
		}
		System.out.println("Q1. 총합 : " + sum);
		System.out.printf("Q1. 평균 : %.2f\n", average);
		
		System.out.println("=========Q2.=========");
		
		
		
		int haeng_sum = 0;
		
		for (int i=0; i < numArr.length; i++) {
			
			for (int j=0; j < numArr[i].length; j++) {
				haeng_sum += numArr[i][j];
				yeol_sum[j] += numArr[i][j];

				
			}
			
			System.out.println(i + "행의 합 : " + haeng_sum);
			haeng_sum = 0;
			
			
			System.out.println("-------------------------------");
			

		}
		
		
		
		
		
		/*
		System.out.println("0열 합 : " +  (numArr[0][0] + numArr[1][0] + numArr[2][0] + numArr[3][0]));
		System.out.println("1열 합 : " +  (numArr[0][1] + numArr[1][1] + numArr[2][1] + numArr[3][1]));
		System.out.println("2열 합 : " +  (numArr[0][2] + numArr[1][2]));
		System.out.println("3열 합 : " +  (numArr[0][3] + numArr[1][3]));
		*/
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}











