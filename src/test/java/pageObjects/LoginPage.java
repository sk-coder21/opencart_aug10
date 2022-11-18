package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmailAddress;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPwd;
	
	@FindBy(xpath="//input[@value='Login']")
    WebElement btnLogin;
	
	public void setEmail(String Email) {
		txtEmailAddress.sendKeys(Email);
	}
	
	public void setpassword(String pwd) {
		txtPwd.sendKeys(pwd);
	}
	public void clickLogin() {
		btnLogin.click();
	}
}
