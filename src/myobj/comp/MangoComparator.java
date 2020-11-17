package myobj.comp;

import java.util.Comparator;

import myobj.fruit.Mango;


/**
 * 
 * Compare Mango Class by calorie and sweet
 *
 */

public class MangoComparator implements Comparator<Mango>{

	@Override
	public int compare(Mango this_mango, Mango next_mango) {
		
		if (this_mango.getCalorie() > next_mango.getCalorie()) {
			return 1;
		}
		else if (this_mango.getCalorie() < this_mango.getCalorie()) {
			return -1;
		}
		else {
			return 0;			
		}
		
		
		
		
		
		
		
		
	}

}
