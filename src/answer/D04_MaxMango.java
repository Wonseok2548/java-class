package answer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import myobj.fruit.Mango_answer;

public class D04_MaxMango {
	
	public static void main(String[] args) {
		
		List<Mango_answer> mangos = new ArrayList<>(100);
		
		for (int i=0; i < 100; i++) {
			mangos.add(new Mango_answer());
		}
		
		Mango_answer most_delicious = Collections.max(mangos);
		
		System.out.println("°¡Àå ¸ÀÀÖ´Â ¸Á°íÀÇ Ä®·Î¸® : " + most_delicious.calorie);
		System.out.println("°¡Àå ¸ÀÀÖ´Â ¸Á°íÀÇ ´çµµ : " + most_delicious.sweet);
		
	}

}
