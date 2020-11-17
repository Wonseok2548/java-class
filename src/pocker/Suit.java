package pocker;

//jdk 1.5�������� ������ 
public enum Suit {
	// order�� name�� �⺻������ �����ȴ�.
	// ���ο� ����� �߰��ϰ� �ʹٸ� �����ڸ� �̿��Ѵ�.
	
	SPADE(3, "�����̵�", '��'),		// order 0, name "SPADE" 	 ,	suitValue 3
	DIAMOND(2, "���̾Ƹ��", '��'),	// order 1, name "DIAMOND"	 ,	suitValue 2
	HEART(1, "��Ʈ", '��'),			// order 2, name "HEART" 	 ,	suitValue 1
	CLUB(0, "Ŭ�ι�", '��');			// order 3, name "CLUB"		 ,	suitValue 0
	
	public static final int NUM_OF_SUIT = 4;

	
	private int suitValue;
	private String korName;
	private char suitPic;
	
	// enumŸ�� ��ü�� �����ڰ� �ݵ�� private�̴�.
	private Suit(int suitValue, String korName, char suitPic) {
		this.suitValue = suitValue;
		this.korName = korName;
		this.suitPic = suitPic;
	
	}
	
	// Ctrl + Space�� get�� ġ�� �˾Ƽ� private ��������� ã�Ƽ� �޼��带 ������ �ش�.
	public int getSuitValue() {
		return suitValue;		
	}
	
	public String getKorName() {
		return korName;
	}
	
	public char getSuitPic() {
		return suitPic;
	}
	
	
	

	
}