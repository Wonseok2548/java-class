package crypto;

public class CaesarHacker {
	
	// ��ȣ���� charset�� �˰����� ������ȣ ������� �˰��ִٰ� ������ ���·�
	// ��ȣ���� �̿��Ͽ� ���� �����غ�����
	// Ű�� �𸥴ٰ� �����Ѵ�.
	
	// * ��ȣ�� �������� ���� ���� ���� 3������ ��� �����ڰ� �˰� �ִٰ� �����Ѵ�.
	static char[] charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abcdefghijklmnopqrstuvwxyz".toCharArray();
	
	public static void main(String[] args) {
		String hijacked = "Rovvy";
		
		for (int key = 0; key < charset.length; key++) {
			CaesarCipher cc = new CaesarCipher(key);
			System.out.println(cc.decryption(hijacked));
		}
		
	}

}
