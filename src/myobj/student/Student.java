package myobj.student;

import java.util.Random;

public class Student implements Comparable<Student> {	// StudentŸ���� ��
	// �ܺ� Ŭ�������� �ʵ��� ���� ������ ������� �ʴ°��� �� �� ��ü�������̴�.
	// (�ܺ� Ŭ������ ���� �ִ� �͸� ����� �� �ְԲ� �����ϴ� ���� �̻����̴�.)
	int kor, eng, math;
	int total;
	double avg;
	String name;
	
	final static int NUM_OF_SUBJECTS = 3;
	static int stu_count = 0;
	
	public Student() {
		Random ran = new Random();
		kor = ran.nextInt(51)+50;
		eng = ran.nextInt(51)+50;
		math = ran.nextInt(51)+50;
		name = String.format("�׽�Ʈ�л�%04d", stu_count++);		// %0����d : ���ڸ�ŭ ĭ�� Ȯ���� �� ����Ѵ�.
																	// �� default�� A05_print.java�� ����
		
		total = kor + eng + math;
		
		
	}
	

	public double getAvg() {
		return kor + eng + math / (double) NUM_OF_SUBJECTS;
	}
	
	// �� toString()�� Object Ŭ������ �޼����̱� ������ 
	//	 ��� ��ü�� �������ִ�.
	@Override
	public String toString() {
		// �� ��ü�� ���ڿ��� ǥ���Ѵٸ� �����ϱ�? �� ���� ���Ǹ� �ϴ� �޼���
		
		
		// String.format()
		// printfó�� ������ �̿��Ͽ� ���ϴ� ���ڿ��� �����ϴ� �޼���
		
		// return "[" + name + "/" + total + "/" + avg + "]";
		
		return String.format("[%s/%d/%d/%d/%.2f]\n", name, kor, eng, math, getAvg());
		
		
		
	}
	
	
	// ���� ������ ���� ����� �� �տ� �������� �����ϼ���.
	
	public int compareTo(Student next_student) {		// ���� �л��� �Ű������� �޾ƿͼ� ���Ѵٴ� �ǹ�
		// "�� Ŭ������ ũ�� �񱳸� �̷������� �ϰڴ�"�� �����ϴ� ��
		//	- ����� ���� : ���� ��ü�� ���� ��ü���� �� ŭ (�ڷ� ������)
		//	- ������ ���� : ���� ��ü�� ���� ��ü���� �� ���� (������ ������)
		//	- 0�� ����	  : ���� ��ü�� ���� ��ü�� ũ�Ⱑ ����
		
		
		if (this.eng > next_student.eng) {
			// ���� ������ �� ū �л��� ���� �� �ڿ� �������� ���ڴٴ� �� 
			return 1;
		}
		else if (this.eng < next_student.eng) {
			// ���� ������ �� ���� �л��� ���� �� ������ �������� ���ڴٴ� ��
			return -1;
		}
		else {
			// ���� ������ ���� ���� �׳� ������ �ΰڴٴ� ��
			return 0;
		}
		
		
	}
	
	
	
	
	
//	public int compareTo(Student next_student) {		// ���� �л��� �Ű������� �޾ƿͼ� ���Ѵٴ� �ǹ�
//		// "�� Ŭ������ ũ�� �񱳸� �̷������� �ϰڴ�"�� �����ϴ� ��
//		//	- ����� ���� : ���� ��ü�� ���� ��ü���� �� ŭ (�ڷ� ������)
//		//	- ������ ���� : ���� ��ü�� ���� ��ü���� �� ���� (������ ������)
//		//	- 0�� ����	  : ���� ��ü�� ���� ��ü�� ũ�Ⱑ ����
//		
//		
//		if (this.math > next_student.math) {
//			// ���� ������ �� ū �л��� ���� �� �ڿ� �������� ���ڴٴ� �� 
//			return 1;
//		}
//		else if (this.math < next_student.math) {
//			// ���� ������ �� ���� �л��� ���� �� ������ �������� ���ڴٴ� ��
//			return -1;
//		}
//		else {
//			// ���� ������ ���� ���� �׳� ������ �ΰڴٴ� ��
//			return 0;
//		}
//		
//		
//	}
	
}
		
	
























