package Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection {

	public static void main(String[] args) {
		
		ArrayList<String> s = new ArrayList<String>();
		
		s.add("g");
		s.add("r");
		
		ListIterator<String> it = s.listIterator();
		Iterator i = s.iterator();
		i.add("ap");
		//it.next();
		it.add("gv");
		System.out.println(s);
		
		ListIterator it1 = s.listIterator();        
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}

	}

}
