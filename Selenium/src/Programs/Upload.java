package Programs;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\apoora\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.timesjobs.com/candidate/register.html");
		driver.findElement(By.id("resumeFile_basic")).click();
		Runtime.getRuntime().exec("C:\\Users\\apoora\\Documents\\File.exe");

	}

}
