package pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage{
	
	public String cartPageUrl ="https://www.rokomari.com/cart";
	public String bookName ="আমাদের শাদা বাড়ি";
	public String writerName="হুমায়ূন আহমেদ";
	public String bookCountNumberOne ="1";
	public String bookCountNumberSecond ="2";
	public String bookPrice ="120";
	public String promoCodeInstrustionText ="Apply Promo Code or Voucher Code on the Shipping Page";
	public String warningMessage = "Please enter a value greater than or equal to 1";
	
	public By checkBoxForSelect = By.xpath("//body/div[@id='cart-page']/div[1]/div[1]/div[1]/section[1]/div[1]/label[1]");
	public By bookNameLocator = By.xpath("//a[contains(text(),'আমাদের শাদা বাড়ি')]");
	public By writerNameLocator=By.xpath("//p[contains(text(),'হুমায়ূন আহমেদ')]");
	public By deleteButton = By.xpath("//body/div[@id='cart-page']/div[1]/div[1]/div[1]/section[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/a[1]/img[1]");
	public By wishListButton =By.xpath("//body/div[@id='cart-page']/div[1]/div[1]/div[1]/section[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/a[2]");
	public By minusButton =By.xpath("//button[@id='btn-minus']");
	public By plusButton =By.xpath("//button[@id='btn-plus']");
	public By bookCountLocator = By.xpath("//input[@id='js--productQuantity-1333']");
	public By bookPriceLocator = By.xpath("//p[contains(text(),'120 Tk.')]");
	public By promoCodeUsedInfoLocator = By.xpath("//body/div[@id='cart-page']/div[1]/div[1]/div[1]/div[2]/p[1]");
	public By orderAsGiftButton = By.xpath("//a[@id='js-continue-to-gift-shipping']");
	public By placeOrderButton = By.xpath("//body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/a[2]/span[1]");
	public By warningMessageMinimunLocator = By.xpath("");
}
