package Demo;

public class Exception {

	void add()
	{
		try
		{
			int a=50/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("here");
		}
		
		catch(Exception e)
		{
			
		}
	}
	public static void main(String[] args) {
		
		Exception e = new Exception();
		e.add();
		

	}

}
