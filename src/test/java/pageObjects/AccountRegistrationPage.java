package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(name="firstname")
     WebElement txtfirstname;
	
	@FindBy(name="lastname")
	WebElement txtlastname;
	
	@FindBy(name = "email")
	WebElement txtemail;
	
	@FindBy(name = "telephone")
	WebElement txtTelephone;
	
	@FindBy(name = "password")
	WebElement txtpwd;
	
	@FindBy(name = "confirm")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkdplcy;
	
	@FindBy(xpath="//input[@value='Continue']")////button[text()='Continue']
	WebElement btncontinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgconfrmtn;
	
	public void setFirstname(String fname) {
		txtfirstname.sendKeys(fname);
	}
	public void setLastName(String lname) {
		txtlastname.sendKeys(lname);

	}

	public void setEmail(String email) {
		txtemail.sendKeys(email);

	}
	public void setTelephone(String tel) {
		txtTelephone.sendKeys(tel);

	}

	public void setPassword(String pwd) {
		txtpwd.sendKeys(pwd);

	}
	public void setConfirmPassword(String pwd) {
		txtConfirmPassword.sendKeys(pwd);

	}

	public void setPrivacyPolicy() {
		chkdplcy.click();

	}
	public void Clickcontinue() {
		btncontinue.click();

	}
	public String getConfirmationMsg() {
		try {
			return (msgconfrmtn.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

	}
	
	
}
