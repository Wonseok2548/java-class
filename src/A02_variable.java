public class A02_variable {
	
	// # 변수
	// - 데이터를 미리 담아놓고 나중에 꺼내서 사용할 수 있는 공간
	// - 변수를 사용하기 위해서는 해당 변수가 어떤 타입의 데이터를 저장할지 미리 정해야 한다. (선언, declare)
	
	public static void main(String[] args) {
		
		// a라는 변수에 데이터 10을 담아놓겠다.
		int a = 10;
		
		// b라는 변수에 데이터 10을 담아놓겠다.
		int b;
		b = 20;
		
		// 프로그래밍에서 =의 의미는 왼쪽의 변수에 오른쪽의 값을 대입한다는 뜻.
		
		// JAVA에서는 선언하지 않은 변수는 쓸 수 없다.
		// a = 15; (X)
		
		System.out.println(a);
		System.out.println(a * 3);
		System.out.println(a+b-5);
		
		// # 변수를 선언하는 여러가지 방법
		int num1; // 기본적인 선언
		int num2, num3, num4; // 같은 타입 변수를 동시에 여러개 선언가능
		int num5 = 99; // 선언과 동시에 값을 대입
		int num6 = 7, num7 = 31, num8 = 900; // 여러개 선언과 동시에 대입 가능
		
		// 값을 한번도 대입하지 않은 변수는 사용할 수 없다.
		// 변수를 선언한 뒤 맨 처음 값을 대입하는 것을 '초기화(initialize)'라고 부른다.
		num1 = 123;
		System.out.println(num1);
		
		System.out.println("num5에 저장된 값 : " + num5);
		System.out.println(num6);
		System.out.println(num7);
		System.out.println(num8);
		
	}

}



















