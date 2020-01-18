package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	WebDriver driver;
	
	@Test(dependsOnMethods= {"login3","login4"})
	public void login1()
	{
		System.out.println("start1");
		
		
	}
	
	@Test()
	public void login2()
	{
		System.out.println("start2");
		
		
	}
	
	@Test(dependsOnMethods= {"login2"})
	public void login3()
	{
		System.out.println("start3");
		
	}
	
	@Test()
	public void login4()
	{
		System.out.println("start4");
		
	}
	
	
}
