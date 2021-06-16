package testcases.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
	
	public WebDriver driverSettings() {
		//System.setProperty("webdriver.chrome.driver", "/opt/chromedriver File PATH");
		//System.setProperty("webdriver.chrome.driver","/home/vin/Downloads/chromedriver");
		System.setProperty("webdriver.chrome.driver","/home/neebal/Downloads/chromedriver"); 
		WebDriver driver = new ChromeDriver(options);
		ChromeOptions options = new ChromeOptions();
                options.addArguments("start-maximized"); // open Browser in maximized mode
                options.addArguments("disable-infobars"); // disabling infobars
                options.addArguments("--disable-extensions"); // disabling extensions
                options.addArguments("--disable-gpu"); // applicable to windows os only
                options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
                options.addArguments("--no-sandbox"); // Bypass OS security model
                //WebDriver driver = new ChromeDriver(options);
                //driver.get("https://google.com");
		return driver;
	}

}
