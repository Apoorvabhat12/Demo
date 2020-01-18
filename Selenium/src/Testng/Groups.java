package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Groups {
	
	
	@Test(groups= {"abc"})
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(groups= {"abc"})
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test(groups= {"def"})
	public void test3()
	{
		System.out.println("test3");
	}
	
	@Test(groups= {"def"})
	public void test4()
	{
		System.out.println("test4");
	}
	
	@Test(groups= {"xyz"})
	public void test5()
	{
		System.out.println("test5");
	}
	
	@Test(groups= {"xyz"})
	public void test6()
	{
		System.out.println("test6");
	}
	
	@Test
	public void test7()
	{
		System.out.println("test7");
	}
	
	@Test
	public void test8()
	{
		System.out.println("test8");
	}
	
	

}
