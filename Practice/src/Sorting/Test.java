package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Product> al = new ArrayList<Product>();
		
		al.add(new Product(111,"aa",1000));
		al.add(new Product(999,"zz",8000));
		al.add(new Product(333,"ss",5000));
		al.add(new Product(244,"pp",2000));
		
		Collections.sort(al);
		//Collections.reverse(al);
		
		for(Product p:al)
		{
			System.out.println(p.pid + " " + p.name + " " + p.cost);
		}

	}

}
