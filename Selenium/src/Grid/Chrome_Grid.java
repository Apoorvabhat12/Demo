package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Chrome_Grid {
	WebDriver driver;
	
	@BeforeMethod
	@Parameters("browserType")
	public void setup(String browserType) throws MalformedURLException
	{
		DesiredCapabilities dr = new DesiredCapabilities();
		
		if(browserType.equals("firefox")){
			dr=DesiredCapabilities.firefox();
			dr.setBrowserName("firefox");
			
			        dr.setPlatform(Platform.WINDOWS);
			     
		    }else{
			
			            dr=DesiredCapabilities.chrome();
			            dr.setBrowserName("chrome");
		
			            dr.setPlatform(Platform.WINDOWS);
					        }

		
		String huburl = "http://192.168.43.37:4444/wd/hub";
		
		 driver = new RemoteWebDriver(new URL(huburl),dr);
		
		
		
	}
	
	@Test
	public void test1()
	{
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
	}
	
	@Test
	public void test2()
	{
		driver.get("https://www.facebook.com");
		System.out.println("test2----");
	}
	
	@Test
	public void test3()
	{
		driver.get("https://www.gmail.com");
		System.out.println("test3----");
	}
	

	@AfterMethod
	public void teardown()
	{
		driver.quit();
		
	}
}
