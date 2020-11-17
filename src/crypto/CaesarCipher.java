package crypto;

public class CaesarCipher {
	
	// # ��ȣ��?
	// - ��� �޽����� �ְ�ޱ� ���� ��
	// - ��ȣȭ(Encryption)
	// 	 : ��(�Ϲ� �޽���)�� ��ȣ��(��� �޽���)�� �ٲٴ� ��
	// - ��ȣȭ(Decryption) 
	//   : ��ȣ���� ������ �ǵ����� ��
	// - Ű(Key) : ��ȣȭ�� ��ȣȭ�� ���Ǵ� ��� ��
	
	// # ����(ī�̻縣) ��ȣ
	// - ���ĺ��� Ű(Key)�� ��ŭ ���������� �̵���Ű�� ��ȣ ���
	// - ��ȣȭ : Ű �� ��ŭ ���������� �̵���Ų��.
	// - ��ȣȭ : ��ȣ���� Ű �� ��ŭ �������� �̵���Ų��.
	
	// ����
	// ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abcdefghijklmnopqrstuv...
	// # Key���� 3�� ��� (+3)
	// "Hello, World!" => "Khoorc#Zruog$"; 
	// # Key���� 3�� ��� ��ȣȯ (-3)
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
		// �Ű������� ���� ���� ��ȣȭ �Ͽ� �����ϴ� �Լ��� �����غ�����.
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
		// �Ű������� ���� ��ȣ���� ��ȣȭ �Ͽ� �����ϴ� �Լ��� �����غ�����.
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
		
		String input = "Hello, ���� World!�ٶ�";
		System.out.println(input);
		
		String secret = cc.encryption(input);
		System.out.println(secret);
		
		String original = cc.decryption(secret);
		System.out.println(original);
		
	}
	
}
