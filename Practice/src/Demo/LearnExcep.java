package Demo;

import java.io.InterruptedIOException;

public class LearnExcep extends RuntimeException{

	public static void main(String[] args) {
		
		try
		{
			Thread.sleep(1000);
			int a = 50/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("here");
		}
		catch(InterruptedException e)
		{
			System.out.println("here!!!!");
		}
		
	}

}
