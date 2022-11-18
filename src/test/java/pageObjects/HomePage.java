package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver); //super is a keyword used to invoke parent class constructor	
	}
	//elements
	
	@FindBy(xpath="//span[text()='My Account']")
     WebElement lnkMyaccount;
	
	@FindBy(linkText="Register")
	WebElement lnkRegister;
	
	@FindBy(linkText="Login")
	WebElement lnkLogin;
	
	//Action methods
	public void ClickMyaccount() {
		lnkMyaccount.click();
	}
	
	public void ClickRegister() {
		lnkRegister.click();
	}
	public void ClickLogin() {
		lnkLogin.click();
	}
	
}
		
