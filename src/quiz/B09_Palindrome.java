package quiz;

import java.util.Scanner;

public class B09_Palindrome {

	
	// ����ڷκ��� �ܾ �ϳ� �ް�
	// �ش� �ܾ ȸ���̶�� "PALINDROME" ���
	// ȸ���� �ƴ϶�� "NOT PALINDROME" ���
	
	// �� ABBA, MADAM, BORROWORROB ó�� �¿��Ī�� �ܾ ȸ���̶�� �Ѵ�.
	
	public static void main(String[] args) {
		

		System.out.print("�ܾ �Է��ϼ��� : ");
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		
		int len = word.length();
		
		String answer = "";
		
		
		
		if (len % 2 == 0) {
			
			for (int i = 0; i < len / 2; i++) {
				char ch = word.charAt(i);
				
				if (ch == word.charAt(len -i -1)) {
					answer = "PALINDROME";
				}
				else 
					answer = "NOT PALINDROME";
				
			}
		}
		
		
		
		else {
			for (int i = 0; i < len / 2; i++) {
				char ch = word.charAt(i);
				
				if (ch == word.charAt(len-i-1)) {
					answer = "PALINDROME";				
				}
				else
					answer = "NOT PALINDROME";			
			}
		}
			
		System.out.print(answer);				
	}


/*

	System.out.print("�Է� : ")
	String word = sc.next();
	StringBuilder strb = new StringBuilder(word);
	String revers = strb.reverse().toString();

	int half = word.length() / 2;

	boolean palin = true;

	for (int i = 0; i < half; i++) {
		if (word.charAt(i) != reverse.charAt(i)) {
			palin = false;
			break;
		}
	}


*/

}






























