package testcases;

import org.testng.annotations.Test;

import pages.CartPage;
import pages.LandingPage;
import pages.LoginPage;
import pages.ShippingPage;
import utilities.BaseDriver;

public class ShippingPageTeseCase extends BaseDriver{
	
	ShippingPage shippingPageObj = new ShippingPage();
	LoginPage logingPageObj = new LoginPage();
	LandingPage landingPageObj = new LandingPage();
	CartPage cartPageObj = new CartPage();
	
	@Test
	public void visitShippingPage() throws InterruptedException{
		getDriver().get(logingPageObj.loginPageUrl);
		
		logingPageObj.loginWithMobileEmail(logingPageObj.email,logingPageObj.password);
		Thread.sleep(2000);
		shippingPageObj.clickOn(landingPageObj.cartButton);
		Thread.sleep(2000);
		shippingPageObj.clickOn(cartPageObj.placeOrderButton);
		Thread.sleep(2000);
		
	}
	
	@Test
	public void shippingPageDataFillUp() throws InterruptedException{
		getDriver().get(logingPageObj.loginPageUrl);
		
		logingPageObj.loginWithMobileEmail(logingPageObj.email,logingPageObj.password);
		Thread.sleep(2000);
		shippingPageObj.clickOn(landingPageObj.cartButton);
		Thread.sleep(2000);
		shippingPageObj.clickOn(cartPageObj.placeOrderButton);
		Thread.sleep(2000);
		shippingPageObj.clickOn(shippingPageObj.pickupPointOffice);
		Thread.sleep(1000);
		shippingPageObj.writeText(shippingPageObj.alternativePhoneField,shippingPageObj.alternativePhone);
		Thread.sleep(1000);
		shippingPageObj.clickOn(shippingPageObj.cityLocator);
		Thread.sleep(2000);
		shippingPageObj.scrollingDownTillElementfound(shippingPageObj.cityDropDownValueSelect);
		Thread.sleep(2000);
		shippingPageObj.clickOn(shippingPageObj.cityDropDownValueSelect);
		Thread.sleep(2000);
	    shippingPageObj.selectValueFromDropUsingText(shippingPageObj.areaLocator,shippingPageObj.areaText);
	    Thread.sleep(2000);
	    shippingPageObj.selectValueFromDropUsingText(shippingPageObj.zoneLocator, shippingPageObj.zoneText);
	    Thread.sleep(2000);
	    shippingPageObj.writeText(shippingPageObj.addressField, shippingPageObj.address);
	    Thread.sleep(2000);
	    shippingPageObj.clickOn(shippingPageObj.giftWrapCheckBox);
	    Thread.sleep(1000);
	    shippingPageObj.writeText(shippingPageObj.promoCodeField, shippingPageObj.promoCode);
	    Thread.sleep(1000);
	    shippingPageObj.clickOn(shippingPageObj.promoCodeApplyButton);
	    Thread.sleep(1000);
	    shippingPageObj.scrollingDownTillElementfound(shippingPageObj.paymentVisa);
	    Thread.sleep(2000);
	    shippingPageObj.scrollUp();
	    Thread.sleep(3000);
	    shippingPageObj.clickOn(shippingPageObj.paymentBkash);
	    Thread.sleep(2000);
	    shippingPageObj.clickOn(shippingPageObj.conditionCheckbox);
	    Thread.sleep(2000);
	    shippingPageObj.clickOn(shippingPageObj.profileLocator);
	    Thread.sleep(2000);
	    shippingPageObj.clickOn(shippingPageObj.signOutLocator);
	    Thread.sleep(3000);

	
	}
	
	

}
