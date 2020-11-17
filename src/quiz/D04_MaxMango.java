package quiz;


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import myobj.comp.MangoComparator;

import myobj.fruit.Mango;
import myobj.student.Student;


public class D04_MaxMango {
	// # ������ Į�θ��� �絵�� �������� �����Ǵ� ���� Ŭ������ �ϳ� �����ϰ�
	//	 100���� ���� �� Į�θ��� ���� ���� ���� �����غ�����.
	
	// �� ���� Į�θ��� ���� ��� �� ���� �絵�� ���� �ν��Ͻ��� �����ؾ� ��.
	
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
