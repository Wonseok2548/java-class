import java.util.Arrays;

public class C01_function {
	
	// �Լ� (function)
	//	- ����� �̸� �����صΰ� ���߿� ������ ���°�.
	//	- �Լ� �̸� �ڿ� ()�� �ٿ��� �Լ��� ȣ���ϸ� �Լ��� �������� ��ȯ�ȴ�. 
	//	- ���߿� ���� �� ���ɼ��� �ִ� ����� �̸� ���������ν� �ڰ����� �ݺ��� ���δ�.
	
	
	
	public static int appleBasket(int appleNum, int basketSize) {
		int result;
		if (appleNum % basketSize == 0) {
			result = appleNum / basketSize;
		}
		else {
			result = appleNum / basketSize + 1;
		}
		
		// �Լ� Ÿ���� int�̹Ƿ� �����ִ� ���� Ÿ���� int���� �Ѵ�.
		return result;
	}
	
	
	
	// ex: ���� ������ ��� ������ �Է¹����� ���� �� ������ �˷��ִ� �Լ�
	public static int cheapPrice(int[] prices) {
		int min=0;
		
		for (int i=0; i < prices.length; i++) {
			
			if (i == 0) {
				min = prices[i];
			}
			else {
				min = Math.min(min, prices[i]);
			}
			
		}
		
		return min;
	}
	
	
	// ex: ������� ��� ������ �˷��ִ� �Լ�
	public static double avgPrice(int[] prices) {
		int sum = 0;
		
		for (int i=0; i < prices.length; i++) {
			sum += prices[i];
		}
		
		return sum / (double) prices.length;
	}
	
	// ex: ������ ��� ���ݵ��� 10000���� ������Ű�� �Լ�
	public static void raisePrice(int[] prices) {
		for (int i=0; i < prices.length; i++) {
			prices[i] += 10000;
		}
		
		// ����Ÿ���� void�� �Լ��� �������� �ʾƵ� �ȴ�.
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int count = appleBasket(25,10);
		
		System.out.println("�ʿ��� �ٱ��� ���� : " + count);
		
		
		
		int[] apples = {1000, 2000, 989, 1100, 990};
		int[] apples2 = {1500, 2130, 1989, 1135, 996};
		
		
		System.out.println("���� �� ���� : " + cheapPrice(apples) + "��");
		System.out.println("��� ���� : " + avgPrice(apples2) + "��");
		
		
		
		// ��ȯ���� ���� �Լ��� ����� �����ִ�
		raisePrice(apples);
		
		System.out.println(Arrays.toString(apples));
		
		
		
		
		
	

	}
	
}




























