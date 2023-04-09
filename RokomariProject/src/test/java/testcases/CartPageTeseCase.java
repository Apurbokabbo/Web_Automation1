package testcases;

import org.testng.annotations.Test;

import pages.CartPage;
import pages.LandingPage;
import pages.LoginPage;
import utilities.BaseDriver;

public class CartPageTeseCase extends BaseDriver {
	
	CartPage cartPageObj = new CartPage();
	LandingPage landingPageObj = new LandingPage();
	LoginPage loginPageObj = new LoginPage();
	
	@Test
	public void visitCartPage() throws InterruptedException {
		getDriver().get(cartPageObj.cartPageUrl);
		Thread.sleep(3000);
		
	}
	
	@Test
	public void landingPageToCartPage() throws InterruptedException {
		
		getDriver().get(landingPageObj.baseUrl);
		Thread.sleep(3000);
		landingPageObj.closedBanner();
		Thread.sleep(2000);
		cartPageObj.clickOn(landingPageObj.cartButton);
				
	}
	
	@Test
	public void goToCartAsLogin() throws InterruptedException {
		getDriver().get(landingPageObj.baseUrl);
		Thread.sleep(3000);
		landingPageObj.closedBanner();
		Thread.sleep(2000);
		landingPageObj.clickOn(landingPageObj.signInButton);
		loginPageObj.loginWithMobileEmail(loginPageObj.email,loginPageObj.password);
		Thread.sleep(1000);
		cartPageObj.clickOn(landingPageObj.cartButton);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void bookNameAssertion() throws InterruptedException {
		getDriver().get(landingPageObj.baseUrl);
		Thread.sleep(3000);
		landingPageObj.closedBanner();
		Thread.sleep(2000);
		landingPageObj.clickOn(landingPageObj.signInButton);
		loginPageObj.loginWithMobileEmail(loginPageObj.email,loginPageObj.password);
		Thread.sleep(1000);
		cartPageObj.clickOn(landingPageObj.cartButton);
		Thread.sleep(1000);
		cartPageObj.assertionHard(cartPageObj.bookNameLocator, cartPageObj.bookName);
		
	}
	
	@Test
	public void writerNameAssertion() throws InterruptedException {
		getDriver().get(landingPageObj.baseUrl);
		Thread.sleep(3000);
		landingPageObj.closedBanner();
		Thread.sleep(2000);
		landingPageObj.clickOn(landingPageObj.signInButton);
		loginPageObj.loginWithMobileEmail(loginPageObj.email,loginPageObj.password);
		Thread.sleep(1000);
		cartPageObj.clickOn(landingPageObj.cartButton);
		Thread.sleep(1000);
		cartPageObj.assertionHard(cartPageObj.writerNameLocator, cartPageObj.writerName);
			
	}
	
	@Test
	public void clickOnMinusButton() throws InterruptedException {
		getDriver().get(landingPageObj.baseUrl);
		Thread.sleep(3000);
		landingPageObj.closedBanner();
		Thread.sleep(2000);
		landingPageObj.clickOn(landingPageObj.signInButton);
		loginPageObj.loginWithMobileEmail(loginPageObj.email,loginPageObj.password);
		Thread.sleep(1000);
		cartPageObj.clickOn(landingPageObj.cartButton);
		Thread.sleep(1000);
		//cartPageObj.assertionHard(cartPageObj.bookCountLocator,cartPageObj.bookCountNumberOne);
		cartPageObj.clickOn(cartPageObj.minusButton);
			
	}
	
	@Test
	public void clickOnPlusButton() throws InterruptedException {
		getDriver().get(landingPageObj.baseUrl);
		Thread.sleep(3000);
		landingPageObj.closedBanner();
		Thread.sleep(2000);
		landingPageObj.clickOn(landingPageObj.signInButton);
		loginPageObj.loginWithMobileEmail(loginPageObj.email,loginPageObj.password);
		Thread.sleep(1000);
		cartPageObj.clickOn(landingPageObj.cartButton);
		Thread.sleep(1000);
		cartPageObj.clickOn(cartPageObj.plusButton);
		
		//cartPageObj.assertionHard(cartPageObj.bookCountLocator, cartPageObj.bookCountNumberSecond);
			
	}
	
	@Test
	public void clickOnWishlist() throws InterruptedException {
		getDriver().get(landingPageObj.baseUrl);
		Thread.sleep(3000);
		landingPageObj.closedBanner();
		Thread.sleep(2000);
		landingPageObj.clickOn(landingPageObj.signInButton);
		loginPageObj.loginWithMobileEmail(loginPageObj.email,loginPageObj.password);
		Thread.sleep(1000);
		cartPageObj.clickOn(landingPageObj.cartButton);
		Thread.sleep(2000);
		cartPageObj.clickOn(cartPageObj.wishListButton);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void clickOnCheckBox() throws InterruptedException {
		getDriver().get(landingPageObj.baseUrl);
		Thread.sleep(3000);
		landingPageObj.closedBanner();
		Thread.sleep(2000);
		landingPageObj.clickOn(landingPageObj.signInButton);
		loginPageObj.loginWithMobileEmail(loginPageObj.email,loginPageObj.password);
		Thread.sleep(1000);
		cartPageObj.clickOn(landingPageObj.cartButton);
		Thread.sleep(3000);
		cartPageObj.clickOn(cartPageObj.checkBoxForSelect);
		Thread.sleep(1000);
		
	}
	
	
	@Test
	public void clickOnPlaceOrder() throws InterruptedException {
		getDriver().get(landingPageObj.baseUrl);
		Thread.sleep(3000);
		landingPageObj.closedBanner();
		Thread.sleep(2000);
		landingPageObj.clickOn(landingPageObj.signInButton);
		loginPageObj.loginWithMobileEmail(loginPageObj.email,loginPageObj.password);
		Thread.sleep(1000);
		cartPageObj.clickOn(landingPageObj.cartButton);
		Thread.sleep(3000);
		cartPageObj.clickOn(cartPageObj.placeOrderButton);
		Thread.sleep(4000);
		
	}


}
