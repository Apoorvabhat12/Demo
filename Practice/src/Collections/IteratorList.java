package Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorList {

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("gv");
		a1.add("apoo");
		a1.add("kulli");
		a1.add("ragi");
		a1.add("baby");
		a1.add("love");
		
		
		
		ListIterator<String> l = a1.listIterator();
		
		while(l.hasNext())
		{
			String s = l.next();
			
			int c = l.nextIndex();
			
			if(c==3)
			{
				l.add("gaurav");
			}
			
			
		}
		
	
		System.out.println(a1);
		

	}

}
