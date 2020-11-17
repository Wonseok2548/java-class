package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_count_random_fruit {
	
	// 1. ũ�� 100�� �迭�� ���� ���� ���ڿ��� �����غ�����.
	//	  �����ϴ� ���� : apple, banana, orange, peach, kiwi
	// 2. �� ������ �� �� �����ߴ��� ��� ����ϰ� ����غ�����.
	
	public static void main(String[] args) {
		
		int size=100;
		
		String[] fruitNames = new String[] {"apple", "banana", "orange", "peach", "kiwi"};
		
		String[] fruitBox = new String[size];
		
		int apple_count = 0, banana_count = 0, orange_count = 0, peach_count = 0, kiwi_count = 0;
		
		for (int i=0; i<100; i++) {
			fruitBox[i] = fruitNames[(int)(Math.random()*5)]; 				
	
			
		
			if (fruitBox[i] == fruitNames[0]) {
				apple_count++;
			}
			else if (fruitBox[i] == fruitNames[1]) {
				banana_count++;
			}
			else if (fruitBox[i] == fruitNames[2]) {
				orange_count++;
			}
			else if (fruitBox[i] == fruitNames[3]) {
				peach_count++;
			}
			else if (fruitBox[i] == fruitNames[4]) {
				kiwi_count++;
			}
		
		
		}
		
		System.out.println(Arrays.toString(fruitBox));
		
		System.out.println("apple�� ���� Ƚ�� : " + apple_count);
		System.out.println("banana�� ���� Ƚ�� : " + banana_count);
		System.out.println("orange�� ���� Ƚ�� : " + orange_count);
		System.out.println("peach�� ���� Ƚ�� : " + peach_count);
		System.out.println("kiwi�� ���� Ƚ�� : " + kiwi_count);
		
		
		System.out.println("---------------����� �ڵ�---------------");
		
		// ����� �ڵ�
		int[] count = new int[5];
		int fruit_kind = fruitNames.length;
		
		for (int i=0; i<size; i++) {
			
			for (int j=0; j<fruit_kind; j++) {
				
				if (fruitNames[j].equals(fruitBox[i])) {
					count[j] += 1;
					break;
				}
				
				
			}
			
		}
		
		// ���谡 ���� �� count�� ����ؾ� �Ѵ�.
		for (int i=0; i < count.length; i++) {
			System.out.printf("%s : %dȸ\n", fruitNames[i], count[i]);
		}
		
		// # enum�� ����
		int apple = 0;
		int banana = 1;
		int orange = 2;
		
		System.out.println("�������� ��ȣ : " + orange);
		System.out.println("�������� ��� ����? : " + count[orange]);
		System.out.println("������ �̸� : " + fruitNames[orange]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
