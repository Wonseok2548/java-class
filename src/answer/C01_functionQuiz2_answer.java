package answer;

import java.util.Arrays;

public class C01_functionQuiz2_answer {
	
		// 1. �ּҰ��� �ִ밪�� �Ű������� ������, �� ������ ��� ���� �����ϴ� int�迭�� �����Ͽ� ��ȯ�ϴ� range�Լ��� ��������.
		//	  (�ּҰ� �̻�, �ִ밪 �̸�)
		
		// 2. �ִ밪�� �Ű������� ���޹�����, 0���� �ִ밪 �̸��� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ� range2 �Լ��� ��������.
		
		// 3. ���ڿ� �迭�� ���޹�����, �ش� �迭�� ��� "/"�� �ٿ� �̾���̴� join �Լ��� ��������.
		//	ex: {"apple", "banana", "orange"}
		//		-> "apple/banana/orange"
		
		// 4. ���ڿ� Ÿ���� ����(num), ���� ����(base_from), �ٲٷ��� ����(base_to)�� ���޹�����
		//	  base_from�� �����̿��� num�� base_to ������ ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �Լ��� ��������.
		//	  �� ����, ������ �߸��� ��� null�� ��ȯ�մϴ�.
		//	  �� ��ȯ�� �� �ִ� �ִ������� 36�����̰�, �ּ������� 2�����̴�.
	
	
	public static int[] range(int min, int max) {
		
		int[] arr = new int[max - min];
		
		
		for (int i=0; i < arr.length; i++) {
			arr[i] = min + i;
		}
		
		return arr;
	}
	
	
	
	
	public static int[] range(int max) {
		int[] arr = new int[max];
		
		for (int i=0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		return arr;
	}
	
	public static String join(String[] arr, String sep) {
		StringBuilder result = new StringBuilder();
		
		for (int i=0; i < arr.length; i++) {
			if (i == 0) {
				result.append(arr[i]);
			}
			else {
				result.append(sep + arr[i]);
			}
		}
		
		
		return result.toString();
	}
	
	
	
	
	public static char[] digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	
	public static char getSymbol(int value) {
	
		return digits[value];
	}
	
	
	public static int getValue(char digit) {
		
		for (int i=0; i < digits.length; i++) {
			if (digits[i] == digit) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	public static String convert_base(String num, int base_from, int base_to) {
		num = num.toUpperCase();
		
		
		if (base_from < 2 || base_from > 36 || base_to < 2|| base_to > 36) {
			System.err.println("RadixEror : ��밡���� ������ 2���� 36�Դϴ�.");
			return null;
		}
		
		int pow = num.length() - 1;
		long real_value = 0;
		
		for (int i=pow; i > -1; i--) {
			
			char digit = num.charAt(pow - i);
			
			
			int value = getValue(digit);
			
			// 8�������� 8�̻��� ���ڰ� ������ ����.
			if (value >= base_from) {
				System.err.println("base_from �̻��� ���� ���� ���ڰ� �ֽ��ϴ�.");
				return null;
			}
			
			System.out.println(digit);
			System.out.println("\t������ : " + value);
			System.out.println("\t" + Math.pow(base_from, i) + "�� �ڸ�");
			
			real_value += value * Math.pow(base_from, i);
			
			
			
		}
		
		System.out.println(base_from + "���� ���ڿ� \"" + num + "\"�� ���� ������ "
							+ real_value + "�Դϴ�");
		
		
		
		StringBuilder result = new StringBuilder();
		
		
		
		//123456�� 10���� 123456���� ��ȯ�ϴ� ���
		
		while (real_value > 0) {
			result.append(getSymbol((int)(real_value % base_to)));
			real_value /= base_to;
			
		}
		
		
		
		return result.reverse().toString();
	}
	
	
	
	
	public static void main(String[] args) {
		
		// # �Լ��� �����ε�
		//	- ���� �Լ��̸����� �پ��� ������ �Լ��� ������ �� �ִ�.
		//	- �ٸ� ������ �Լ��� �����ޱ� ���ؼ���
		//	  �Ű������� ���� Ȥ�� Ÿ���� �޶���Ѵ�.
		
		System.out.println(Arrays.toString(range(10,18)));
		System.out.println(Arrays.toString(range(10)));
		
		
		// # println�� �پ��� �Ű����� Ÿ���� ���� �� �ֵ��� �����ε� �Ǿ��ִ�.
		System.out.println(123);
		System.out.println("123");
		System.out.println('a');
		System.out.println(123.123);
		
		String[] arr = {"abc", "def", "kkk"};
		System.out.println(join(arr, "��"));
		
		
		System.out.println("------------------------------------------");
		System.out.println(convert_base("ABCDEF", 16, 8));
		
		
		
		
		
		
		
		
		
		
	}
	

}














