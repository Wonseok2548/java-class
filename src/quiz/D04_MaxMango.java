package quiz;


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import myobj.comp.MangoComparator;

import myobj.fruit.Mango;
import myobj.student.Student;


public class D04_MaxMango {
	// # 생성시 칼로리와 당도가 랜덤으로 설정되는 망고 클래스를 하나 생성하고
	//	 100개의 망고 중 칼로리가 가장 높은 망고를 선택해보세요.
	
	// ※ 만약 칼로리가 같은 경우 더 높은 당도를 가진 인스턴스를 선택해야 함.
	
	public static void main(String[] args) {
		
		List<Mango> mango = new LinkedList<>();
		
		
		for (int i=0; i<100; i++) {
			mango.add(new Mango());
		}
		
//		Collections.sort(mango, new MangoComparator());
//		System.out.println(mango);
		
		Collections.sort(mango, new Comparator<Mango>() {

			@Override
			public int compare(Mango o1, Mango o2) {
				return (int)Math.ceil(o1.getCalorie() - o2.getCalorie());
			}
			
		});
		
		Collections.max(mango,new Comparator<Mango>() {

			@Override
			public int compare(Mango o1, Mango o2) {
				// TODO Auto-generated method stub
				return (int)Math.ceil(o1.getCalorie() - o2.getCalorie());
			}
			
		});
		
		
		System.out.println(mango);
		
		
		
		
		
		
	}

}
