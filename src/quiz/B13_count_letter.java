package quiz;

public class B13_count_letter {
	
	// ����ڷκ��� ������ �ϳ� �Է¹޾Ҵ� ġ��
	// �ش� ���忡 � ���ĺ��� ��� �����ߴ��� ��� ����غ�����
	// ��ҹ��� ����X

	
	
	public static void main(String[] args) {
		
		
		
		String msg = "The Quick Brown Fox Jumps Over a Lazy Dog";
		
		// int count_a = 0;
		// int count_b = 0;
		// int ocunt_c = 0;
		
		int[] count = new int[26];
		
		
		
		
		msg = msg.toLowerCase();	// �ϰ������� �ҹ��ڷ� ����. �빮�ڴ� .toUpperCase();
		System.out.println(msg);
		
		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			
			if ( ch >= 'a' && ch <= 'z') {	//	������ ���� ������ ���� ������ ���ĺ� �϶��� �����ϵ��� ����
				count[ch - 'a'] += 1;	// i�� 5 -> ch�� U. count[U - A] = count[85-65=20] -> count[20] = U
			}
			
			
		}
		
		for (int i = 0; i <26; i++) {
			if (count[i] > 0) {
				System.out.printf("%c�� ������ Ƚ���� %d�Դϴ�.\n", i+'a', count[i]);
			}
		}
		
			
	
		
		
		
		
		
	}
}

















