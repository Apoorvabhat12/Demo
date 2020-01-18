package Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class New {

	static int a;
	int b;
	
	static
	{
		a=2;
	}
	
	{
		a=4;
		b=9;
	}
	
	New()
	{
		a=5;
		//System.out.println(a);
		b=7;
	}
	
	static void add()
	{
		a=6;
		System.out.println(a);
		New n = new New();
		n.b=77;
		//n.sub();
		
	}
	
	void sub()
	{
		a=9;
		b=55;
		this.b=8;
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		New z= new New();
		add();
		New z1 = new New();
		z1.sub();
		
}
}
