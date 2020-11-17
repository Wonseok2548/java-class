package test;
import java.util.Scanner;

public class test {
	
//	사용자가 시간과 분을 순서대로 입력한다.
//	9시 10분 이전이라면 "정상"을, 9시 10분 이후라면 "지각"을, 오후 3시 이후라면 "결석"을 출력한다.
//	정상적이지 않은 시간 또는 분이 입력된다면 "에러"를 출력한다.
//	(단, 시간은 24시간제로 입력받는다)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시간 입력 : ");
		int time = sc.nextInt();
		
		System.out.print("분 입력 : ");
		int minute = sc.nextInt();
		
		System.out.printf("당신의 시간 : %d시 %d분\n", time, minute);
		
		
		
		
		
		while (time < 10) {
			
			if (time > 24 || time < 0 ||  minute < 0 || minute > 60) {
				System.err.println("오류입니다.");
				break;
			}
			
			if (time == 9 && minute <= 10){
				System.out.println("정상");
				break;
			}
			else if (time < 9 && time >= 0) {
				System.out.println("정상");
				break;
			}
			else if (time == 9 && minute > 10) {
				System.out.println("지각");
				break;
			}
			
		}		
		
		while (time >= 10) {
			
			if (time > 24 || time < 0 ||  minute < 0 || minute > 60) {
				System.err.println("오류입니다.");
				break;
			}
			
			if (time >= 10 && time < 15) {
				System.out.println("지각");
				break;
			}
			
			else if (time >= 15) { 
				System.out.println("결석");
				break;
			}
		
		}
		
    }   
	
	
}
