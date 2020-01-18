package Testng;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SkipTest {

	
	@Test
	public void check()
	{
		String a = "skip";
		if(a.equals("skip"))
		{
		throw new SkipException("Skipping - This is not ready for testing ");
	 }
	else{
	 System.out.println("I am in else condition"); 
	 }
	 System.out.println("I am out of the if else condition");
	 }

	@Test
	public void second()
	{
	System.out.println("I am fine"); 
	}
	

	@AfterMethod
	public void end()
	{
		System.out.println("end");
	}
}
