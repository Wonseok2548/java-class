

package quiz;

import java.util.Scanner;

public class B01_GuessAge {
	
	
	// ����ڷκ��� ������ �⵵�� �¾ �⵵�� �Է¹�����
	// �ѱ� ���̸� ����Ͽ� �� ������ �˷��ִ� ���α׷��� ��������.
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ������ �Է��ϼ��� : ");
		int year = sc.nextInt();
		
		System.out.print("�¾ ������ �Է��ϼ��� : ");
		int birth = sc.nextInt();
		
		int KoreanAge = (year - birth) + 1;
		
		System.out.println("���� ����� �ѱ� ���̴� " + KoreanAge + "�� �Դϴ�.");
		
		
		
		
		
		
		
		
	}
}
































