package practice;

import java.util.Arrays;
import java.util.Scanner;

public class GCD_QCD {
	
	public static int[] solution(int n, int m) {
		int[] answer = new int[2];
		
		for (int i = n; i > 0; i--){
            if (n % i ==0 && m % i ==0){
                answer[0] = i;
                break;
            }
        }
        
        int a = n / answer[0];
        int b = m / answer[0];
        
        answer[1] = answer[0] * a * b;
        
        
        return answer;
		
		
		
	}
	
	public static void main(String[] args) {
		
	
		System.out.println(Arrays.toString(solution(15,78)));
		
		
	}

}
