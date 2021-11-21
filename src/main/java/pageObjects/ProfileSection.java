package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfileSection {

	public WebDriver driver;
	
	By defaultclr = By.xpath("//*[@id='admin_color_fresh']");
	By Blueclr = By.xpath("//*[@value='blue']");
	By Ectoplasm = By.xpath("//*[@id='admin_color_ectoplasm']");
	
	
	
	public ProfileSection(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public WebElement getdefaultclr()
	{
		return driver.findElement(defaultclr);
	}
	public WebElement getBlueclr()
	{
		return driver.findElement(Blueclr);
	}
	public WebElement getEctoplasm()
	{
		return driver.findElement(Ectoplasm);
	}
	
	
	
	
	
	
	
	
	
}
