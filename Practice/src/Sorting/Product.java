package Sorting;

import java.util.Comparator;

public class Product implements Comparable<Product>{
	
	int pid;
	String name;
	int cost;
	
	
	public Product(int pid, String name, int cost) {
		super();
		this.pid = pid;
		this.name = name;
		this.cost = cost;
	}


	@Override
	public int compareTo(Product o) {
		if(o.pid == pid)
			return 0;
		else if(o.pid>pid)
			return 1;
		else return -1;
	}


	


	


	
	
}
