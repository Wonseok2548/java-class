
public class B08_operator04 {
	
	public static void main(String[] args) {
		
		// # ���Կ���
		//	= : ������ ������ ������ ���� ����
		int num = 10;
		num = num + 5;
		
		System.out.println(num);
		
		
		// # ���� ���� ����
		//	- ������ ����� ������Ű�� ����
		
		num = 10;
		num += 5;	// num = num + 5;�� ���� ��.
		
		System.out.println(num += 5);	// num = num + 5;
		System.out.println(num -= 2);	// num = num - 5;
		System.out.println(num *= 2);	// num = num * 5;
		System.out.println(num /= 4);	// num = num / 5;
		System.out.println(num %= 3);	// num = num % 5;
		
		
		// # ���� ����
		num = 10;
		
		num++;	// num = num + 1;
		System.out.println(num);
		++num;	// num = num + 1;
		System.out.println(num);
		num--;	// num = num - 1;
		System.out.println(num);
		--num;	// num = num - 1;
		System.out.println(num);
		
		
		//	# ++, --�� ��ġ�� ���� �������� �޶����⵵ �Ѵ�.
		int a = 3, b = 10;
		int result = a++ * b;			// (a*b) ����� ���� �ϰ� a���� 1��ŭ �ø���. ���� ���� ������ a���� 3+1=4.
		System.out.println(result);
		System.out.println(a);			
		
		
		
		
		
		
		
	}

}























