package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class List {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add("gv");
		a.add("ap");
		a.add("ha");
		a.add("ok");
		a.add(1);
	//	System.out.println(a);
		
		LinkedList<String> l = new LinkedList<String>();
		l.add("aa");
		l.add("ss");
		l.add("dd");
		
	
	//	System.out.println(l);
		
		Vector<String> v = new Vector<String>();
		v.add("qq");
		v.add("pp");
		v.addElement("hh");
		v.addElement("uu");
		System.out.println(v);
		
			
		ListIterator<String> it = v.listIterator();
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}

	}

}
