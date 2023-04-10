package pages;

import org.openqa.selenium.By;

public class HumayunBookListingPage extends BasePage {

	public String humayunBookListingPageUrl = "https://www.rokomari.com/book/author/1/humayun-ahmed?ref=mm_p0";
	public String filterSearchString = "সায়েন্স ফিকশন";
	
	public By reSetSortButton = By.xpath("//a[contains(text(),'Reset Sort')]");
	public By reSetFilterButton = By.xpath("//a[contains(text(),'Reset Filter')]");
	public By sortBestSellerLocator = By.xpath("//label[contains(text(),'Best Seller')]");
	public By sortNewReleasedLocator = By.xpath("//label[contains(text(),'New Released')]");
	public By sortPriceLowtoHighLocator = By.xpath("//label[contains(text(),'Price - Low to High')]");
	public By sortPriceHightoLowLocator = By.xpath("//label[contains(text(),'Price - High to Low')]");
	public By sortDiscountLowtoHighLocator = By.xpath("//label[contains(text(),'Discount - Low to High')]");
	public By sortDiscountHightoLow = By.xpath("//label[contains(text(),'Discount - High to Low')]");
	public By filterSamakalinaUpanyasa = By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
	public By filterUpanyasaSamagra = By.xpath("//label[contains(text(),'উপন্যাস সমগ্র')]");
	public By filterRacanaSankalanaOSamagra = By.xpath("//label[contains(text(),'রচনা সংকলন ও সমগ্র')]");
	public By filterRomantikaUpanyasa = By.xpath("//label[contains(text(),'রোমান্টিক উপন্যাস')]");
	public By hoverLocator = By.xpath("//body/div[6]/div[1]/div[1]/div[1]/section[2]/div[2]/div[1]/div[1]/div[1]");
	public By addToCartButton = By.xpath("//button[@product-id='1333']");
	public By paginationLocator = By.xpath("//body/div[7]/div[1]/div[1]/div[1]/section[2]/div[3]");
	public By paginationNextButton = By.xpath("//a[contains(text(),'Next')]");
	public By paginationPage2Locator = By.xpath("//a[contains(text(),'Next')]");
	public By paginationPreviousButton = By.xpath("//a[contains(text(),'Previous')]");
	public By bannerCloseLocatorBy = By.xpath("//body/div[@id='js--entry-popup']/div[1]/button[1]/i[1]");
	public By ebookCheckBoxBy = By.xpath("//label[contains(text(),'eBook')]");
	public By inStock = By.xpath("//label[contains(text(),'In Stock')]");
	public By filterScienceBy =By.xpath("//label[contains(text(),'সায়েন্স ফিকশন')]");
	public By searchBoxBy = By.xpath("//body/div[6]/div[1]/div[1]/section[1]/form[1]/div[4]/div[2]/div[1]/div[1]/div[1]/input[1]");
	public By publisherName = By.xpath("//label[contains(text(),'কাকলী প্রকাশনী')]");
	public By languageLocator = By.xpath("//body/div[6]/div[1]/div[1]/section[1]/form[1]/div[4]/div[2]/div[4]/div[2]/div[2]/label[1]");
	public By ratingLocator = By.xpath("//body/div[6]/div[1]/div[1]/section[1]/form[1]/div[4]/div[2]/div[6]/div[2]/div[2]/label[1]");
	
}
