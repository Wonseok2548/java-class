
public class B09_for {

	
	public static void main(String[] args) {
		
		// # 반복문
		//	- for, while, do-while(X), for each
		//	- 똑같은 코드를 여러번 반복하고 싶을 때 사용한다.
		
		/* # for (초기값; 조건; 증가값) {
				가운데 조건이 true인 동안 반복할 명령어들을 적는 곳
				}
		*/
		
		
		// 1. 가장 기본적인 형태
		//	- 원하는 횟수만큼 반복하는 방식
		//	- 초기값은 0을 주고, 조건에는 반복하고싶은 횟수를 적는다.
		//	- 증가는 1씩 한다.
		
		for (int i =0; i < 5000; i++) {
			System.out.println("hello world!" + i);
			}
		
		
		// 2. 초기값과 증가값의 수치는 마음대로 변경할 수 있다.
		for (int i = 10; i < 33; i += 2) {
			System.out.println("hello" + i);
		}
		
		for (int i = 9000; i > 0; i -= 100) {
			System.out.println("minus" + i);
		}
		
		
		// 3. 초지값과 증가값의 위치를 마음대로 변경할 수 있다.
		int num = 0;
		for (; num < 100;)
		{
			System.out.println("hi");
			++num;
		}
		
		
		// 4. 내부의 다른 문법도 자유롭게 사용할 수 있다.
		for (int month = 1; month <= 12; ++month) {
			switch (month) {
			case 1: case 2: case 12:
				System.out.printf("%d월은 겨울입니다.\n", month);
				break;
			default:
				System.out.printf("%d월은 아직 설정되지 않았습니다.\n", month);
				break;
			}
		}
		
		
		
		// 5. 조건을 비워놓으면 무한 반복한다. (조건에 true를 넣어도 무한반복한다.)
		num = 0;
		for (;;) {
			System.out.println(num += 9999);
			
			if (num > 200000)
				break;
		}
	
		
		// 6. continue를 이용하면 반복문을 스킵할 수 있다.
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				continue;
			
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		
		
		
		
		
		for (int i = 0; i < 100; i++) {
			System.out.printf("%-3d", i);
			
			if (i % 10 != 9)
				continue;
			
			System.out.println();
		}
		
		
		
		// 7. 반복문으로 총합 구하기.
		//	(1). 총합을 저장할 변수를 선언하고 0으로 초기화한다.
		//	(2). 반복문을 통해 해당 변수에 값을 누적시킨다.
		
		int sum = 0;
		
		for (int i = 80; i <= 333; i++) {
			if (i % 3 == 0)					// i가 3의 배수일 때
				sum += i;					// sum = sum + i를 반복한다.
		}									// 3, 3+6=9, 9+12=21, 21+15=37 ....				
		System.out.println(sum);

		
		
	
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}








































