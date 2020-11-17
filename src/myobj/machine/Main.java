package myobj.machine;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		// Main에서 인터페이스만 활용한 코드를 작성한다면
		// 사용한 클래스를 다른 클래스로 간단하게 교체할 수 있다.
		ElectricSource test_battery = new ElectricSource() {

			@Override
			public void consume(int power) {
				// TODO Auto-generated method stub
				System.out.printf("배터리에서 %d만큼의 전력을 소비했습니다.\n", power);
				
			}
			
		};
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("<< 사용하려는 전자기기 선택 >>\n> ");
			
			String selected = sc.nextLine();
			
			Electronics_answer e = null;
			if (selected.toLowerCase().equals("Cleaner")) {
				e = new Cleaner();
			}
			else {
				e = new Microwave("삼성 전자렌지", 70);
			}

		
			e.setConnect(test_battery);
			e.execute();
		}
		
		
	}

}





















