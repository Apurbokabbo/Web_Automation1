package pages;

import org.openqa.selenium.By;

public class LandingPage extends BasePage {
	
	public String baseUrl = "https://www.rokomari.com/book";
	public By writerHover = By.xpath("//a[@id='js--authors']");
	public By cartButton =By.xpath("//*[@id='cart-icon']");
	public By signInButton = By.xpath("//a[contains(text(),'Sign in')]");
	public By humayumLink = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");

}
