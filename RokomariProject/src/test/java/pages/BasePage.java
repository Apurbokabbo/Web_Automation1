package pages;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static utilities.BaseDriver.getDriver;

public class BasePage {
	
	

	public WebElement getElement(By locator) {

		return getDriver().findElement(locator);
	}

	public void writeText(By locator, String text) {
		getElement(locator).sendKeys(text);

	}

	public void clickOn(By locator) {
		getElement(locator).click();

	}

	public void hover(By locator) {
		Actions action = new Actions(getDriver());
		action.moveToElement(getElement(locator)).perform();

	}

	public String getText(By locator) {
		return getElement(locator).getText();

	}

	public void assertionHard(By locator, String expectedtext) {
		assertEquals(getText(locator), expectedtext);
	}

	public void alertAccept(By locator) {

		clickOn(locator);
		getDriver().switchTo().alert().accept();

	}

	public void alertReject(By locator) {
		clickOn(locator);
		getDriver().switchTo().alert().dismiss();

	}

	public void alertInput(By locator, String text) {
		clickOn(locator);
		getDriver().switchTo().alert().sendKeys(text);
		alertAccept(locator);

	}

	public void newTab(String url) {
		getDriver().switchTo().newWindow(WindowType.TAB);
		getDriver().get(url);

	}

	public void newWindow(String url) {
		getDriver().switchTo().newWindow(WindowType.WINDOW);
		getDriver().get(url);

	}

	public void navigaterForward() {

		getDriver().navigate().forward();

	}

	public void navigaterBack() {

		getDriver().navigate().back();

	}

	public void navigaterRefresh() {

		getDriver().navigate().refresh();

	}

	public void navigaterTo(String url) {

		getDriver().navigate().to(url);

	}

	public void scrollingDownTillElementfound(By locator) {

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", getElement(locator));

	}

	public void closeBanner(By locator) {
		try {
			clickOn(locator);

		} 
		catch (Exception e) {
			System.out.println("Banner not found!");
		}

	}
	
	public void scrollHorizontally(By locator) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", getElement(locator));
	
	}
	
	public void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,-350)", "");	
	}
	
	public void scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,350)", "");	
	}
	
	public void selectValueFromDropUsingText(By locator , String text) throws InterruptedException {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
		Thread.sleep(1000);
	}

}
