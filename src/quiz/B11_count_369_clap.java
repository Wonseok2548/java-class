package quiz;

import java.util.Scanner;

public class B11_count_369_clap {

	// ����ڷκ��� ���� �ϳ��� �Է¹ް�
	// �ش� ���ڱ��� 3,6,9 ������ ����ȴٸ� �ڼ��� �� ��� �ľ��ϴ��� ���Ͻÿ�.


	public static void main(String[] args) {

		// # ���α׷� ����ð� ����
		long start_time = System.currentTimeMillis();


		System.out.print("���� �Է� : ");
		int user = new Scanner(System.in).nextInt();

		int clap = 0;


		for (int i = 1; i <= user; i++) {	// i�� ���� user����.
			int check = i;


			while (check != 0) {

				int digit = check % 10; 		// �̰ɷ� ��� 1���ڸ� �Ǵ�. 		1
				int b = check / 10;				// a�� ��� ������ �� ���. 		0

				if (digit == 3 || digit == 6 || digit == 9) {
					clap++;

				}

				// check = i - digit;

				// ���� user�� 120

				check = check / 10;
				//i = i/10;		// 12	1

				/*if (i <= 0)
				break;*/


			}


		}		

		System.out.println(clap);
		
		long end_time = System.currentTimeMillis();
		
		System.out.println("�ɸ��ð� : " + (end_time - start_time));
		

	}
}
