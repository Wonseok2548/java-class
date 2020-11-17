package crypto;

public class CryptoMain_answer {
	// 사용자가 메세지와 키값을 설정하여 원하는 암호 알고리즘으로
	// 암호확 및 복호화 작업을 할 수 있는 프로그램을 만들어보세요.
	
	
	public static void main(String[] args) {
		
		
		String user_input = "Caesar";
		int user_input_key = 8;
		
		Cipher cipher = null;
		
//		if (user_input.equals("Caesar")) {
//			cipher = new CaesarCipher(user_input_key);
//		}
//		else if (user_input.equals("Transposition")) {
//			cipher = new TranspositionCipher(user_input_key);
//		}
		
		String result = cipher.encryption("ABCDEFG ABCDEFG ABCDEFG ABCDEFG");
		
		System.out.println(result);
		
		
	}

}
