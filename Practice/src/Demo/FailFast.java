package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFast {

	public static void main(String[] args) {
		
		List<String> a = new ArrayList<String>();
		a.add("ap");
		a.add("gv");
		a.add("love");
		a.add("baby");
		a.add("aa");
	
		
		Iterator<String> i = a.iterator();
		
		while(i.hasNext())
		{
			String str =  i.next();
			if(str.equals("gv"))
			{
		    a.remove(str);
			}  
			
		}
		
			System.out.println("\nThe ArrayList elements are: ");
		      for (String s: a) {
		         System.out.println(s); 
		      }

	}
	
	/*
	 * List<Integer> integers = new CopyOnWriteArrayList<>();
integers.add(1);
integers.add(2);
integers.add(3);
Iterator<Integer> itr = integers.iterator();
while (itr.hasNext()) {
    Integer a = itr.next();
    integers.remove(a);
}

List<String> list2 = Collections.unmodifiableList(list);  

	 */
	}


