package test;

public class test2 {
	
//	1. intŸ�� ���� a�� Ȧ���� �� true
//	2. charŸ�� ���� ch�� �����ڰ� �ƴ� �� true
//	3. booleanŸ�� ���� complete�� false�� �� true
//	4. StringŸ�� �������� str�� "yes"�� �� true
//	5. StringŸ�� �������� command�� 8������ �� true
//	6. StringŸ�� �������� command�� �� ��° ���ڰ� ��/�ҹ��� ������� q�϶� true
	
	
	public static void main(String[] args) {
		
		// Q1.
		boolean isOddNumber = false;
		int a = 5;
		if (a % 2 != 0) {
			isOddNumber = true;
		}
		System.out.println("Q1 : " + isOddNumber);
		
		
		// Q2.
		boolean isNotEnglish = true;										
		char ch = '��';
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {			
			isNotEnglish = false;
		}
		System.out.println("Q2 : " + isNotEnglish);
		
		
		// Q3. 
		boolean complete = false;
		
		boolean answer = false;
		
		if (complete == false) {
			answer = true;
		}
		System.out.println("Q3 : " + answer);

		
		
		// Q4. 		
		boolean isStrYes = false;
		String str = "Yes";
		str = str.toLowerCase();
		
		if (str.equals("yes")) {
			isStrYes = true;
		}
		System.out.println("Q4 : " + isStrYes);
		
		
		// Q5.
		boolean is8String = false;
		
		String command = "abQdefgh";
		int len = command.length();
		
		if (len == 8) {
			is8String = true;
		}
		System.out.println("Q5 : " + is8String);
		
		
		
		// Q6.
		boolean isUpperQ = false;
		
		command = command.toUpperCase();
		
		if (command.charAt(2) == 'Q') {
			isUpperQ = true;
		}
		System.out.println("Q6 : " + isUpperQ);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}




























