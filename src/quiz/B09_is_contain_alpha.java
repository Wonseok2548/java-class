package quiz;

import java.util.Scanner;

public class B09_is_contain_alpha {
	
	// ����ڰ� �Է��� ���ڿ��� ���ĺ��� ���ԵǾ� ������ true ���
	// ������ false ���
	
	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
		String sentence = sc.nextLine();
		
		int length = sentence.length(); // ���ڿ��� ����
		
		
		
		for (int i= 0; i <= length -1; i++) {
			
			char ch = sentence.charAt(i);
			
			
			if ((ch >= 'A' && ch <= 'z')) {
				System.out.println("true");
				break; 
				}
			
			if (i == length -1 )				// for���� �������� Ȯ��.
				System.out.println("false");
			
			
			
		}
		*/
		System.out.print("�����Է� : ");
		String str = new Scanner(System.in).nextLine();
		
		boolean result = false;
		
		// str.length()�� �ѹ��� ȣ���ϴ� ���
		for (int i = 0, len = str.length(); i < len; i++) {
			char ch = str.charAt(i);
			
			
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				result = true;
				break;	// ������ �ݺ����� ������.
			}
		
		System.out.println(result);
			
			
			
			
		}
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

























