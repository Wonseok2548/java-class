package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_count_random_fruit {
	
	// 1. 크기 100의 배열에 랜덤 과일 문자열을 저장해보세요.
	//	  등장하는 과일 : apple, banana, orange, peach, kiwi
	// 2. 각 과일이 몇 번 등장했는지 모두 기록하고 출력해보세요.
	
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
		
		System.out.println("apple이 나온 횟수 : " + apple_count);
		System.out.println("banana가 나온 횟수 : " + banana_count);
		System.out.println("orange가 나온 횟수 : " + orange_count);
		System.out.println("peach가 나온 횟수 : " + peach_count);
		System.out.println("kiwi가 나온 횟수 : " + kiwi_count);
		
		
		System.out.println("---------------강사님 코드---------------");
		
		// 강사님 코드
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
		
		// 집계가 끝난 후 count를 출력해야 한다.
		for (int i=0; i < count.length; i++) {
			System.out.printf("%s : %d회\n", fruitNames[i], count[i]);
		}
		
		// # enum의 시초
		int apple = 0;
		int banana = 1;
		int orange = 2;
		
		System.out.println("오렌지의 번호 : " + orange);
		System.out.println("오렌지가 몇번 등장? : " + count[orange]);
		System.out.println("오렌지 이름 : " + fruitNames[orange]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
