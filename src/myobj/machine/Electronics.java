package myobj.machine;

public interface Electronics {
	
	// 전자기기 인터페이스
	
	// 1. 모든 전자기기는 전력 공급을 받을 수 있다.
	
	// 2. 모든 전자기기는 콘솔에 한번 출력할 때마다 전력 소비량만큼의 전기를 소비한다.
	
	// 3. 모든 전자기기는 실행하고 있는 동작을 콘솔에 출력한다.
	
	// ※ 나중에 가져다 쓸 때 필요한 메서드들을 정의한다.
	
	
	
	void usePower();

	void getPower(int minute);
	
	void showFunction();

}


interface Dry {
	
	void dryMoisture(int minute);
}




class Drum_washer extends Washing_machine implements Electronics, Dry {
	
	double laundry_moisture;
	
	@Override
	public void dryMoisture(int minute) {
		// TODO Auto-generated method stub
		while (true) {
			laundry_moisture = laundry_moisture - (minute*(laundry_moisture*0.1));
			
			if (laundry_moisture <= 0) {
				System.out.println("건조가 완료되었습니다.");
				break;
			}
				
		}
		
		
	}
	public static void main(String[] args) {
		Drum_washer LG트롬 = new Drum_washer();
		
		LG트롬.brand = "LG";
		LG트롬.price = 1000000;
		LG트롬.laundry = 30;
		LG트롬.power = 50;
		LG트롬.laundry_moisture = 60;
		
		LG트롬.wash(30, 10);
		
		LG트롬.dryMoisture(20);
		
		
		
	}
	
	
	
}




















