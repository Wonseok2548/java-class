package quiz;

import java.util.Scanner;

public class B09_printReverse {
	
	// ����ڰ� ������ �Է��ϸ� �� ������ �Ųٷ� ����ϼ���.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		
		String sentence = sc.nextLine();
		
		int a = sentence.length();
		
		String rvs = "";
		
		for (int i= a; i >= 0; i-- ) {
			char c = sentence.charAt(i);
			rvs += c;
		}
		System.out.println(rvs);
		
		
		
		// ����� �ڵ�
		/*
		System.out.print("���� �Է� : ");
		String sentence = new Scanner(System.in).nextLine();
		
		for (int i = sentence.length() -1; i >= 0; i--) {
			reverse += sentence.charAt(i);
		}
		System.out.println(reverse);
		*/
		
		// StringBuilder�� += ��� append() �Լ��� ���� ���ڿ��� �����.
		StringBuilder str = new StringBuilder("hello");
		str.append(", world!");
		
		// �� ����� �� �ڿ� String���� ��ȯ�ؼ� ����ϸ� �ȴ�.
		String build_result = str.toString();
		System.out.println(build_result);
		
		// �Ųٷ� ���� ���ڿ��� ������ ����
		String reverse = "";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
























