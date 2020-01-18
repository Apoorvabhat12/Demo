package Demo;

public class StaticKeyword {
	static int b;
	int z;
	static
	{
		int a=10;
		System.out.println("hgfd");
		//b=10;

		
		
	}
	
	
	{
		
		b=20;
		//int a=10;
		z=9;
		System.out.println("gv");
		this.add();
			}
	
	public static void main(String[] args) {

		StaticKeyword sk = new StaticKeyword();
		
		//StaticKeyword sk1 = new StaticKeyword();
		
		//System.out.println(StaticKeyword.b);
		
	}
	
	void add()
	{
		System.out.println("ap");
		b=50;
		z=110;
		sub();
		div();
		
	}
	
	void div()
	{
		
	}
	
	StaticKeyword()
	{
	
		int w=4;
		z=5;
		b=900;
		System.out.println("varma");
		sub();
		this.add();
		
	}

	static void sub()
	{
		int a=10;
		
		System.out.println("hello");
		StaticKeyword aq= new StaticKeyword();
		aq.z=240;
		aq.add();
	
	}
}
