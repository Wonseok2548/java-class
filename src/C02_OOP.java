import java.util.Scanner;

import myobj.fruit.Kiwi;
import myobj.vehicle.Car;

public class C02_OOP {
	
	// # ��ü���� ���α׷��� (OOP : Object Oriented Programming)
	//	- ���� �����ϴ� ��� �͵��� ������ �Լ��� ǥ���Ϸ��� ���α׷��� ���
	//	- ������ �Լ��� ���к��ϰ� ����ϱ� ���ٴ� 
	//	  ���ǿ� �����ϴ� ��üó�� ���̵��� �Ͽ� �������� �ø���.
	//	- ��ü(Object) : ���� �����ϴ� ��� ������ ���Ѵ�.
	//					(�繰, ����, �˰��� ���...)
	
	// ex: �л�
	//	- �л��� ���� : ����, ����, Ű, ����, ...
	//	- �л��� �޼���
	//		-> ������ ģ�� (�ֽ� �������� ������Ʈ)
	//		-> 1���� ������ (�г��� �ö�)
	//		-> �����Ѵ� (���̸� �԰� �г��� �״��)
	//		-> ������� ģ�� (���� ������ ���� ���� ���ΰ� �ٸ�)
	
	
	// ex: ���
	//	- ����� ���� : ũ��, ����, ��Ȯ ��¥, �絵, ���� Į�θ�, ������, ...
	//	- ����� �޼��� : 
	//		-> �Դ´� (ũ��, Į�θ� ��ȭ)
	//		-> ���� (����, �絵 ��ȭ)
	//		-> ������ (������ �������� ���� �¾��� �� ���� ������ �޶�����.)
	
	//	�� �޼��� : ��ü�� ������ ������ ��ġ�� �Լ��� �޼����� �θ���.
	
	//	# Ŭ���� (Class)
	
	//	- ��ü�� ���α׷��� ���� ǥ���� ��
	//	- Ŭ������ ��ü�� ���赵�̴� (������ ���������� ��ü�� ����)
	//	- Ŭ������ ���� �����ϴ� ���� ��ü�� '�ν��Ͻ�'��� �θ���.
	//	- Ŭ������ ������ ���� Ÿ���̴�.
	//	  (���� ��� Ŭ������ ����ٸ� ��� Ÿ���� ����� �� �ְԵȴ�.)
	
	public static void main(String[] args) {
		
		
		// Scanner ���赵�� ��ü(Scanner�� �ν��Ͻ�)�� �����
		// �� ��ü�� �ּҸ� ���� sc�� ����
		Scanner sc = new Scanner(System.in);
		
		Apple apple01 = new Apple();
		Apple apple02 = new Apple();
		Apple apple03 = new Apple();
		
		// Ŭ���� Ÿ�� �迭�� ���� �������� �ν��Ͻ��� �������� �ʾҴ�.
		// (�迭�� ��ü�� ������)
		Apple[] appleBox = new Apple[10];
		
		
		// ��� �迭�� ����� ��ü�� ����
		for (int i=0; i < appleBox.length; i++) {
			appleBox[i] = new Apple();
		}
		
		
		apple02.sweet = 10;
		apple03.sweet = 8;
		
		// ��ü�� �������Ƿ� �̸� ����� �� ���赵 ��� ����� �� �ִ�.
		apple01.birthday = "2020/10/19";
		apple01.size = 10;
		apple01.calorie = apple01.size * 10;
		apple01.color = "red";
		apple01.sweet = 7;
		
		apple01.eat();
		apple02.eat();
		apple03.eat();
		
		System.out.println("============================================");
		// 1. myobj.fruit ��Ű���� Ŭ���� �ϳ� �����ϰ� �ν��Ͻ��� �����غ�����.
		
		// 2. myobj.vehicle ��Ű���� Ŭ������ �ϳ� �����ϰ� �ν��Ͻ��� �����غ�����.
		
		// �� �� Ŭ������ ���� 3�� �̻� �޼��� 1�� �̻� 
		
		
		Kiwi kiwi01 = new Kiwi();
		
		kiwi01.size = 100;
		kiwi01.calorie = 200;
		kiwi01.weight = 50;
		
		System.out.println("kiwi");
		kiwi01.eat();

		
		Car sonata = new Car();
		sonata.price = 3000;
		sonata.oil = 100;
		sonata.mileage = 2000;
		
		System.out.println("Car");
		sonata.drive();
		
		
		
	}
	
}
// �鿩���⸦ �� ������ٸ� �߰�ȣ�� ���� Ŭ���� �ٱ��� ���� ������ �� �ִ�.

class Apple {
	
	// # �ν��Ͻ� ����
	//	- ��� �ν��Ͻ����� ���� �ٸ� ���� ������ �ִ� ����
	//	- �ʵ�, ��� ����, �ν��Ͻ� ����, ���� ..
	
	int size;
	int sweet;
	int calorie;
	int damage;
	String color;
	String birthday;
	
	// �� �ν��Ͻ� �޼���
	//	- �ν��Ͻ� ������ Ȱ���ϴ� �޼���
	void eat() {
		System.out.println(this.sweet + "��ŭ ����� ���������ϴ�.");
		this.size -= 1;
		this.calorie -= 10;
		System.out.printf("ũ�� : %d, ���� Į�θ� : %d\n", this.size, this.calorie);
	}
	
	
	
	
	
	
}


















