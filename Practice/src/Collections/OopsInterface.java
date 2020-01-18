package Collections;

abstract class A
{
	abstract void m1();
	abstract void m2();
	
	interface it1
	{
		//int b;
		void m3();
	}
}

abstract class B extends A 
{
	void m1()
	{
		System.out.println("hh");
	}
}

abstract class C extends B 
{
	void m2()
	{

		System.out.println("zz");
	}
	
	
}

class D extends C implements A.it1
{
	public void m3()
	{

		System.out.println("qq");
	}
}

public class OopsInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c = new D();
		c.m1();
		c.m2();
		//c.m3();

	}

}
