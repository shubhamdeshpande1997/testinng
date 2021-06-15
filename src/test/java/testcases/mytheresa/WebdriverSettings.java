package testcases.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
	
	public WebDriver driverSettings() {
		//System.setProperty("webdriver.chrome.driver", "/opt/chromedriver File PATH");
		System.setProperty("webdriver.chrome.driver","driver = webdriver.Chrome(executable_path='/home/chromedriver')"); 
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
