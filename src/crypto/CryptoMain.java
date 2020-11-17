package crypto;

import java.util.Scanner;

public class CryptoMain {
	
	public static void main(String[] args) {
		
	// 사용자가 메세지와 키값을 설정하여 원하는 암호 알고리즘으로
	// 암호확 및 복호화 작업을 할 수 있는 프로그램을 만들어보세요.
		
	
	System.out.print("메세지 입력 : ");
	String script = new Scanner(System.in).nextLine();
	
	System.out.print("키값 입력 : ");
	int key = new Scanner(System.in).nextInt();
	
	
	System.err.println("원하는 암호화 알고리즘을 선택하세요.");
	
	System.out.print("1. Caesar Cipher\n2. Transposition Cipher\n3. 프로그램 종료\n");
	int CC = new Scanner(System.in).nextInt();
	
	

	if (CC == 1) {
		System.out.println("Caesar Cipher 알고리즘으로 암호화 합니다.");
		CaesarCipher cc = new CaesarCipher(key);
		String secret = cc.encryption(script);
		System.out.println("암호화 문장 : " + secret);	
			
		String original = cc.decryption(secret);
		System.out.println("원래 문장 : " + original);
		//break;
			
			
	}
		
	if (CC == 2) {
		System.out.println("Transposition Cipher 알고리즘으로 암호화 합니다.");
		String crypto = new TranspositionCipher(key).encryption(script);
		System.out.println("암호화 문장 : " + crypto);
			
		String plain = new TranspositionCipher(key).decryption(crypto);
		System.out.println("복호화 문장 : " + plain);	
		//break;
		
	}
		
	if (CC == 3) {
		System.err.println("프로그램을 종료합니다.");			
		//break;
	}
		
		

	
	
	
	
	}
	

}
























