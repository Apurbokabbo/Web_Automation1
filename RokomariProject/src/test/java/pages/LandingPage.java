package pages;

import org.openqa.selenium.By;

public class LandingPage extends BasePage {
	
	public String baseUrl = "https://www.rokomari.com/book";
	public By writerHover = By.xpath("//a[@id='js--authors']");
	public By cartButton =By.xpath("//*[@id='cart-icon']");
	public By signInButton = By.xpath("//a[contains(text(),'Sign in')]");
	public By humayumLink = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");
	public By bannerCloseButton =By.xpath("//body/div[@id='js--entry-popup']/div[1]/button[1]/i[1]");
	public By seeMoreButtonBy =By.xpath("//header/div[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[3]/div[1]/div[4]/a[1]");
	 
	
	public void closedBanner() throws InterruptedException {
		 Thread.sleep(5000);
		 clickOn(bannerCloseButton);
		 Thread.sleep(2000);
	 }








}


