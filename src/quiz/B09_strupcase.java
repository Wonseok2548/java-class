package quiz;

import java.util.Scanner;

public class B09_strupcase {
	
	
	// �Է¹��� ���ڿ��� ���ĺ��� �빮�� -> �ҹ���
	//					  �ҹ��� -> �빮��
	// �� ������ �Ѽյ��� �ʰ�, ���ο� ���ڿ��� �����Ǿ�� ��.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է� : ");
		String str = sc.nextLine();
		
				
		StringBuilder new_str = new StringBuilder();
		
		for (int i = 0, len = str.length(); i < len; i++) {
			char word = str.charAt(i);
			char new_word = ' ';

			
			if ((word >= 'A' && word <= 'Z')) {
				new_word = (char)((int)word + 32);
			}
			else if (word >= 'a' && word <= 'z') {
				new_word = (char)((int)word - 32);
			}
			else {
				new_word = word;
				
			}
			new_str.append(new_word);
			
			
			
			
		}
		
		System.out.println("���� ���ڿ� : " + str);
		System.out.println("��ȯ�� ���ڿ� : " + new_str);
		
		
		/* �ҹ��ڸ� �빮�ڷ� ��ȯ�ϴ� ���.
		 * ch�� ������ ����
		 * ch -= Math.abs('a' - 'A')			
		 * ch -= Math.abs('A' - 'a')
		 * ch = (char)(ch - 'a' + 'A')
		 * ch -= 32;
		*/
			
		
		
		
		
	}
}
