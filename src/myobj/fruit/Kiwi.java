package myobj.fruit;


// ��Ŭ���� �ϳ��� ���� �ϳ��� �ٶ����ϴ�
public class Kiwi {
	
	public int size;
	public int calorie;
	public int weight;
	
	public Kiwi(int size) {
		this.size = size;
		
	}
	
	public Kiwi() {
		this(5);	
		System.out.println("�⺻ �����ڷ� ���ƿԽ��ϴ�.");
		
		// �����ڿ��� this()�� ���� �ٸ� �����ڸ� ȣ���� �� �ִ�.
		// �ٸ� �����ڴ� �ݵ�� ������ �� ���ٿ��� ȣ���ؾ� �Ѵ�.
	}
	
	public void eat() {
		size -= 5;
		calorie -= 30;
		weight -= 15;
		System.out.printf("ũ�� : %d, ���� Į�θ� : %d, ���� : %d\n", this.size, this.calorie, this.weight);
	}

}
