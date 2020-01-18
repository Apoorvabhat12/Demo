package Programs;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\apoora\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		
		//options.addArguments("--headless");
		//options.addArguments("screenshot");
		//options.setBinary(new File("C:\\Users\\apoora\\Downloads\\chromedriver_win32\\chromedriver.exe"));
		//options.addArguments("--disable-infobars");

		//options.setExperimentalOption("useAutomationExtension", false);
		//options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));    
		WebDriver driver = new ChromeDriver();
		
		
		/*driver.get("https://www.facebook.com");
	    driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL +"t");

	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1)); //switches to new tab
	    driver.get("https://www.google.com");
		*/
	    
		driver.get("https://www.facebook.com");   //0
		((JavascriptExecutor)driver).executeScript("window.open()");  //1
		
		Set<String> s = driver.getWindowHandles();
		System.out.println(s);
		
		ArrayList<String> tabs = new ArrayList<String>(s);
	    driver.switchTo().window(tabs.get(1));
	    
	    driver.get("https://google.com");   
	    
	    ((JavascriptExecutor)driver).executeScript("window.open()");    //2
	    
	    Set<String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		
		ArrayList<String> tabs1 = new ArrayList<String>(s1);
		
	
	    driver.switchTo().window(tabs1.get(2));
	 
	    driver.get("https://gmail.com"); 
	    
	    driver.switchTo().window(tabs1.get(0));
	    
	    System.out.println(driver.getTitle());
	    
		
		//username.sendKeys("apoo");
		
	//	username.sendKeys(Keys.TAB);
		
	//	driver.findElement(By.id("pass")).sendKeys("123");
		
		//username.sendKeys(Keys.F5);
		
		
		/*Actions a = new Actions(driver);
		//a.moveToElement(username).perform();
		//a.sendKeys("apoo").perform();
		a.sendKeys(Keys.TAB).perform();
		a.sendKeys("123").perform();
		a.sendKeys(Keys.TAB).perform();
		a.sendKeys(Keys.ENTER).perform();
		
		
		/*
		
		String val = username.getAttribute("value");
		
		System.out.println(val);
		
		String att = username.getAttribute("name");
		
		System.out.println(att);
		
		//Thread.sleep(5000);
		
		//System.out.println(driver.getTitle());*/

	}

}
