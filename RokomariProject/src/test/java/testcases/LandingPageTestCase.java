package testcases;

import org.testng.annotations.Test;

import pages.LandingPage;
import utilities.BaseDriver;

public class LandingPageTestCase extends BaseDriver{
	
	LandingPage landingPageObj = new LandingPage();
	
	@Test
	public void test1() {
		getDriver().get(landingPageObj.baseUrl);
		
	}

}
