package myobj.fruit;

import java.util.Random;



public class Mango{
	
	int calorie, sweet;
	String name;
	
	static int mango_count = 0;
	
	public Mango() {
		Random ran = new Random();
		calorie = ran.nextInt(100)+100;
		sweet = ran.nextInt(30)+70;
		
		name = String.format("¸Á°í%02d", mango_count++);
	}
	
	
	public int getCalorie() {
		return this.calorie;
	}
	
	public int getSweet() {
		return this.sweet;
	}

	public String toString() {
		return String.format("[%s/%d/%d]\n", name, getCalorie(), getSweet());
		
		
	}

}
