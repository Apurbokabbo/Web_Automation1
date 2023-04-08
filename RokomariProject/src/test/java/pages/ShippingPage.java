package pages;

import org.openqa.selenium.By;


public class ShippingPage extends BasePage{
	
	public String shippingUrl = "https://www.rokomari.com/shipping?isgift=0";
	public String promoWaringMessage ="Please enter your code.";
	public String promoCode = "123456";
	public String promoCodeWrongMessage = "Code 123456 not valid";
	public String alternativePhone = "01533323130";
	public String address = "East Medda , House 345/46 ,Word :2 Brahmambaria Sadar";
	public String phone = "01543424140";
	
	
	
	public By pickupPointHome = By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/p[2]/label[1]");
	public By pickupPointOffice = By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/p[3]/label[1]");
	public By nameInputField = By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/fieldset[1]/input[1]");
	public By alternativePhoneField = By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/fieldset[2]/input[1]");
	public By phoneField = By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/fieldset[1]/input[1]");
	public By cityLocator = By.xpath("//select[@id='js--city']");
	public By cityDropDownValueSelect = By.xpath("//option[contains(text(),'ব্রাহ্মণবাড়িয়া')]");
	public By areaLocator = By.xpath("//select[@id='js--area']");
	public By areaDropDownValueSelect = By.xpath("//option[contains(text(),'ব্রাহ্মণবাড়িয়া সদর')]");
	public By zoneLocator = By.xpath("//select[@id='js--zone']");
	public By zoneDropDownValueSelect = By.xpath("//option[contains(text(),'ব্রাহ্মণবাড়িয়া পৌরসভা')]");
	public By addressField = By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/fieldset[2]/textarea[1]");
	public By paymentCashonDelivery = By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]");
	public By paymentNagad = By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/label[1]");
	public By paymentBkash = By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[3]/label[1]");
	public By paymentRocket = By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[4]/label[1]");
	public By paymentVisa = By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[5]/label[1]/img[1]");
	public By confirmOrder = By.xpath("//span[contains(text(),'Confirm Order')]");
	public By conditionCheckbox = By.xpath("//label[contains(text(),'এই শর্তগুলো মেনে অর্ডার প্রদান করছি।')]");
	public By giftWrapCheckBox = By.xpath("//label[contains(text(),'Gift Wrap for Tk. 20')]");
	public By promoCodeField = By.xpath("//input[@id='js--coupon-field']");
	public By profileLocator = By.xpath("//a[@id='dropdownMenu2']");
	public By signOutLocator = By.xpath("//a[contains(text(),'Sign Out')]");
	public By shippingInfoToolTip = By.xpath("//i[@id='js--charge-info-tooltip']");
	public By promoCodeApplyButton = By.xpath("//button[@id='js-coupon-btn']");
	public By bannerCloseButton = By.xpath("//body/div[@id='js--notification-permission-modal']/button[@id='js--notification-btn-close']/img[1]");
	
	
	

}
