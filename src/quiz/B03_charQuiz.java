package quiz;

public class B03_charQuiz {
	
	public static void main(String[] args) {
		
		// # Q1.
		char a = 'q';
		System.out.println("Q1 : " + (a == 'q' || a =='Q'));
		
		// # Q2. �����̳� ���� �ƴҶ� true
		char b = '\t';
		
		System.out.println("Q2 : " + ((b != ' ') && (b != '\t')));
		
		// # Q3.
		char c = 1;
		System.out.println("Q3 : " + (c >= '0' && c <= '9'));
		
		
		
		// # Q4. ����
		char d = '[';
		System.out.println("Q4 : " + ((d >= 'A' && d <= 'Z') || (d >= 'a' && d <= 'z')));
				
		
	
		// # Q5. �ѱ���
		char e = '��';
		System.out.println("Q5 : " + ((e >= 0xAC00 && e <= 0xD7A3) || (e >= 0x1100 && e <= 0x11FF)));
		
		
		// # Q6. �Ͼ�
		char f = '��';
		System.out.println("Q6 : " + (f >= 12352 && f <= 12543 ));
		
		
	}

}
