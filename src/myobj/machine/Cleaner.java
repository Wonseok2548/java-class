package myobj.machine;

public class Cleaner implements Electronics_answer{
	
	ElectricSource src;
	int power;
	
	public Cleaner() {
		this.power = 30;
	}
	

	@Override
	public void setConnect(ElectricSource src) {
		// TODO Auto-generated method stub
		this.src = src;
		
	}
	
	

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		
		System.out.println("û�ұ⸦ 1ȸ ����߽��ϴ�.");
		src.consume(power);
		
		return "���� 10��ŭ �����������ϴ�.";
	}

}
