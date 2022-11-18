package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.Baseclass;

public class TC_001_AccountRegistrationtest extends Baseclass {
	
    @Test(groups= {"Regression","Master"})
	public void test_account_registration() throws InterruptedException {
    	logger.debug("application log...");
    	
    	logger.info("***Starting TC_001_account_registration ***");
    	
    	try {
    	HomePage hp=new HomePage(driver);
    	hp.ClickMyaccount();
    	logger.info("clicked on myaccount");
    	hp.ClickRegister();
    	logger.info("clicked on register");
    	AccountRegistrationPage ap=new AccountRegistrationPage(driver);
    	logger.info("providing customer data");
    	ap.setFirstname(randomeString().toUpperCase());
    	
    	ap.setLastName(randomeString().toUpperCase());
    	
        ap.setEmail(randomeString()+"@gmail.com");
    	
    	ap.setTelephone(randomeNumber());
    	
    	String pwd=randomAlphaNumeric();
    	ap.setPassword(pwd);
    	ap.setConfirmPassword(pwd);
    	
    	ap.setPrivacyPolicy();
    	
    	ap.Clickcontinue();
    	logger.info("clicked on continue");
    	String confrmmsg=ap.getConfirmationMsg();
    	logger.info("validating expected message");
    	AssertJUnit.assertEquals(confrmmsg, "Your Account Has Been Created!");
    	}
    	catch(Exception e ) {
    		logger.error("test failed");
    		AssertJUnit.fail();
    	}
    	logger.info("***Finished TC_001_account_registration ***");
	}
	
	
	
}
