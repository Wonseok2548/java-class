package myobj.fruit;


// ※클래스 하나당 파일 하나가 바람직하다
public class Kiwi {
	
	public int size;
	public int calorie;
	public int weight;
	
	public Kiwi(int size) {
		this.size = size;
		
	}
	
	public Kiwi() {
		this(5);	
		System.out.println("기본 생성자로 돌아왔습니다.");
		
		// 생성자에서 this()를 통해 다른 생성자를 호출할 수 있다.
		// 다른 생성자는 반드시 생성자 맨 윗줄에서 호출해야 한다.
	}
	
	public void eat() {
		size -= 5;
		calorie -= 30;
		weight -= 15;
		System.out.printf("크기 : %d, 보유 칼로리 : %d, 무게 : %d\n", this.size, this.calorie, this.weight);
	}

}
