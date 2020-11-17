package quiz;

public class C01_functionQuiz {
	
	// # ���� �Լ��� �����غ�����
	// 1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	// 2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	// 3. ���ڸ� �� �� �����ϸ� ���ڿ� "¦���Դϴ�." �Ǵ� "Ȧ���Դϴ�."�� ��ȯ�ϴ� �Լ�
	// 4. ������ ���ڰ� �Ҽ����� �ƴ��� �Ǻ����ִ� �Լ� (boolean)
	// 5. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	//	  factorial : (n)*(n-1)*(n-2) ... 3*2*1
	// 6. ���� �ΰ�(a, b)�� �����ϸ� a�� b������ ��ȯ�ϴ� �Լ�
	//	  (0������ 1�� ��ȯ�ؾ���, Math.pow ����)
	
	
	// Q1.
	public static boolean is_Alphabet(String alpha) {
		
		alpha = alpha.toUpperCase();
		boolean status = false;
		
		for (int i=0; i < alpha.length(); i++) {
			
			if (alpha.charAt(i) >= 'A' && alpha.charAt(i) <= 'Z') {
				status = true;
			}
			
		}
		
		return status;
		
		// return (alpha.charAt(i) >= 'A' && alpha.charAt(i) <= 'Z');   �̰� ���ٷ� ����
		
		
	}
	
	// Q2.
	public static boolean is_3s(int number) {
		
		boolean status = false;
		
		if (number % 3 == 0) {
			status = true;
		}
		
		return status;
		
		// return number % 3 ==0;	�̰� ���ٷ� ����
	}
	
	
	// Q3.
	public static String even_or_Odd(int number) {
		
		String answer = "Ȧ���Դϴ�.";
		
		if (number % 2 == 0) {
			return "¦���Դϴ�.";
		}
		
		return answer;
		// return number % 2 ==0 ? "¦���Դϴ�" : "Ȧ���Դϴ�";		�̰� ���ٷ� ����
	}
	
	
	// Q4.
	public static boolean is_Prime(int number) {
		
//		boolean status = false;
//		int count = 0;
		
		if (number == 1) {
			return false;			// ���� 1�� �Ҽ��� �ƴϱ� ������ number�� 1�̶�� ���ڸ����� false�� return�ϰ� �Լ� ����.	
		}
		
		for (int i=2; i < number; i++) {
			if (number % i == 0) {	// �μ��� �߻��ϸ�
				// count++;			// �߻��� �� ���� count�� 1�� ���϶�
				return false;		// return�� �ϸ� �Լ��� ������.
			}
			
		}
		
//		if (count == 0) {		// count�� 0�̶�� ���� �μ��� ���ٴ� ���̴�. ��, �Ҽ�
//			status = true;		// number�� �Ҽ��̸� status�� true�� �־��.
//		}
//		
//		if (count > 0) {
//			status = false;
//		}
		
		return true;
		
	}
	
	// Q5. 
	public static int factorial(int number) {
		
		int answer = 1;
		
		for (int i=0; i < number; i++) {
			
			answer *= (number-i);
		}
		
		// ����� �ڵ�
//		for (int i=number; i>0; i--) {
//			answer *= 1;
//		}
		
		return answer;
	}
	
	
	// ��� �Լ� : �ڱ� �ڽ��� �θ��� �Լ� (���� ������, �б� ����, �Ӹ�����)
	public static int recursive_factorial(int num) {
		if (num == 1) {
			return 1;
		}
		
		return num * recursive_factorial(num -1);
	}
	
	
	// Q6.
	public static int square(int main_number, int sub_number) {
		
		int answer = 1;
		
		if (sub_number == 0) {
			return 1;			// return�� �ϸ� �Լ��� ����ȴ�.
		}
		
		else {
			for(int i=1; i <= sub_number; i++) {				
				answer *= main_number; 
						
			}
		}
		return answer;
		
	}
	
	// Q6�� ����Լ��� �����.
	public static int recursive_suqare(int first, int second) {
		
		
		if (second != 0) {
			return first * recursive_suqare(first, second-1);
		}
		
		else
			return 1;
		


		
	}
		
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("1��===================");
		String str = "12345";
		String str2 = "hello";
		System.out.println(is_Alphabet(str));
		System.out.println(is_Alphabet(str2));
	
		
		System.out.println("2��===================");
		int number = 363;
		System.out.println(is_3s(number));
		
		System.out.println("3��===================");
		int number2 = 126;
		int number2_1 = 127;
		System.out.println(even_or_Odd(number2));
		System.out.println(even_or_Odd(number2_1));
		
		System.out.println("4��===================");
		int number3 = 11;
		int number4 = 18;
		System.out.println(is_Prime(number3));
		System.out.println(is_Prime(number4));
		
		System.out.println("5��===================");
		int number5 = 5;
		int number6 = 7;
		System.out.println(factorial(number5));
		System.out.println(factorial(number6));
		
		System.out.println("6��===================");
		System.out.println(square(5, 3));
		System.out.println(square(10, 2));
		
		System.out.println("����===================");
		System.out.println(recursive_suqare(6,3));
		
	
		
	}

}





















