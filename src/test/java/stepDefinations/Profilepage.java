
/*package stepDefinations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ProfileSection;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Profilepage {
	
	public WebDriver driver;

	
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


WebElement msg=driver.findElement(By.className("pad margin no-print"));
        String text=msg.getText();
String expectedText = "Dear admin, the Institution is deleted successfully!";
Assert.assertEquals(text,expectedText);

String actualUrl="http://elearningm1.upskills.in/user_portal.php"; 
String expectedUrl= driver.getCurrentUrl();
 Assert.assertEquals(expectedUrl,actualUrl);



	

//getting text
@And("^getting text$")
public void getting_text() throws Throwable {
WebElement msg=driver.findElement(By.xpath("//div[@class='notification success closeable']"));
String text=msg.getText();
System.out.println(text); //expected text
String expectedText = "You have successfully registered to Real Estate. We have emailed your password to the email address you entered."; //use assertEquals
Assert.assertEquals(text,expectedText);
System.out.println("I didn't get mail"); //close window
driver.close();
}



}*/
