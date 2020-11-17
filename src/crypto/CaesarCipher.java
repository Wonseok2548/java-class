package crypto;

public class CaesarCipher {
	
	// # 암호란?
	// - 비밀 메시지를 주고받기 위한 것
	// - 암호화(Encryption)
	// 	 : 평문(일반 메시지)를 암호문(비밀 메시지)로 바꾸는 것
	// - 복호화(Decryption) 
	//   : 암호문을 평문으로 되돌리는 것
	// - 키(Key) : 암호화와 복호화에 사용되는 비밀 값
	
	// # 시저(카이사르) 암호
	// - 알파벳을 키(Key)값 만큼 오른쪽으로 이동시키는 암호 방식
	// - 암호화 : 키 값 만큼 오른쪽으로 이동시킨다.
	// - 복호화 : 암호문을 키 값 만큼 왼쪽으로 이동시킨다.
	
	// 예시
	// ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abcdefghijklmnopqrstuv...
	// # Key값이 3인 경우 (+3)
	// "Hello, World!" => "Khoorc#Zruog$"; 
	// # Key값이 3인 경우 복호환 (-3)
	// "Khoorc#Zruog$" => "Hello, World!"
	
	int key;
	static String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abcdefghijklmnopqrstuvwxyz";
	
	public CaesarCipher(int key) {
		this.key = key;
	}
	
	public int getIndex(char ch) {
		
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				return i;
			}
		}
	
		return -1;
	}
	
	public char setChar(int idx, int key) {
		int num = (idx + key) % str.length();
//		System.out.println(num);
		if (num < 0) {
			num += str.length();
		}
		
		return str.charAt(num);
	}
	
	public String encryption(String plain_text) {
		// 매개변수로 받은 평문을 암호화 하여 리턴하는 함수를 구현해보세요.
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < plain_text.length(); i++) {
			char ch = plain_text.charAt(i);
			int idx = getIndex(ch);
			if (idx > -1) {
				sb.append(setChar(idx, key));				
			} else {
				sb.append(ch);
			}
			
//			sb.append((char) (plain_text.charAt(i) + key));
		}
		
		return sb.toString();
	}
	
	public String decryption(String crypto_text) {
		// 매개변수로 받은 암호문을 복호화 하여 리턴하는 함수를 구현해보세요.
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < crypto_text.length(); i++) {
			char ch = crypto_text.charAt(i);
			int idx = getIndex(ch);

			if (idx > -1) {
				sb.append(setChar(idx, -key));				
			} else {
				sb.append(ch);
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		int key = -20000;
		CaesarCipher cc = new CaesarCipher(key);
		
		String input = "Hello, 가나 World!다라마";
		System.out.println(input);
		
		String secret = cc.encryption(input);
		System.out.println(secret);
		
		String original = cc.decryption(secret);
		System.out.println(original);
		
	}
	
}
