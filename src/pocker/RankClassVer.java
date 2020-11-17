package pocker;


// Rank를 enum으로 직접 구현해 보세요.
public class RankClassVer {
	static String[] names;
	static Integer[] rankValues;
	
	public static final RankClassVer ACE;
	public static final RankClassVer DUECE;
	public static final RankClassVer THREE; 	
	public static final RankClassVer FOUR; 	
	public static final RankClassVer FIVE; 	
	public static final RankClassVer SIX; 	
	public static final RankClassVer SEVEN; 	
	public static final RankClassVer EIGHT; 	
	public static final RankClassVer NINE; 
	public static final RankClassVer TEN; 
	public static final RankClassVer JACK; 
	public static final RankClassVer QUEEN;
	public static final RankClassVer KING; 
	
	public static final RankClassVer[] values;
	
	
	
	static {
		names = new String[] {"ACE", "DUECE", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"};
		
		rankValues = new Integer[] {12, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		
		ACE 	= new RankClassVer(0);
		DUECE 	= new RankClassVer(1);
		THREE 	= new RankClassVer(2);
		FOUR 	= new RankClassVer(3);
		FIVE 	= new RankClassVer(4);
		SIX 	= new RankClassVer(5);
		SEVEN 	= new RankClassVer(6);
		EIGHT 	= new RankClassVer(7);
		NINE 	= new RankClassVer(8);
		TEN 	= new RankClassVer(9);
		JACK 	= new RankClassVer(10);
		QUEEN 	= new RankClassVer(11);
		KING 	= new RankClassVer(12);
		
		values = new RankClassVer[] {ACE, DUECE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
	}
	
	String name;
	int nameValue;
	int order;
	
	// private 생성자 : 외부에서는 인스턴스를 생성할 수 없게 만들기
	private RankClassVer(int index) {
		this.order = index;
		this.name = names[index];
		this.nameValue = rankValues[index];
	}
	
	@Override
	public String toString() {
		return name;
	}

	
	public static void main(String[] args) {
		System.out.println(RankClassVer.ACE);
	
	}
}















































































