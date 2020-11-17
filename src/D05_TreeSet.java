import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import myobj.fruit.Mango_answer;

public class D05_TreeSet {

	// # TreeSet
	//	- �ߺ����� ������ �� ����. (set�� Ư¡)
	//	- �����͸� ������ �� ������������ �����Ѵ�.
	//	- ��ҷ� null�� ������� �ʴ´�. (������ ���� �ʱ� ������)
	//	- ����ӵ��� ���� ���, ������ ����/�˻� �ӵ��� ������.
	
	// �� �ߺ����� + ���ϴ� �κ� ���� ���� + ũ�� ����
	
	public static void main(String[] args) {
		
		TreeSet<Mango_answer> sweet_mango_tree = new TreeSet<>(new Comparator<Mango_answer>() {

			@Override
			public int compare(Mango_answer o1, Mango_answer o2) {		
				// Set�� ���� �����͸� ������� �ʱ� ������,
				// ���� �絵�� ���� ���� ��� ������� �ȴ�. ( => Set�� �ߺ��� ������.)
				// return o1.sweet - o2.calorie;
				
				// ���� �絵�� ������ ���� ����id�� �������� �����ϱ�
				int sweet_value = o1.sweet - o2.sweet;
				
				
				// id��� hashCode()�� ����ص� �ȴ�. (�ش� ��ü�� �����ϰ� ������ �� ����)
				return sweet_value == 0 ?
						o1.hashCode() - o2.hashCode() : sweet_value;
				
				
		
			}
	
		}); 
		
		for (int i=0; i<1000; i++) {
			sweet_mango_tree.add(new Mango_answer());
			
		}
		System.out.println(sweet_mango_tree);
		System.out.println("TreeSet�� ����� ���� : " + sweet_mango_tree.size());
		
		
		
		// Comparable���� return 0�� ���� ��ü���� �ǹ��Ѵ�.
		Set<Mango_answer> basic_comp_tree = new TreeSet<>();
		
		for (int i=0; i<1000; i++) {
			basic_comp_tree.add(new Mango_answer());
		}
		System.out.println("Basic tree�� ����� ���� : " + basic_comp_tree.size());
		
		
		
		// TreeSet Ȱ��
		
		
		// descendingSet : ������������ ���ĵ� Set�� ��ȯ
		System.out.println(sweet_mango_tree.descendingSet());
		
		
		
		
		
		
		// # TreeSet�� ���ϴ� �������� ������ ����ϱ�
		
		// HeadSet(toElement) : �� �պ��� ���ϴ� ���ر����� Set�� ��ȯ		
		SortedSet<Mango_answer> hSet = sweet_mango_tree.headSet(new Mango_answer(0, 5, 500));
		System.out.println("headSet�� ���� : " + hSet.size());
		
		
		// tailSet(freomElement) : ���ϴ� ���غ��� �� ������������ Set�� ��ȯ
		SortedSet<Mango_answer> tSet = sweet_mango_tree.tailSet(new Mango_answer(0, 5, 1000));
		System.out.println("tSet�� ���� : " + tSet.size());
		
		
		SortedSet<Mango_answer> h_tSet = tSet.headSet(new Mango_answer(0, 8, 1000));
		System.out.println("h_tSet�� ���� : " + h_tSet.size());
		
		SortedSet<Mango_answer> t_tSet = tSet.tailSet(new Mango_answer(0, 8, 1000));
		System.out.println("t_tSet�� ���� : " + t_tSet.size());
		
		
		// subSet(from, to)
		SortedSet<Mango_answer> result = sweet_mango_tree.
				subSet(new Mango_answer(0, 7, 1000), new Mango_answer(0, 9, 1000));
		
		System.out.println(result);
		
		
		// # TreeSet��Ҹ� �ϳ��� �����ϱ�
		TreeSet<Integer> int_tree = new TreeSet<>();
		
		int_tree.add(99);
		int_tree.add(1);
		int_tree.add(75);
		int_tree.add(3);
		int_tree.add(40);
		int_tree.add(11);
		
		
		
		
		// higher, ceiling	
		//	- �ش� �� �������� ���� ����� ū ���� �ϳ� ��ȯ
		//	- ���� ���� �ִٸ� �ش� ���� ��ȯ�Ѵ�.
		System.out.println(int_tree.ceiling(11));
		System.out.println(int_tree.higher(11));
		
		
		
		// lower, flooer	
		//	- �ش� �� �������� ���� ����� ���� ���� �ϳ� ��ȯ
		//	- ������ ���� ���� ���� �����Ѵ�.		
		System.out.println(int_tree.floor(11));
		System.out.println(int_tree.lower(11));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}
}
