import java.util.Scanner;
	
	// �ٸ� ��Ű���� �ִ� Ŭ������ ����Ϸ��� �ش� Ŭ������ import�ؾ��Ѵ�.
	
	// �� �ٸ� ��Ű������ �̸� ����� �� �ҽ��� �����ͼ� ����� �� �ִ�.
	//import quiz.A01_printQuiz;
	// A01_printQuiz.main(null);


	// �� ���� ��Ű������ ������ �ҽ��� import���� �ʾƵ� ����� �� �ִ�.
	// A01_Hello.main(null);
	// A02_Escape.main(null);



public class B01_Scanner {
	
	// # Scanner Ŭ����
	//	- ���α׷� �ܺηκ��� �Է��� ���� �� �ִ� ��ɵ��� ���ִ� Ŭ����
	// 	- ��𿡼� �Է��� ������ �����ϰ� �پ��� ������� �Է¹��� �� �ִ�.
	//	- �ַܼκ��� �Է��� ���� ���� System.in�� �̿��Ѵ�.
	
	
	public static void main(String[] args) {
		
		// ���ο� ��ĳ�ʸ� ������ �� ���� sc�� ������ ��ĳ�ʸ� ��� ���´�.
		// ���ο� ��ĳ�ʸ� ������ �� ��𿡼� �Է¹������� ������ �� �ִ�.
		//	System.out	:	�ַܼ� ����ϴ� ��� 
		//	System.in	:	�ֿܼ��� �Է¹޴� ���
		Scanner sc = new Scanner(System.in);

		// next()
		//	- ��ο� �����ϴ� �������� �ϳ��� ������.
		//	- Ÿ���� �ٲ��� �ʴ´�. (String)
		//	- ��ο� �ƹ����� ���ٸ� �Է��� �ɶ����� ��ٸ���.
		
		
		// nextŸ��() 	...		 ex) nextInt
		//	- ��ο� �����ϴ� ���� ���� �ϳ��� ���� �� �ش�Ÿ������ ��ȯ�Ѵ�.
		//	- ��ο� �ƹ� ���� ���ٸ� �Է��� �ɶ����� ��ٸ���.
		//	- ��ο� �����ϴ� ���� ���� �ش� Ÿ���� �� �� ���ٸ� ������ �߻��Ѵ�.
		
		
		// nextLine()
		//	- ��ο� �����ϴ� ���� �� ������ �����´�.
		// 	- �� ���� �����ϴ� ������ '\n'�̴�.
		
		System.out.println("�ƹ� ���̳� �Է��غ����� : ");
		int num = sc.nextInt();
		
		System.out.println("�Է� ���� �� ��� : " + num);
		System.out.println(num + 10);
		System.out.println(num * 10);
		System.out.println(num / 10);
		System.out.println(num / 10.0);
		System.out.println(Math.pow(num, 2));
		
		
		System.out.println("�ι�° ���� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		System.out.println("�ι�° �� ��� : " + num2);
		
		
		
		
		
		
	}
}




















































