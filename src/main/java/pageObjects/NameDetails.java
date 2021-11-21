package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameDetails {
	
	public WebDriver driver;
	
	
	By Firstnme = By.cssSelector("input#first_name");
	By Lastnme = By.cssSelector("input#last_name");
	By Nicknme = By.cssSelector("input#nickname");
	By Displynme = By.id("display_name");
	
	
	public NameDetails(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
		public WebElement getFirstnme()
		{
			return driver.findElement(Firstnme);
		}
		

		public WebElement getLastnme()
		{
			return driver.findElement(Lastnme);
		}
		
		public WebElement getNicknme()
		{
			return driver.findElement(Nicknme);
		}
		
		public WebElement getDisplynme() 
		{
			return driver.findElement(Displynme);
		}
		

	

}
