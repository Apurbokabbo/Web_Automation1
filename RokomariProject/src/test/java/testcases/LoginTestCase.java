package testcases;


import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.BaseDriver;

public class LoginTestCase extends BaseDriver{
	
	
	LoginPage logingPageObj = new LoginPage();
	
	@Test
	public void loginWithValidEmailInfo() throws InterruptedException {
		getDriver().get(logingPageObj.loginPageUrl);
		
		logingPageObj.loginWithMobileEmail(logingPageObj.email,logingPageObj.password);
		
	}
	
	@Test
	public void loginwithValidPhoneInfo() throws InterruptedException {
		getDriver().get(logingPageObj.loginPageUrl);
		
		logingPageObj.loginWithMobileEmail(logingPageObj.mobile,logingPageObj.password);
		
	}
	
	@Test
	public void loginWithValidMailWrongPW() throws InterruptedException {
		getDriver().get(logingPageObj.loginPageUrl);
		logingPageObj.loginWithMobileEmail(logingPageObj.email,"12345678");
		logingPageObj.assertionHard(logingPageObj.wrongWarningMessageLocator, logingPageObj.wrongWarningMessage);	
		
	}
	@Test
	public void loginWithoutAnyData() throws InterruptedException {
		
		getDriver().get(logingPageObj.loginPageUrl);
		Thread.sleep(6000);
		try {
			logingPageObj.clickOn(logingPageObj.bannerCloseButtonBy);
			
		} 
		catch (Exception e) {
			System.out.println("Banner not found");
		}
		Thread.sleep(2000);
		logingPageObj.clickOn(logingPageObj.signInButton);
		//Thread.sleep(2000);
		System.out.println(logingPageObj.getText(logingPageObj.warningMessagePasswordLocator));
		
		logingPageObj.assertionHard(logingPageObj.warningMessageMailLocator, logingPageObj.waringMessage);
		//logingPageObj.assertionHard(logingPageObj.warningMessagePasswordLocator, logingPageObj.waringMessage);
		
		
	}

}
