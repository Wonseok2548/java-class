package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import myobj.student.Student;

public class D01_StudentList {

	// �л� Ŭ������ ��ҷ� ���� ArrayList��(group) �����ϰ�
	// �л��� 30�� �߰��غ�����.
	
	// 1. 30���� ������ �ڵ����� �����ǵ��� ��������.
	
	// 2. ��� �л��� �� ������ ��� ������ ���غ�����.
	
	// 3. �� ����� ���غ�����
	
	// 4. �̸� ���� ��Ģ
    //		�׽�Ʈ�л�0000
    //		�׽�Ʈ�л�0001 
    //		�׽�Ʈ�л�0002
	
	
	public static void main(String[] args) {
		
		ArrayList<Student> group01 = new ArrayList<>(30);
		
		int num_of_students = 30;
		
		double sum =0;
		for (int i=0; i<30; i++) {
			group01.add(new Student());
			sum += group01.get(i).getAvg();
		}
		
		// println �Լ��� ��� �ش� ��ü�� toString() �޼��带 ȣ���Ѵ�.
		System.out.println(group01);
		System.out.println("�� ��� : " + sum / (double)num_of_students );
	}
	
	
}

// myobj�� �Ű���.------------------------------------------------------------------------------------------------

//class Student {
//	int kor, eng, math;
//	int total;
//	double avg;
//	String name;
//	
//	final static int NUM_OF_SUBJECTS = 3;
//	static int stu_count = 0;
//	
//	public Student() {
//		Random ran = new Random();
//		kor = ran.nextInt(51)+50;
//		eng = ran.nextInt(51)+50;
//		math = ran.nextInt(51)+50;
//		name = String.format("�׽�Ʈ�л�%04d", stu_count++);		// %0����d : ���ڸ�ŭ ĭ�� Ȯ���� �� ����Ѵ�.
//																	// �� default�� A05_print.java�� ����
//		
//		total = kor + eng + math;
//		avg = total / (double)NUM_OF_SUBJECTS;
//		
//	}
//	
//	// �� toString()�� Object Ŭ������ �޼����̱� ������ 
//	//	 ��� ��ü�� �������ִ�.
//	@Override
//	public String toString() {
//		// �� ��ü�� ���ڿ��� ǥ���Ѵٸ� �����ϱ�? �� ���� ���Ǹ� �ϴ� �޼���
//		
//		
//		// String.format()
//		// printfó�� ������ �̿��Ͽ� ���ϴ� ���ڿ��� �����ϴ� �޼���
//		
//		// return "[" + name + "/" + total + "/" + avg + "]";
//		
//		return String.format("[%s/%d/%.2f]\n", name, total, avg);
//		
//		
//		
//	}
//	
//}
	
	



















