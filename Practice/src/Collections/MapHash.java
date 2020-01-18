package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapHash {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(11, "aa");
		hm.put(12, "ad");
		hm.put(13, "at");
		hm.put(14, "aj");
		hm.put(15, "al");
		
		Set<Integer> s = hm.keySet();
		System.out.println(s);
		
		Collection<String> v = hm.values();
		System.out.println(v);
		
		Iterator iterator = hm.entrySet().iterator();
		
        while (iterator.hasNext()) {
        	
             Map.Entry me2 = (Map.Entry) iterator.next();
          System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());

	}
	}
}
