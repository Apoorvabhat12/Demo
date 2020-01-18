package Demo;



 class Z
{
	Z()
	{
		this(5);
		System.out.println("aaaaaaa");
		this.add();
		
	}
	
	Z(int a)
	{
		System.out.println("zzzz");
	}
	
	void add()
	{
		
	}

}

class X extends Z
{
	X()
	{
		System.out.println("ccccc");
	}
	X(int s)
	{
		super();
		super.add();
		System.out.println("bbbbb");
		
	}
	 void sub()
	{
		
		//super.add();
	}
	
	
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X b = new X(6);
		b.add();
	}

}
