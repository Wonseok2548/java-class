package quiz;

// Ctrl + Shift + O : �ڵ� import
import java.util.Scanner;


public class B04_appleQuiz {
	
	public static void main(String[] args) {
		
		// ����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�.
		// ����ڰ� ����� ������ �Է��ϸ� ����� ��� ������� �ʿ��� �ٱ����� ������ ����غ�����.
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("����� ������ �Է��ϼ��� : ");
		int amount = sc.nextInt();
		
		
		int a = amount % 10;		// ������ 10���� ���� ������
		int b = amount / 10;		// ������ 10���� ���� ��
		int c = b + 1;				// ������ 10�� ����� �ƴ� �� �ʿ��� �ٱ��� ����
		
		int basket = 0;		 		// �ٱ��� ����
		
		if (amount > 10)
			if (amount % 10 == 0)
				basket = a;
				//System.out.println("�ʿ��� �ٱ��� ������ " + a + "�� �Դϴ�.");
			else
				basket = c;
				//System.out.println("�ʿ��� �ٱ��� ������ " + c + "�� �Դϴ�.");		
		
		else if  (amount > 0)
			basket = 1;
			//System.out.println("�ʿ��� �ٱ��� ������ 1�� �Դϴ�.");
		
		
		else
			System.out.println("����� �����ϴ�.");
		
		System.out.printf("�ʿ��� �ٱ��ϴ� %d�� �Դϴ�\n", basket);
		
		
		
		/* ����� Ǯ�� 
		 final int BASKET_SIZE = 10;	//���� �տ� final : ������ �Ұ����� ������ �ȴ�.
		
		
		System.out.println("��� > ");
		int appleCount = new Scanner(System.in).nextInt();
		
		if (appleCount < 0)
			System.out.println("0 �̻��� ���ڸ� �Է��ϼ���");
		else {
			int needBasket = (int)Math.ceil(appleCount / BASKET_SIZE);
			System.out.printf("�ʿ��� �ٱ��ϴ� %d�� �Դϴ�.\n", needBasket);
		}
		
		
		System.out.println("���α׷��� �����մϴ�.");
		*/
		
		
		
		
		
		
		
		
		
		
		
		
	}

}









































