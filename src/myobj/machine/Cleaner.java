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
		
		System.out.println("청소기를 1회 사용했습니다.");
		src.consume(power);
		
		return "방이 10만큼 깨끗해졌습니다.";
	}

}
