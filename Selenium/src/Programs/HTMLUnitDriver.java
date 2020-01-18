package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\apoora\\Music\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		 WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.google.com");
		

	}

}
