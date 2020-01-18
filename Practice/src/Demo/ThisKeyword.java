package Demo;

public class ThisKeyword {
	
	int a=10;
	public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword();
		tk.add();
		sub();

	}
	
	ThisKeyword()
	{
		
		this.add();
		
		System.out.println("1112233");
		this.mul();
	}
	
	ThisKeyword(int a)
	{
		System.out.println("gvvv");
	}
	
	void add()
	{
		
		System.out.println("jjfj");
		this.sub();
		this.mul();
	}
	
	
	static void sub()
	{
		System.out.println("qqqqqq");
		
		
	}

	static void mul()
	{
		System.out.println("oooooooooooooo");
	}
}
