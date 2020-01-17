package Testcases;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataProviderClass.ExcelValues;
import ExcelClasses.MainClass;

public class Test1 {
	MainClass base;
	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws IOException
	{
		//base = new MainClass("C:\\Users\\apoora\\eclipse-workspace\\ExcelTest\\src\\main\\java\\excelUtility\\BaseClass.java");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\apoora\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	
	@DataProvider
	public Iterator<Object[]> getData() throws Exception
	{
		ArrayList<Object[]> s = ExcelValues.readFromExcel();
		return s.iterator();
	}
	
	
	
	@Test(dataProvider="getData",enabled=false)
	public void login(String username , String password) throws Exception
	{
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(5000);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(12000);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(3000);
		int count = ExcelValues.rowcount();
		
		for(int i=1;i<=count;i++)
		{
		if(title.equals("welcome to "))
		{
			Thread.sleep(3000);
			ExcelValues.writeExcel(i, "pass");
			
		}
		
		else
		{
			Thread.sleep(3000);
			ExcelValues.writeExcel(i, "fail");
		}
		
		}
		
	}
	
	@Test
	public void checkExcel() throws IOException
	{
		boolean val = ExcelValues.containsExcel("love");
		System.out.println(val);

	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
