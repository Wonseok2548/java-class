package crypto;

public class CaesarHacker {
	
	// 암호문과 charset과 알고리즘이 시저암호 방식임을 알고있다고 가정한 상태로
	// 암호문을 이용하여 평문을 추출해보세요
	// 키는 모른다고 가정한다.
	
	// * 암호의 강력함을 논할 때는 위의 3가지는 모두 공격자가 알고 있다고 가정한다.
	static char[] charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abcdefghijklmnopqrstuvwxyz".toCharArray();
	
	public static void main(String[] args) {
		String hijacked = "Rovvy";
		
		for (int key = 0; key < charset.length; key++) {
			CaesarCipher cc = new CaesarCipher(key);
			System.out.println(cc.decryption(hijacked));
		}
		
	}

}
