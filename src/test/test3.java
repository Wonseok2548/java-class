package test;
import java.util.Random;
import java.util.Scanner;

public class test3 {

//	컴퓨터가 0부터 1000 사이의 정답을 생성하면
//	사용자가 숫자를 입력하여 정답을 맞추는 게임을 만들어보세요
//
//	사용자가 숫자를 입력했을 때 상황별로 알맞은 정보를 출력해야 합니다
//	사용자가 선택한 숫자가 정답보다 낮은 숫자인 경우 - UP!
//	사용자가 선택한 숫자가 정답보다 높은 숫자인 경우 - DOWN!
//	사용자가 정답을 맞춘경우 - 정답!
//
//	게임 종료시 정답이었던 숫자와 여태까지의 총 시도횟수를 출력해야 합니다.
//	사용자 > 5
//	UP!
//	사용자 > 577
//	DOWN!
//	사용자 > 400
//	...
	
	
//	+@
//	UP을 출력받았을 때는 무조건 이전에 입력한 숫자보다 작은 숫자를 입력해야 한다.
//	범위 밖의 숫자를 입력받으면 에러 메세지를 출력해야 한다.
	
	
	public static void main(String[] args) {
		
		
		int answer = (int)(Math.random()*1000);
		System.out.println(answer);
		
		int count=1;
		
		while(true) {
			System.out.print("사용자 숫자 입력 : ");
			int user = new Scanner(System.in).nextInt();
			
			if (user < answer) {
				System.out.println("UP!");
				count += 1;
			}
			
			if (user > answer) {
				System.out.println("DOWN!");
				count += 1;
			}
			
			if (user == answer) {
				System.out.println("정답!");
				System.out.println("시도 횟수 : " + count);
				break;
			}
			
	
			
		}
		
		
		
	}
	
}
