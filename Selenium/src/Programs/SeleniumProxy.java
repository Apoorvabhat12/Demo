package Programs;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumProxy {

	public static void main(String[] args) {
		
		
				//ChromeOptions option = new ChromeOptions();
				DesiredCapabilities option = new DesiredCapabilities();
				Proxy proxy = new Proxy();
				proxy.setHttpProxy("localhost:5555");
				
				option.setCapability(CapabilityType.PROXY, proxy);
				
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\apoora\\Pictures\\geckodriver-v0.26.0-win64\\geckodriver.exe");	
				 
				WebDriver  driver  = new FirefoxDriver(option);
				
				 driver.get("https://www.inviul.com/");


			}

	}
