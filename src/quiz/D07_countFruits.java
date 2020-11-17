package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class D07_countFruits {
	
	private enum Fruit {
		APPLE,
		BANANA,
		ORANGE,
		KIWI
	}
	
	// 다음 리스트를 이용해 각 과일이 몇개인지를 저장한 Map을 생성해 보세요.
	
	static List<Fruit> fruits;
	
	static {
		fruits = new ArrayList<>();
		
		for (int i=0; i < 50; i++) {
			fruits.add(Fruit.values()[(int)(Math.random() * 4)]);
		}
	}
	
//	public static void main(String[] args) {
//		
//		int apple_count = 0, banana_count=0, orange_count=0, kiwi_conunt=0;
//		
//		for (int i=0; i < fruits.size(); i++) {
//			System.out.println(fruits.get(i));
//			
//			if (fruits.get(i).equals(Fruit.APPLE)) {
//				apple_count += 1;
//			}
//			else if (fruits.get(i).equals(Fruit.BANANA)) {
//				banana_count++;
//			}
//			else if (fruits.get(i).equals(Fruit.ORANGE)) {
//				orange_count++;
//			}
//			else if (fruits.get(i).equals(Fruit.KIWI)) {
//				kiwi_conunt++;
//			}
//			
//			
//		}
//		
//		Map<String, Integer> FruitMap = new HashMap<>();
//		FruitMap.put("APPLE", apple_count);
//		FruitMap.put("BANANA", banana_count);
//		FruitMap.put("ORANGE", orange_count);
//		FruitMap.put("KIWI", kiwi_conunt);
//		
//		System.out.println(FruitMap);
//		
//		
//	}
	
	public static void main(String[] args) {
		Map<Fruit, Integer> fruit_count_map = new HashMap<>();
		
		for (Fruit fruit : Fruit.values()) {
			int freq = Collections.frequency(fruits, fruit);
			fruit_count_map.put(fruit, freq);
			
		}			
		System.out.println(fruit_count_map);
	
		
	}
	

}




































