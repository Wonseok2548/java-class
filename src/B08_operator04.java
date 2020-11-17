
public class B08_operator04 {
	
	public static void main(String[] args) {
		
		// # 대입연산
		//	= : 왼쪽의 변수에 오른쪽 값을 대입
		int num = 10;
		num = num + 5;
		
		System.out.println(num);
		
		
		// # 복합 대입 연산
		//	- 변수에 결과를 누적시키는 연산
		
		num = 10;
		num += 5;	// num = num + 5;과 같은 뜻.
		
		System.out.println(num += 5);	// num = num + 5;
		System.out.println(num -= 2);	// num = num - 5;
		System.out.println(num *= 2);	// num = num * 5;
		System.out.println(num /= 4);	// num = num / 5;
		System.out.println(num %= 3);	// num = num % 5;
		
		
		// # 단항 연산
		num = 10;
		
		num++;	// num = num + 1;
		System.out.println(num);
		++num;	// num = num + 1;
		System.out.println(num);
		num--;	// num = num - 1;
		System.out.println(num);
		--num;	// num = num - 1;
		System.out.println(num);
		
		
		//	# ++, --의 위치에 따라 실행결과가 달라지기도 한다.
		int a = 3, b = 10;
		int result = a++ * b;			// (a*b) 계산을 먼저 하고 a값을 1만큼 올린다. 따라서 수행 직후의 a값은 3+1=4.
		System.out.println(result);
		System.out.println(a);			
		
		
		
		
		
		
		
	}

}























