package myobj.machine;

public class Microwave implements Electronics_answer{
	
	ElectricSource src;
	
	String name;
	int power;
	
	 
	
	public Microwave(String name, int power) {
		this.name = name;
		this.power = power;
	}
	
	@Override
	public void setConnect(ElectricSource src) {
		// TODO Auto-generated method stub
		this.src = src;
		
	}

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		
		cook();
		cook();
		cook();
		cook();
		cook();
		
		return "5�� �丮��";
	}

	private void cook() {
		// microwave�� �丮�� ������ ����� ���¿��� ������ �Һ���.
		src.consume(power);
		
	}
}
