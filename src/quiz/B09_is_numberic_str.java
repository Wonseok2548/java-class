package quiz;

import java.util.Scanner;

public class B09_is_numberic_str {
	
	// �Է¹��� ���ڿ��� ���ڸ� ���ԵǾ������� ����� 1�� ����
	// �ٸ����ڰ� ���ԵǾ� ������ 0�� �����Ͽ� ���
	
	// �� ��, ���ڿ��� ������� ���� ����� 2
	
	
	public static void main(String[] args) {
		
		/*
		System.out.print("���ڿ� �Է� : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		char result = '2';
		
		
		if (str.equals("") || str == null || str.length() == 0) 		// ���ڿ� �񱳴� equls()
			System.out.println(result); 		//str.length() == 0 �� str.equals("")�� ���� ��
		
				
		int length = str.length();
		
		for (int i = 0; i < length; i++) {
			char ch = str.charAt(i);
			
			/*if (ch >= '0' && ch <= '9') {
				result = '1'; 							// �ٽú��� �� �κ�.
				break;
			}
			/
			
			
			
			if (!(ch >= '0' && ch <= '9')) {
				result = '0';
				break;}
			
			if (i == length -1)
				result = '1';
			
		
		}
		
		System.out.println(result);
	
		*/
		
		// �����
		
		System.out.print("�����Է� > ");
		String str = new Scanner(System.in).nextLine();
		
		int status = 1;
		
		if (str == null || str.length() == 0)
			status = 2;
		else
			for (int i = 0, len = str.length(); i < len; i++) {
			
				char ch = str.charAt(i);
			
				if (ch < '0' || ch > '9') {
					status = 0;
					break;
				}	
			
		}
		System.out.println("���ڿ� ���� : " + status);
		
		
	}
}


