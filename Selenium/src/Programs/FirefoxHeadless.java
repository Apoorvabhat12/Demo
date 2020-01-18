package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxHeadless {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\apoora\\Pictures\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		FirefoxOptions options = new FirefoxOptions();
		//options.setHeadless(true);
		
		options.addArguments("--headless");
		
		
		WebDriver driver = new FirefoxDriver(options);
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		

	}

}
