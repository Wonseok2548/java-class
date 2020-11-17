package test;

public class test2 {
	
//	1. int타입 변수 a가 홀수일 때 true
//	2. char타입 변수 ch가 영문자가 아닐 때 true
//	3. boolean타입 변수 complete가 false일 때 true
//	4. String타입 참조변수 str이 "yes"일 때 true
//	5. String타입 참조변수 command가 8글자일 때 true
//	6. String타입 참조변수 command의 세 번째 글자가 대/소문자 관계없이 q일때 true
	
	
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
		char ch = '가';
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




























