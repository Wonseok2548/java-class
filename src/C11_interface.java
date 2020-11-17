
public class C11_interface {
	
	// # 인터페이스 (interface)
	//	- abstract class와 유사하지만 여러개 상속받을 수 있는 것이다.
	//	- 추상을 통해 클래스에 성질을 부여하고 싶지만 
	//	  이미 상속받은 클래스가 있는 경우 인터페이스를 사용한다.	
	//	- 인터페이스로도 업캐스팅이 가능하다.
	//	- 인터페이스에서 메서드를 선언하면 자동으로 abstract public메서드가 된다.
	//	- 인터페이스의 변수는 자동으로 final static이 된다.
	//	- 인터페이스의 default method : 기본 동작이 있는 메서드를 정의한다.
	//	- 인터페이스의 static  method : 모든 인터페이스에서 공통으로 사용하는 메서드를 구현할 수 있다.
	
	public static void swimContest(Swimmer s) {
		Swimmer.getTime();
		s.swim();
		s.kick();
		s.front();
	}
	
	public static void main(String[] args) {
		swimContest(new Bear());
		
		swimContest(new Swimmer() {

			@Override
			public void swim() {
				System.out.println("익명의 수영선수는 자유영을 했습니다.");		
			}
			
			@Override
			public void kick() {
				System.out.println("익명의 수영선수는 발차기를 열심히 했습니다.");
			}
		
		});
	}
	

	
}

interface Swimmer {
	final static double water_regist = 123;		// final static
	void swim();								// abstract public
	
	// # interface의 default method
	//	- 오버라이드 할 수도 있지만, 안하면 기본동작을 사용하게되는 메서드
	default void kick() {
		System.out.println("물장구치기");
	};
	default void front() {
		System.out.println("마구헤엄치기");
	};
	
	static long getTime() {
		return System.currentTimeMillis();
	}
}

interface Fishing {
	void fish();
}

class Bear extends myobj.animal.Animal implements Swimmer, Fishing {

	@Override
	public void fish() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}
	
}

