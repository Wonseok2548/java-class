package myobj.machine;

public class Washing_machine implements Electronics {
	
	String brand;
	int price;
	double laundry;
	int power;
	
	public void wash (double laundry, double minute) {		// 10분에 5벌씩 빨래가능, 빨래가능 시간은 최소 10분 이상
		laundry = this.laundry;
		usePower();
		double afterLaundry = laundry - ((minute / 10) * 5);
		System.out.printf("%d만큼의 빨래를 %d분 동안 하였고, 남은 빨래의 양은 %d입니다.\n", laundry, minute, afterLaundry);
	}

	@Override
	public void getPower(int minute) {			// 분당 5씩 충전됨
		// TODO Auto-generated method stub
		System.out.printf("현재 배터리 잔량은 %d입니다. %d분 동안 충전을 시작합니다.", this.power, minute);
		while (true) {							// power가 100이상이 되면 충전 종료
			power += minute * 5;
			if (power >= 100) {
				System.out.println("충전이 완료되었습니다.");
				break;
			}
		}
	}

	@Override
	public void usePower() {						// 빨래를 할 때 출력되도록.  빨래 시, 20씩 감소
		// TODO Auto-generated method stub
		while (true) {
			power -= 20;
			System.out.println("남은 배터리 잔량 : " + power);
			if (power <= 0) {
				System.out.println("방전되었습니다. 충전하세요.");
				break;
			}
		}
		
	}

	@Override
	public void showFunction() {					// 진행상황을 보여주기 (배터리 잔량, 빨래 
		// TODO Auto-generated method stub
		System.out.println("현재 배터리 잔량 : " + power);
		System.out.println("빨래 양 : " + laundry);
		
	}



}









