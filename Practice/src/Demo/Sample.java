package Demo;

import java.util.Arrays;
import java.util.Objects;

public class Sample {

	static int i;
	int j;
	
	static
	{
		int k=2;
		i=20;
		
	}
	
	{
		int k=2;
		i=20;
		j=30;
		add();
		sub();
	}
	
	 Sample()
	{
		int k=2;
		i=20;
		j=30;
		add();
		sub();
		
	}
	
	void add()
	{
		int k=2;
		i=20;
		j=30;
		sub();
	}
	
	static void sub()
	{
		int k=2;
		i=20;
		Sample s = new Sample();
		s.j=40;
		s.add();
		
	}
	
	public static void main(String args[])
	{
		
	}
	
}

