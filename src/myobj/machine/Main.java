package myobj.machine;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		// Main���� �������̽��� Ȱ���� �ڵ带 �ۼ��Ѵٸ�
		// ����� Ŭ������ �ٸ� Ŭ������ �����ϰ� ��ü�� �� �ִ�.
		ElectricSource test_battery = new ElectricSource() {

			@Override
			public void consume(int power) {
				// TODO Auto-generated method stub
				System.out.printf("���͸����� %d��ŭ�� ������ �Һ��߽��ϴ�.\n", power);
				
			}
			
		};
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("<< ����Ϸ��� ���ڱ�� ���� >>\n> ");
			
			String selected = sc.nextLine();
			
			Electronics_answer e = null;
			if (selected.toLowerCase().equals("Cleaner")) {
				e = new Cleaner();
			}
			else {
				e = new Microwave("�Ｚ ���ڷ���", 70);
			}

		
			e.setConnect(test_battery);
			e.execute();
		}
		
		
	}

}





















