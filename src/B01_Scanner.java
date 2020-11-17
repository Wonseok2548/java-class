import java.util.Scanner;
	
	// 다른 패키지에 있는 클래스를 사용하려면 해당 클래스를 import해야한다.
	
	// ※ 다른 패키지에서 미리 만들어 둔 소스를 가져와서 사용할 수 있다.
	//import quiz.A01_printQuiz;
	// A01_printQuiz.main(null);


	// ※ 같은 패키지에서 만들어둔 소스는 import하지 않아도 사용할 수 있다.
	// A01_Hello.main(null);
	// A02_Escape.main(null);



public class B01_Scanner {
	
	// # Scanner 클래스
	//	- 프로그램 외부로부터 입력을 받을 수 있는 기능들이 모여있는 클래스
	// 	- 어디에서 입력을 받을지 결정하고 다양한 방법으로 입력받을 수 있다.
	//	- 콘솔로부터 입력을 받을 때는 System.in을 이용한다.
	
	
	public static void main(String[] args) {
		
		// 새로운 스캐너를 생성한 뒤 변수 sc에 생성한 스캐너를 담아 놓는다.
		// 새로운 스캐너를 생성할 때 어디에서 입력받을지를 설정할 수 있다.
		//	System.out	:	콘솔로 출력하는 통로 
		//	System.in	:	콘솔에서 입력받는 통로
		Scanner sc = new Scanner(System.in);

		// next()
		//	- 통로에 존재하는 다음값을 하나만 꺼낸다.
		//	- 타입을 바꾸지 않는다. (String)
		//	- 통로에 아무값도 없다면 입력이 될때까지 기다린다.
		
		
		// next타입() 	...		 ex) nextInt
		//	- 통로에 존재하는 다음 값을 하나만 꺼낸 뒤 해당타입으로 변환한다.
		//	- 통로에 아무 값도 없다면 입력이 될때까지 기다린다.
		//	- 통로에 존재하는 다음 값이 해당 타입이 될 수 없다면 에러가 발생한다.
		
		
		// nextLine()
		//	- 통로에 존재하는 값들 중 한줄을 가져온다.
		// 	- 한 줄을 구분하는 기준은 '\n'이다.
		
		System.out.println("아무 값이나 입력해보세요 : ");
		int num = sc.nextInt();
		
		System.out.println("입력 받은 값 출력 : " + num);
		System.out.println(num + 10);
		System.out.println(num * 10);
		System.out.println(num / 10);
		System.out.println(num / 10.0);
		System.out.println(Math.pow(num, 2));
		
		
		System.out.println("두번째 값을 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.println("두번째 값 출력 : " + num2);
		
		
		
		
		
		
	}
}




















































