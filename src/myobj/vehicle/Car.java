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
		System.out.println("기본 생성자로 돌아왔습니다.");
	}
	public void drive() {
		price *= 0.9;
		oil -= 1;
		mileage += 11;
		System.out.printf("감가된 중고 가격 : %.2f, 잔여 기름 : %d, 주행거리 : %d\n", this.price, this.oil, this.mileage);
	}

}
