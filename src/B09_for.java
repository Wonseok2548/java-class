
public class B09_for {

	
	public static void main(String[] args) {
		
		// # �ݺ���
		//	- for, while, do-while(X), for each
		//	- �Ȱ��� �ڵ带 ������ �ݺ��ϰ� ���� �� ����Ѵ�.
		
		/* # for (�ʱⰪ; ����; ������) {
				��� ������ true�� ���� �ݺ��� ��ɾ���� ���� ��
				}
		*/
		
		
		// 1. ���� �⺻���� ����
		//	- ���ϴ� Ƚ����ŭ �ݺ��ϴ� ���
		//	- �ʱⰪ�� 0�� �ְ�, ���ǿ��� �ݺ��ϰ���� Ƚ���� ���´�.
		//	- ������ 1�� �Ѵ�.
		
		for (int i =0; i < 5000; i++) {
			System.out.println("hello world!" + i);
			}
		
		
		// 2. �ʱⰪ�� �������� ��ġ�� ������� ������ �� �ִ�.
		for (int i = 10; i < 33; i += 2) {
			System.out.println("hello" + i);
		}
		
		for (int i = 9000; i > 0; i -= 100) {
			System.out.println("minus" + i);
		}
		
		
		// 3. �������� �������� ��ġ�� ������� ������ �� �ִ�.
		int num = 0;
		for (; num < 100;)
		{
			System.out.println("hi");
			++num;
		}
		
		
		// 4. ������ �ٸ� ������ �����Ӱ� ����� �� �ִ�.
		for (int month = 1; month <= 12; ++month) {
			switch (month) {
			case 1: case 2: case 12:
				System.out.printf("%d���� �ܿ��Դϴ�.\n", month);
				break;
			default:
				System.out.printf("%d���� ���� �������� �ʾҽ��ϴ�.\n", month);
				break;
			}
		}
		
		
		
		// 5. ������ ��������� ���� �ݺ��Ѵ�. (���ǿ� true�� �־ ���ѹݺ��Ѵ�.)
		num = 0;
		for (;;) {
			System.out.println(num += 9999);
			
			if (num > 200000)
				break;
		}
	
		
		// 6. continue�� �̿��ϸ� �ݺ����� ��ŵ�� �� �ִ�.
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				continue;
			
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		
		
		
		
		
		for (int i = 0; i < 100; i++) {
			System.out.printf("%-3d", i);
			
			if (i % 10 != 9)
				continue;
			
			System.out.println();
		}
		
		
		
		// 7. �ݺ������� ���� ���ϱ�.
		//	(1). ������ ������ ������ �����ϰ� 0���� �ʱ�ȭ�Ѵ�.
		//	(2). �ݺ����� ���� �ش� ������ ���� ������Ų��.
		
		int sum = 0;
		
		for (int i = 80; i <= 333; i++) {
			if (i % 3 == 0)					// i�� 3�� ����� ��
				sum += i;					// sum = sum + i�� �ݺ��Ѵ�.
		}									// 3, 3+6=9, 9+12=21, 21+15=37 ....				
		System.out.println(sum);

		
		
	
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}








































