package myobj.vehicle;

public class Car {
	
	public double price;
	public int oil;
	public int mileage;
	
	public Car(int price, int oil) {
		this.price = price;
		this.oil = oil;
	}
	
	public Car() {
		this(2000, 50);
		System.out.println("�⺻ �����ڷ� ���ƿԽ��ϴ�.");
	}
	public void drive() {
		price *= 0.9;
		oil -= 1;
		mileage += 11;
		System.out.printf("������ �߰� ���� : %.2f, �ܿ� �⸧ : %d, ����Ÿ� : %d\n", this.price, this.oil, this.mileage);
	}

}
