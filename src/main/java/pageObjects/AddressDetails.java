package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressDetails {

	
	public WebDriver driver;
	
	By Cfname = By.id("billing_first_name");
	By Clname = By.id("billing_last_name");
	By Company = By.cssSelector("input#billing_company");
	By Address1 = By.id("billing_address_1");
	By City     = By.id("billing_city");
	By postcode = By.cssSelector("input#billing_postcode");
	By country = By.cssSelector(".select2-search__field");
	By State   = By.xpath("/html/body/span/span/span[1]/input");
	By copybtn = By.id("copy_billing");
	

	public AddressDetails(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public WebElement getCfname()
	{
		return driver.findElement(Cfname);
	}
	public WebElement getClname()
	{
		return driver.findElement(Clname);
	}
	public WebElement getCompany()
	{
		return driver.findElement(Company);
	}
	public WebElement getAddress1()
	{
		return driver.findElement(Address1);
	}
	public WebElement getCity ()
	{
		return driver.findElement(City );
	}
	public WebElement getpostcode()
	{
		return driver.findElement(postcode);
	}
	public WebElement getcountry()
	{
		return driver.findElement(country);
	}
	public WebElement getState()
	{
		return driver.findElement(State);
	}
	public WebElement getcopybtn()
	{
		return driver.findElement(copybtn);
	}



	public void sendkeys(Keys arrowDown) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
