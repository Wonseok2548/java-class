package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import myobj.student.Student;

public class D01_StudentList {

	// 학생 클래스를 요소로 갖는 ArrayList를(group) 생성하고
	// 학생을 30명 추가해보세요.
	
	// 1. 30명의 점수가 자동으로 설정되도록 만들어보세요.
	
	// 2. 모든 학생의 총 점수와 평균 점수를 구해보세요.
	
	// 3. 반 평균을 구해보세요
	
	// 4. 이름 생성 규칙
    //		테스트학생0000
    //		테스트학생0001 
    //		테스트학생0002
	
	
	public static void main(String[] args) {
		
		ArrayList<Student> group01 = new ArrayList<>(30);
		
		int num_of_students = 30;
		
		double sum =0;
		for (int i=0; i<30; i++) {
			group01.add(new Student());
			sum += group01.get(i).getAvg();
		}
		
		// println 함수는 사실 해당 객체의 toString() 메서드를 호출한다.
		System.out.println(group01);
		System.out.println("반 평균 : " + sum / (double)num_of_students );
	}
	
	
}

// myobj로 옮겼음.------------------------------------------------------------------------------------------------

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
//		name = String.format("테스트학생%04d", stu_count++);		// %0숫자d : 숫자만큼 칸을 확보한 뒤 출력한다.
//																	// ※ default에 A05_print.java에 있음
//		
//		total = kor + eng + math;
//		avg = total / (double)NUM_OF_SUBJECTS;
//		
//	}
//	
//	// ※ toString()은 Object 클래스의 메서드이기 때문에 
//	//	 모든 객체가 가지고있다.
//	@Override
//	public String toString() {
//		// 이 객체를 문자열로 표현한다면 무엇일까? 에 대한 정의를 하는 메서드
//		
//		
//		// String.format()
//		// printf처럼 서식을 이용하여 원하는 문자열을 생성하는 메서드
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
	
	



















