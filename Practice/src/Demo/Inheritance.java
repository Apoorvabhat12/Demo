package Demo;

class A
{
	   void add()
	  {
		  System.out.println("a");
	  }
	   
	
	
	
	
}

class B extends A
{
	
	int add()
	{
		int a = 6;
		int b =7;
		int sum = a+b;
		return sum;
	}
	
	void sub()
	{
		
		System.out.println("var");
	}
}


public class Inheritance {

	public static void main(String[] args) {
		
		B a = new B();
		a.add();
		int s = a.add();
		
		
		
				
	}

}
