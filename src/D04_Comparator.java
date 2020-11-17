import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import myobj.comp.StudentComparatorA;
import myobj.student.Student;

public class D04_Comparator {
	
	public static void main(String[] args) {
		
		List<String> words = new LinkedList<>();
		
		words.add("airplane");
		words.add("jet");
		words.add("coffee");
		words.add("glasses");
		words.add("oriental");
		
		Collections.sort(words);
		System.out.println(words);
		
		List<Student> group = new LinkedList<>();
		
		group.add(new Student());
		group.add(new Student());
		group.add(new Student());
		group.add(new Student());
		group.add(new Student());
		
		Collections.sort(group, new StudentComparatorA());		// sort를 할 때 정렬기준이 있어야 함  --> Student 클래스에서 compareTo() 
		
		System.out.println(group);
		
		System.out.println("----------------------------------------------------------------");
		
		Collections.sort(group, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return (int)Math.ceil(o1.getAvg() - o2.getAvg());
			}
			
		});
		
		
		System.out.println(group);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}























