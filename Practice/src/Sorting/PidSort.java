package Sorting;

import java.util.Comparator;

public class PidSort implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		
		if(o1.pid==o2.pid)
			return 0;
		else if(o1.pid>o2.pid)
			return 1;
		else return -1;
	}

	
	
}
