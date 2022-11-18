package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyaccountPage extends BasePage {

	public MyaccountPage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath="//h2[text()='My Account']")
     WebElement msgHeading;
	@FindBy(xpath="//div[@class='list-group']//a[text()='Logout']") ////a[@class='list-group-item'][text()='Logout']
	WebElement lnklogout;
	
	public boolean isMyaccountPageExists() {
		
		try {
		return(msgHeading.isDisplayed());	
		
		} catch(Exception e) {
			
			return false;
		}
			
	}
	public void clickLogout() {
		lnklogout.click();
	}

	
}
