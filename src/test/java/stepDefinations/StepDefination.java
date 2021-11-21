//install tidy gherkin plugin in chrome
//Run feature file- Ru as feature file
//configure convert to cucumber project
//cucumbr option and stepdefanition should have same parent


package stepDefinations;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.AddressDetails;
import pageObjects.NameDetails;
import pageObjects.ProfileSection;
import pageObjects.SigninPage;


public class StepDefination  {

	public WebDriver driver;

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		// System Property for chrome Driver 
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\SAMBHAVA\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe" );
		// Create a new instance of the Chrome driver 
		driver=new ChromeDriver();
	}

	@And("^Navigate to  \"([^\"]*)\" site$")
	public void navigate_to_something_site(String url) throws Throwable {
		//Launch the  WebSite 
		driver.get(url);  
		//Maximize the window
		driver.manage().window().maximize();
		//To scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}

	@And("^Click on Login link in home page to land on Secure sign in Page$")
	public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
		SigninPage l= new SigninPage(driver);
		l.getLoginbtn().click();
	}
	// Login to signin page
	@When("^I entered valid (.+) and valid (.+) logs in$")
	public void i_entered_valid_and_valid_logs_in(String username, String password) throws Throwable {
		SigninPage lp=new SigninPage(driver);
		lp.getUsername().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getSignin().click();
	}

	@Then("^Click on signin button$")
	public void click_on_signin_button() throws Throwable {
		System.out.println("User get signed in");
	}


	//Navigated to profile section
	@And("^click on profilesection$")
	public void click_on_profilesection() throws Throwable {
		SigninPage ps= new SigninPage(driver);
		ps.getProfilebtn().click();   

		System.out.println("Navigated to ProfileSection");

		//clicking on alert
		driver.findElement(By.xpath("//*[@class='notice-dismiss vc-notice-dismiss']")).click();
	}
	// Enabling Admin color schemes
	@Given("^User is in Profile section$")
	public void user_is_in_profile_section() throws Throwable {

		System.out.println("Admin color options is displayed");

	}
	//Enabling Radio buttons
	@When("^click on Default color options$")
	public void click_on_default_color_options() throws Throwable {
		ProfileSection cs =new ProfileSection(driver);
		cs.getdefaultclr().click();//Radio button
		//wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	}

	@And("^click on blue color scheme$")
	public void click_on_blue_color_scheme() throws Throwable {
		ProfileSection bc =new ProfileSection(driver);
		bc.getBlueclr().click();//Radio button
		//wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	}

	@And("^click on Ectoplasm color option$")
	public void click_on_ectoplasm_color_option() throws Throwable {
		ProfileSection e =new ProfileSection(driver);
		e.getEctoplasm().click();//Rdaio button
	}

	@Then("^check the color is changed$")
	public void check_the_color_is_changed() throws Throwable {
		//wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);

		System.out.println("colors are changed");
		//To scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");  
	}

	@And("^click on the check boxes$")
	public void click_on_the_check_boxes() throws Throwable {
		//Enabling keyboard shortcuts  
		WebElement keyboardshortcut = driver.findElement(By.xpath("//*[@id=\"comment_shortcuts\"]"));//check box
		{
			//wait
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);

			// Check whether the Check box is toggled on
			if (keyboardshortcut.isSelected())
			{
				System.out.println("User keyborad shortcut Checkbox is Toggled On");

			}
			else
			{
				System.out.println("User keyborad shortcut Checkbox is Toggled Off");
			}
		} 
		// enabling Toolbar 
		WebElement Toolbar = driver.findElement(By.xpath("//*[@id=\"admin_bar_front\"]"));//check box
		{

			//wait
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			// Check whether the Check box is toggled on
			if (Toolbar.isSelected())
			{
				System.out.println("User Toolbar Checkbox is Toggled On");

			}
			else
			{
				System.out.println("User Toolbar Checkbox is Toggled Off");
			}
		}

		driver.close();//closing browser
	}	


	//Enter Name Details
	@Given("^User is in Name details$")
	public void user_is_in_name_details() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");  

		System.out.println("Enter Name details");  
	}

	//Entering name details
	@Then("^Enter name details$")
	public void enter_name_details() throws Throwable {
		NameDetails fn= new NameDetails(driver);
		//create Actionclass
		Actions action = new Actions(driver);
		//to move the element
		action.moveToElement(fn.getFirstnme()).click(fn.getFirstnme()).keyDown(Keys.CONTROL)
		.sendKeys("a").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).sendKeys("Bhavana").build().perform();

		//Entering last name by removing existed name using actions
		action.moveToElement(fn.getLastnme()).click(fn.getLastnme()).keyDown(Keys.CONTROL)
		.sendKeys("a").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).sendKeys("Samudrala").build().perform();

		action.moveToElement(fn.getNicknme()).click(fn.getNicknme()).keyDown(Keys.CONTROL)
		.sendKeys("a").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).sendKeys("Sam").build().perform();
	}
	//Enabling Drop down box
	@And("^Using dropdown to display name$")
	public void using_dropdown_to_display_name() throws Throwable {
		NameDetails dn= new NameDetails(driver);
		dn.getDisplynme();
		//wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);

		Select select = new Select(dn.getDisplynme());
		//Using select to select by visible text
		select.selectByVisibleText("admin");
	}

	//entering customer billing address details
	@Given("^User is in billing address details$")
	public void user_is_in_billing_address_details() throws Throwable {

		System.out.println("Entering customer billing address details");
	}

	//Entering billing address details
	@When("^Enter all address related details$")
	public void enter_all_address_related_details() throws Throwable {
		AddressDetails Ad =new AddressDetails(driver);

		//create Actionclass
		Actions action = new Actions(driver);
		action.moveToElement(Ad.getCfname()).click(Ad.getCfname()).keyDown(Keys.CONTROL)
		.sendKeys("a").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).sendKeys("Bhavana").build().perform();

		//Using actions to remove exixted details
		action.moveToElement(Ad.getClname()).click(Ad.getClname()).keyDown(Keys.CONTROL)
		.sendKeys("a").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).sendKeys("Samudrala").build().perform();

		//Entering details using sendkeys
		Ad.getCompany().sendKeys("Capgemini");
		Ad.getAddress1().sendKeys("hanamkonda");
		Ad.getCity().sendKeys("Warangal");
		Ad.getpostcode().sendKeys("506001");
	}

	//Enabling Autosuggesions
	@Then("^Use Autosuggesion to enter country name$")
	public void use_autosuggesion_to_enter_country_name() throws Throwable {
		//To scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");  

		//clicking on autosuggession box
		driver.findElement(By.xpath("//*[@id=\"select2-billing_country-container\"]")).click();

		AddressDetails dd =new AddressDetails(driver);
		dd.getcountry().sendKeys("ind");// giving suggesion using sendkeys
		// choosing suggesion using this
		List <WebElement> options =driver.findElements(By.cssSelector(".select2-results__option"));
		//checking
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
		System.out.println("Country India is selected");

		//wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	}

	//Using Autosuggession to select state
	@And("^use Autosuggesion to enter state name$")
	public void use_autosuggesion_to_enter_state_name() throws Throwable {
		//clicking on Autosuggession box
		driver.findElement(By.xpath("//*[@id='select2-billing_state-container']")).click();

		AddressDetails ss =new AddressDetails(driver);
		ss.getState().sendKeys("tel");// Giving Suggesion

		ss.sendkeys(Keys.ARROW_DOWN);// using send keys to down the Arrow
		ss.sendkeys(Keys.ENTER);

		System.out.println("State Telangana is selected");

	}

	@And("^use copy button to copy billing address as shipping$")
	public void use_copy_button_to_copy_billing_address_as_shipping() throws Throwable {

		//wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);

		AddressDetails Cb= new AddressDetails(driver);
		//copying billing address as shipping address
		Cb.getcopybtn().click();
		//To scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", ""); 
	}

	@Then("^billing and shipping address is entered$")
	public void billing_and_shipping_address_is_entered() throws Throwable {
		//To scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", ""); 

		System.out.println("Billing and shipping address is filled");
		//wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);

	}


	//updating the profile
	@Given("^user details are filled$")
	public void user_details_are_filled() throws Throwable {
		//To scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", ""); 

		System.out.println("All the above details are filled");

	}
	@When("^click on update profile button$")
	public void click_on_update_profile_button() throws Throwable {
		//wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		//clicking on update profile button
		driver.findElement(By.id("submit")).click();
	}

	@Then("^profile will be updated$")
	public void profile_will_be_updated() throws Throwable {

		System.out.println("Profile section is updated");//Profile is updated
	}

	//user get logout
	@Given("^User get logout from the section$")
	public void user_get_logout_from_the_section() throws Throwable {
		System.out.println("user can logout") ; 

	}

	@When("^move the cursor on profile section$")
	public void move_the_cursor_on_profile_section() throws Throwable {

		WebElement Profilebtn = driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-my-account\"]/a"));

		//create Actionclass
		Actions builder =new Actions(driver);

		//to move the element
		builder.moveToElement(Profilebtn).build().perform();

	}

	@Then("^click on logout option$")
	public void click_on_logout_option() throws Throwable {
		//wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);

		driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-logout\"]/a")).click();// user get log out

		System.out.println("user get logged out");

	}









}





























