package testcases;

import org.testng.annotations.Test;

import pages.LandingPage;
import pages.LoginPage;
import utilities.BaseDriver;

public class LandingPageTestCase extends BaseDriver{
	
	LandingPage landingPageObj = new LandingPage();
	LoginPage logingPageObj = new LoginPage();
	
	@Test
	public void hoverWriter() throws InterruptedException {
		getDriver().get(landingPageObj.baseUrl);
		landingPageObj.closedBanner();
		landingPageObj.hover(landingPageObj.writerHover);
		Thread.sleep(2000);
	
	}
	
	@Test
	public void selectWriter() throws InterruptedException {
		getDriver().get(landingPageObj.baseUrl);
		landingPageObj.closedBanner();
		landingPageObj.hover(landingPageObj.writerHover);
		Thread.sleep(2000);
		landingPageObj.clickOn(landingPageObj.humayumLink);
		Thread.sleep(2000);
		
	}
	@Test
	public void writerListingSeeMoreButtonClick()  throws InterruptedException{
		getDriver().get(landingPageObj.baseUrl);
		landingPageObj.closedBanner();
		landingPageObj.hover(landingPageObj.writerHover);
		landingPageObj.clickOn(landingPageObj.seeMoreButtonBy);
		Thread.sleep(2000);
				
	}

}
