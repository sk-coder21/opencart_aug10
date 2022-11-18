package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyaccountPage;
import testBase.Baseclass;

public class TC_002_Logintest extends Baseclass {
	
	@Test(groups= {"Sanity","Master"})
	public void test_Login() {
		
		try {
		
		logger.info("***Starting TC_002_Logintest***");
		
		HomePage hp=new HomePage(driver);
		hp.ClickMyaccount();
		hp.ClickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("email")); 
		lp.setpassword(rb.getString("pwd"));
		lp.clickLogin();
		MyaccountPage mp=new MyaccountPage(driver);
		boolean targetpage=mp.isMyaccountPageExists();
		Assert.assertEquals(targetpage, true);
		}
		catch(Exception e) {
			Assert.fail();
			logger.error(e);
		}
		logger.info("***Finished_TC_002_Logintest***");
}
}
