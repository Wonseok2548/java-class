package myobj.fruit;

public class Apple {
	int calorie;
	String color;
	

	
	public Apple(String color) {
		calorie = 300;
		
		if (!color.equals("red")) {
			throw new InvalidColorException();
		}
	}
	
	public Apple eat() throws NoMoreCalorieException {			
		if (calorie <= 0) {
			throw new NoMoreCalorieException();
			}
	 
		
		System.out.println("¸ÀÀÖ°Ô Àß ¸Ô¾ú½À´Ï´Ù.");
		calorie -= 100;
		return this;
	}
	
	public static void main(String[] args) {
		try {
			new Apple("red").eat().eat().eat();			
		}
		catch (NoMoreCalorieException e) {
			System.out.println(e.getMessage());
		}
	}

}
