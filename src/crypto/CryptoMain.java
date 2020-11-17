package crypto;

import java.util.Scanner;

public class CryptoMain {
	
	public static void main(String[] args) {
		
	// ����ڰ� �޼����� Ű���� �����Ͽ� ���ϴ� ��ȣ �˰�������
	// ��ȣȮ �� ��ȣȭ �۾��� �� �� �ִ� ���α׷��� ��������.
		
	
	System.out.print("�޼��� �Է� : ");
	String script = new Scanner(System.in).nextLine();
	
	System.out.print("Ű�� �Է� : ");
	int key = new Scanner(System.in).nextInt();
	
	
	System.err.println("���ϴ� ��ȣȭ �˰����� �����ϼ���.");
	
	System.out.print("1. Caesar Cipher\n2. Transposition Cipher\n3. ���α׷� ����\n");
	int CC = new Scanner(System.in).nextInt();
	
	

	if (CC == 1) {
		System.out.println("Caesar Cipher �˰������� ��ȣȭ �մϴ�.");
		CaesarCipher cc = new CaesarCipher(key);
		String secret = cc.encryption(script);
		System.out.println("��ȣȭ ���� : " + secret);	
			
		String original = cc.decryption(secret);
		System.out.println("���� ���� : " + original);
		//break;
			
			
	}
		
	if (CC == 2) {
		System.out.println("Transposition Cipher �˰������� ��ȣȭ �մϴ�.");
		String crypto = new TranspositionCipher(key).encryption(script);
		System.out.println("��ȣȭ ���� : " + crypto);
			
		String plain = new TranspositionCipher(key).decryption(crypto);
		System.out.println("��ȣȭ ���� : " + plain);	
		//break;
		
	}
		
	if (CC == 3) {
		System.err.println("���α׷��� �����մϴ�.");			
		//break;
	}
		
		

	
	
	
	
	}
	

}
























