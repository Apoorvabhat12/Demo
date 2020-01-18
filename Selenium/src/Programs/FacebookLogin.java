package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\apoora\\Music\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.name("email")).sendKeys("ap");
		
		String name = driver.findElement(By.name("email")).getAttribute("class");
		System.out.println(name);
		
	}

}
