package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class D10_OnlyPhoneNumber {
	
	// ����ڷκ��� �޴��� ��ȣ�� �Է¹޾� ������.
	// �޴��� ��ȣ ���°� �ƴ� ��� ���� �޼����� ��� �� �ٽ� �Է�.
	

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String phoneNumber = null;
		String regex = "01[01679]-[\\d]{3,4}-[\\d]{4}";
		while (true) {
			System.out.print("Tel > ");
			phoneNumber = sc.nextLine();
			
			if (Pattern.matches(regex, phoneNumber)) {
				System.out.println("�ùٸ� ��ȭ��ȣ");
				break;
			}
			else {
				System.err.println("�߸��� ��ȭ��ȣ");
			}
			
		}
		System.out.println("Tel : " + phoneNumber);
		
	}

}
