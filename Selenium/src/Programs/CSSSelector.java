package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\apoora\\Music\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 
		 driver.findElement(By.cssSelector("div.a4bIc>input")).sendKeys("life");

	}

}
