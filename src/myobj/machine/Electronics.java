package myobj.machine;

public interface Electronics {
	
	// ���ڱ�� �������̽�
	
	// 1. ��� ���ڱ��� ���� ������ ���� �� �ִ�.
	
	// 2. ��� ���ڱ��� �ֿܼ� �ѹ� ����� ������ ���� �Һ񷮸�ŭ�� ���⸦ �Һ��Ѵ�.
	
	// 3. ��� ���ڱ��� �����ϰ� �ִ� ������ �ֿܼ� ����Ѵ�.
	
	// �� ���߿� ������ �� �� �ʿ��� �޼������ �����Ѵ�.
	
	
	
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
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				break;
			}
				
		}
		
		
	}
	public static void main(String[] args) {
		Drum_washer LGƮ�� = new Drum_washer();
		
		LGƮ��.brand = "LG";
		LGƮ��.price = 1000000;
		LGƮ��.laundry = 30;
		LGƮ��.power = 50;
		LGƮ��.laundry_moisture = 60;
		
		LGƮ��.wash(30, 10);
		
		LGƮ��.dryMoisture(20);
		
		
		
	}
	
	
	
}




















