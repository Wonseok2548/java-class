package quiz;

import java.util.Scanner;

public class B13_31game {
	
	// # 31게임을 만들어보세요.
	
	// 1. 컴퓨터와 사람이 번갈아가면서 숫자를 선택한다 (1, 2, 3)
	// 2. 컴퓨터는 랜덤으로 숫자를 선택한다.
	// 3. 마지막에 31 이상의 숫자를 만드는 사람 혹은 컴퓨터가 패배한다.
	
	// 진행 예 : 
	// 컴퓨터 > 2
	//		현재 숫자 : 2
	// 사람 > 3
	//		현재 숫자 : 5
	// ...
	// 컴퓨터 > 3
	//		현재 숫자 : 32
	//		컴퓨터의 패배입니다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ran_number = (int)(Math.random()*2 + 1);
		boolean status = true;
		
		System.out.println("랜덤으로 순서를 정합니다.");
		System.out.println("1 : 컴퓨터 먼저");
		System.out.println("2 : 사용자 먼저");
		
		System.out.println("나온 숫자 : " + ran_number);		// 1은 컴퓨터 먼저, 2는 사람먼저
		System.out.println("----------------<Game Start>----------------");

		


		
		int amount = 0;
		
		if (ran_number == 1) {
			System.out.println("컴퓨터 먼저 뽑습니다.");
	
		
			for (int i=0; i<31; i++){
				int computer_number = (int)(Math.random()*3 + 1);
				
				System.out.println("컴퓨터가 뽑은 수 : " + computer_number);
				amount = amount + computer_number;
				System.out.println("현재 상태 : " + amount);
				System.out.println("------------------------------");
				if (amount >= 31) {
					System.out.println("컴퓨터의 패배입니다.");
					break;
					}
				
				
				System.out.print("사용자 숫자 입력 : ");
				int num = sc.nextInt();
				
		
				while (true) {
					if (num < 1 || num > 3) {
						System.out.print("1,2,3 중에서 선택해 주세요 : ");
						int new_num =sc.nextInt();
						num = new_num;
					}
					else {
						status = false;
						break;
					}
				}
				
				amount = amount + num;
				System.out.println("현재 상태 : " + amount);
				System.out.println("------------------------------");
				if (amount >= 31) {
					System.out.println("사용자의 패배입니다.");
					break;
					}
				
			
			}
		
		
		}
		
		if (ran_number == 2) {
			System.out.println("사람 먼저 뽑습니다.");
			
			
			for (int i=0; i<31; i++){
				
				System.out.print("사용자 숫자 입력 : ");
				int num = sc.nextInt();
				
				while(true) {
					if (num < 1 || num > 3) {
						System.out.print("1,2,3 중에서 선택해 주세요 : ");
						int new_num =sc.nextInt();
						num = new_num;	
					}
					else {
						status = true;
						break;
					}
				}
				
				amount = amount + num;
				
				System.out.println("현재 상태 : " + amount);
				System.out.println("------------------------------");
				if (amount >= 31) {
					System.out.println("사용자의 패배입니다.");
					break;
					}
				
				int computer_number = (int)(Math.random()*3 + 1);
				System.out.println("컴퓨터가 뽑은 수 : " + computer_number);
				amount = amount + computer_number;
				System.out.println("현재 상태 : " + amount);
				System.out.println("------------------------------");
				if (amount >= 31) {
					System.out.println("컴퓨터의 패배입니다.");
					break;
					}
				
				
				
				
			
			}
		
		
		}
		
		
		
	}	
	
}














