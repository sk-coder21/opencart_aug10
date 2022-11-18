package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyaccountPage;
import testBase.Baseclass;
import utilities.DataProviders;

public class TC_003_Login_DDT extends Baseclass {
  @Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
  public void test_LoginDDT(String email,String pwd,String exp) {
	  
	  logger.info("***Strating Login Test DDt***");
	  try {
	  HomePage hp=new HomePage(driver);
		hp.ClickMyaccount();
		hp.ClickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(email); 
		lp.setpassword(pwd);
		lp.clickLogin();
		
		MyaccountPage mp=new MyaccountPage(driver);
		boolean targetpage=mp.isMyaccountPageExists();
		if (exp.equals("valid")) {
			if (targetpage == true) {
				mp.clickLogout();
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		}

		if (exp.equals("Invalid")) {
			if (targetpage == true) {
				
				mp.clickLogout();
				Assert.assertTrue(false);
			} else {
				Assert.assertTrue(true);
			}
			
}
	  }catch(Exception e) {
		  Assert.fail();
	  }
		
		 logger.info("***finished Login Test DDt***");	
  
}
}

