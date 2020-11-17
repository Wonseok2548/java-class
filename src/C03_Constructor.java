import java.util.Scanner;

public class C03_Constructor {
	
	// # Ŭ������ ������ (Constructor)
	
	//	- Ŭ������ �̸��� �Ȱ��� �̸��� �Լ� (new�� �Բ� ����Ѵ�.)
	//	- new�� �Բ� �����ڸ� ȣ���ϸ� Ŭ������ ���ǵ� ��� �ν��Ͻ��� �����ȴ�.
	//	- �����ڰ� ��� ����� �Ŀ��� ������ �ν��Ͻ��� �ּҰ� ��ȯ�ȴ�.
	//	- �����ڸ� ���� �������� ������ �⺻ �����ڰ� �ڵ����� �����ȴ�.
	//	�� �⺻ ������ - �Ű������� ���� �����ڰ� 
	
	
	 public static void main(String[] args) {
		Orange o1 = new Orange();
		
		System.out.println(o1.color);
		System.out.println(o1.sweet);
		System.out.println(o1.size);
	
		Strawberry s1 = new Strawberry();
		
		Grape g1 = new Grape(30);
		Grape g2 = new Grape();
		
		
		
		for (int i=0; i < 30; i++) {
			g1.eat();
		}
		
		for (int i=0; i < 20; i++) {
			g2.eat();
		}
		 
	}
	

}

// ���ȵ� �����ڰ� �ִٸ� �⺻�����ڰ� �ڵ����� �������� �ʴ´�.
class Grape {
	int podo;
	int skin;
	
	public Grape(int podo) {
		this.podo = podo;
		this.skin = 0;
		
	}
	
	// �ڵ����� �������� �����Ƿ�, �⺻ �����ڸ� ����ϰ�ʹٸ� ���� �����ؾ� �Ѵ�.
	public Grape() {
		this(20);	
		System.out.println("�⺻ �����ڷ� ���ƿԽ��ϴ�.");
		
		// �����ڿ��� this()�� ���� �ٸ� �����ڸ� ȣ���� �� �ִ�.
		// �ٸ� �����ڴ� �ݵ�� ������ �� ���ٿ��� ȣ���ؾ� �Ѵ�.
	}
	
	public void eat() {
		if (podo ==0) {
			System.err.println("�� ������ �� �Ծ����ϴ�.");
			System.out.printf("���� ���� ������ %d��, ������ %d�� �Դϴ�.\n", podo, skin);
			return;
			
		}
		podo--;
		skin++;
		System.out.printf("���� ���� ������ %d��, ������ %d�� �Դϴ�.\n", podo, skin);
	}
	
}



class Strawberry{
	int seed;
	String color;
}

class Orange {
	
	int sweet;
	int size;
	String color;
	
	//  �� �������� Ư¡
	//	- returnŸ���� ����.
	//	- �ν��Ͻ� �����ÿ� ���� ���� ȣ��ȴ�.
	//	- �ַ� �ν��Ͻ� ���� ���� �ʱ�ȭ�ϴ� �뵵�� ����Ѵ�
	
	
	
	public Orange() {
		// ���ÿ��� Ŭ���� ���ο��� this�� �����ص� �ʵ忡 ������ �� �ִ�.
		sweet = 10;
		size = 5;
		color = "orange";
	}
	
	// # �����ڵ� �Լ�ó�� �����ε��� �����ϴ�.
	//	- �ϳ��� Ŭ������ �پ��� ������ �����ڸ� ������ ���� �� �ִ�.
	public Orange(int sweet, int size, String color) {
		// # this
		//	- Ŭ���� ���ο��� ���� �ν��Ͻ��� ������ �� ����ϴ� Ű����
		
		
		// �ʵ尪�� ������������ ��ġ�� ��� 
		// this�� ���� ����� �������� ��Ȯ�ϰ� ������ �� �ִ�.
		
		
		// �� this�� �������� �ν��Ͻ� ������ �ȴ�.
 		this.sweet = sweet;
		this.size = size;
		this.color = color;
	}
	
	
	
}























