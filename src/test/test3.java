package test;
import java.util.Random;
import java.util.Scanner;

public class test3 {

//	��ǻ�Ͱ� 0���� 1000 ������ ������ �����ϸ�
//	����ڰ� ���ڸ� �Է��Ͽ� ������ ���ߴ� ������ ��������
//
//	����ڰ� ���ڸ� �Է����� �� ��Ȳ���� �˸��� ������ ����ؾ� �մϴ�
//	����ڰ� ������ ���ڰ� ���亸�� ���� ������ ��� - UP!
//	����ڰ� ������ ���ڰ� ���亸�� ���� ������ ��� - DOWN!
//	����ڰ� ������ ������ - ����!
//
//	���� ����� �����̾��� ���ڿ� ���±����� �� �õ�Ƚ���� ����ؾ� �մϴ�.
//	����� > 5
//	UP!
//	����� > 577
//	DOWN!
//	����� > 400
//	...
	
	
//	+@
//	UP�� ��¹޾��� ���� ������ ������ �Է��� ���ں��� ���� ���ڸ� �Է��ؾ� �Ѵ�.
//	���� ���� ���ڸ� �Է¹����� ���� �޼����� ����ؾ� �Ѵ�.
	
	
	public static void main(String[] args) {
		
		
		int answer = (int)(Math.random()*1000);
		System.out.println(answer);
		
		int count=1;
		
		while(true) {
			System.out.print("����� ���� �Է� : ");
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
				System.out.println("����!");
				System.out.println("�õ� Ƚ�� : " + count);
				break;
			}
			
	
			
		}
		
		
		
	}
	
}
