package crypto;

public class CryptoMain_answer {
	// ����ڰ� �޼����� Ű���� �����Ͽ� ���ϴ� ��ȣ �˰�������
	// ��ȣȮ �� ��ȣȭ �۾��� �� �� �ִ� ���α׷��� ��������.
	
	
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
