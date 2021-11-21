package Resources;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {

	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver()
	{
		// System Property for chrome Driver 
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SAMBHAVA\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");  
		// Create a new instance of the Chrome driver 
		driver= new ChromeDriver();
		//execute in chrome driver
		return driver;	
	}
}
