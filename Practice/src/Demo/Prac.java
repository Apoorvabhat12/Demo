package Demo;
interface P
{
	void add();
	void sub();
	
}

interface Q
{
	void mul();
	void div();
}

interface R
{
	void zz();
}
 
abstract class As implements P,Q
{
	static int a=10;
	int b=20;
	public void add()
	{
		a= a + b;
		System.out.println(a + " " +b);
	
	}
	
	public void mul()
	{
		System.out.println("ll");
	}
	
}

abstract class Bs extends As implements R
{

	@Override
	public void sub() {
		
		
	}

	
	
	
}

public class Prac {
	
	
	public static void main(String[] args) {
		
	
		As s = new As();
		s.add1();
		s.add2();
		
		
		System.out.println("-----------");
		As s1 = new As();
		s1.add1();
		s1.add2();
		
				
		
		
	}

}
