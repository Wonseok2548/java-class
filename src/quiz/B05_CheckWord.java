package quiz;

import java.util.Scanner;

public class B05_CheckWord {
	
	// ����ڷκ��� �ܾ �ϳ� �Է¹ް�
	// ù��° ���ڿ� ������ ���ڰ� ��ġ�ϸ� "OK" ���.
	// �ƴ϶�� "NOT OK" ���.
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ƹ� �ܾ �Է��ϼ��� : ");
		String word = sc.nextLine();
		
		int length = word.length();		// �Է¹��� �ܾ��� ����		
		int last = word.length() - 1;	// ������ ������ index ��ȣ
		
		
		
		if (length <= 1)	// null : �ƹ� ���� ���� ����.
			System.out.println("�ܾ��� ���̰� �����մϴ�.");
		
		else
			if (word.charAt(0) == word.charAt(last)) 
				System.out.println("OK");
			else
				System.out.println("NOT OK");
		
		
		/* ������� �ϽŰ�.
		
		String WORD = "A";
		
		char first_letter = word.charAt(0);
		char last_letter = word.charAt(word.length() - 1);
		
		if (first_letter == last_letter)
			System.out.println("OK");
		else
			System.out.println("NO OK");
			
		*/	
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}





































