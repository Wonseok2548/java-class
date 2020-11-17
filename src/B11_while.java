import java.util.Scanner;

public class B11_while {

	
	public static void main(String[] args) {
		
		// # while
		// - for���� ������ �ణ �ٸ� �ݺ���
		// - �ʱⰪ�� �������� ��ġ�� ���������� �ʾ�.
		// - �������� ��ġ�� ���� �ݺ��� ����� �޶��� �� �ִ�.
		// - ()���� ������ ���ε��� {}���� ������ �ݺ��Ѵ�.
		
		
		// # while���� ���� �⺻���� ����
		int i = 0;
		while (i < 10) {
			i++;
			System.out.println("hello, world! " + i);
		}
		
		
		int j = 0;
		for (; j < 10;) {
			System.out.println("hello world! " + j);
			j++;
		}
		

		// # while���� ����ϰԲ� ����� Ŭ������
		//	- has, next���� ���ľ ���� �Լ�(�޼���)�� �������ִ�.
		//	- ex : Scanner
		
		//	System.in : �ܼ��� ���� �Է��� �ϴ� ��� (inputStream)
		
		//	�� System.in ��� ���ڿ��� ���� ��ĳ�ʿ� �Է�
		Scanner sc1 = new Scanner("apple banana orange");
		Scanner sc2 = new Scanner("dog cat rat bird");
		
		while (sc1.hasNext()) {
			System.out.println(sc1.next());
		}
		
		while (sc2.hasNext()) {
			System.out.println(sc2.next());
		}
		
		// # while���� �̿��� ���ѷ����� ���α׷� �����ϱ�
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. ����ϱ�");
			System.out.println("2. �����ϱ�");
			int cmd = sc.nextInt();
			
			switch (cmd) {
			case 1: 
				System.out.println("����մϴ�.");
				break;
			case 2: 
				System.out.println("�����մϴ�.");
				break;
			default: 
				System.out.println("�ùٸ� ������ �ƴմϴ�.");
				break;
			}
		}
		
		
		
		
		
		
		
		
	}
}































