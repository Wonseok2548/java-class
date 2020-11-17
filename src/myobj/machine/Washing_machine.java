package myobj.machine;

public class Washing_machine implements Electronics {
	
	String brand;
	int price;
	double laundry;
	int power;
	
	public void wash (double laundry, double minute) {		// 10�п� 5���� ��������, �������� �ð��� �ּ� 10�� �̻�
		laundry = this.laundry;
		usePower();
		double afterLaundry = laundry - ((minute / 10) * 5);
		System.out.printf("%d��ŭ�� ������ %d�� ���� �Ͽ���, ���� ������ ���� %d�Դϴ�.\n", laundry, minute, afterLaundry);
	}

	@Override
	public void getPower(int minute) {			// �д� 5�� ������
		// TODO Auto-generated method stub
		System.out.printf("���� ���͸� �ܷ��� %d�Դϴ�. %d�� ���� ������ �����մϴ�.", this.power, minute);
		while (true) {							// power�� 100�̻��� �Ǹ� ���� ����
			power += minute * 5;
			if (power >= 100) {
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				break;
			}
		}
	}

	@Override
	public void usePower() {						// ������ �� �� ��µǵ���.  ���� ��, 20�� ����
		// TODO Auto-generated method stub
		while (true) {
			power -= 20;
			System.out.println("���� ���͸� �ܷ� : " + power);
			if (power <= 0) {
				System.out.println("�����Ǿ����ϴ�. �����ϼ���.");
				break;
			}
		}
		
	}

	@Override
	public void showFunction() {					// �����Ȳ�� �����ֱ� (���͸� �ܷ�, ���� 
		// TODO Auto-generated method stub
		System.out.println("���� ���͸� �ܷ� : " + power);
		System.out.println("���� �� : " + laundry);
		
	}



}









