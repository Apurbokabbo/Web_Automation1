package testcases;

import org.testng.annotations.Test;
import pages.HumayunBookListingPage;
import utilities.BaseDriver;

public class HumayunBookListingPageTestCase extends BaseDriver {

	
	HumayunBookListingPage humayunObj = new HumayunBookListingPage();

	@Test
	public void visitPage() throws InterruptedException {

		getDriver().get(humayunObj.humayunBookListingPageUrl);
		Thread.sleep(2000);
		humayunObj.closeBanner(humayunObj.bannerCloseLocatorBy);
		Thread.sleep(2000);

	}
	
	@Test
	public void bookAddtoCart() throws InterruptedException {

		getDriver().get(humayunObj.humayunBookListingPageUrl);
		Thread.sleep(2000);
		humayunObj.closeBanner(humayunObj.bannerCloseLocatorBy);
		Thread.sleep(1000);
		humayunObj.hover(humayunObj.hoverLocator);
		Thread.sleep(3000);
		humayunObj.clickOn(humayunObj.addToCartButton);
		Thread.sleep(2000);

	}

	@Test
	public void sortBestSeller() throws InterruptedException {
		getDriver().get(humayunObj.humayunBookListingPageUrl);
		Thread.sleep(2000);
		humayunObj.closeBanner(humayunObj.bannerCloseLocatorBy);
		Thread.sleep(2000);
		humayunObj.clickOn(humayunObj.sortBestSellerLocator);
		Thread.sleep(2000);

	}

	@Test
	public void sortPriceHightoLow() throws InterruptedException {
		getDriver().get(humayunObj.humayunBookListingPageUrl);
		Thread.sleep(2000);
		humayunObj.closeBanner(humayunObj.bannerCloseLocatorBy);
		Thread.sleep(2000);
		humayunObj.clickOn(humayunObj.sortPriceHightoLowLocator);
		Thread.sleep(2000);

	}

	@Test
	public void resetSort() throws InterruptedException {
		getDriver().get(humayunObj.humayunBookListingPageUrl);
		Thread.sleep(2000);
		humayunObj.closeBanner(humayunObj.bannerCloseLocatorBy);
		Thread.sleep(2000);
		humayunObj.clickOn(humayunObj.sortNewReleasedLocator);
		Thread.sleep(2000);
		humayunObj.clickOn(humayunObj.reSetSortButton);
		Thread.sleep(2000);

	}

	@Test
	public void eBookSelect() throws InterruptedException {
		getDriver().get(humayunObj.humayunBookListingPageUrl);
		Thread.sleep(2000);
		humayunObj.closeBanner(humayunObj.bannerCloseLocatorBy);
		Thread.sleep(2000);
		humayunObj.clickOn(humayunObj.ebookCheckBoxBy);
		Thread.sleep(2000);

	}

	@Test
	public void inStockSelect() throws InterruptedException {
		getDriver().get(humayunObj.humayunBookListingPageUrl);
		Thread.sleep(2000);
		humayunObj.closeBanner(humayunObj.bannerCloseLocatorBy);
		Thread.sleep(2000);
		humayunObj.clickOn(humayunObj.inStock);
		Thread.sleep(2000);

	}

	@Test
	public void filtering() throws InterruptedException {
		getDriver().get(humayunObj.humayunBookListingPageUrl);
		Thread.sleep(2000);
		humayunObj.closeBanner(humayunObj.bannerCloseLocatorBy);
		Thread.sleep(2000);
		humayunObj.clickOn(humayunObj.filterRacanaSankalanaOSamagra);
		Thread.sleep(2000);

	}

	@Test
	public void filtering2() throws InterruptedException {
		getDriver().get(humayunObj.humayunBookListingPageUrl);
		Thread.sleep(2000);
		humayunObj.closeBanner(humayunObj.bannerCloseLocatorBy);
		Thread.sleep(2000);
		humayunObj.clickOn(humayunObj.filterSamakalinaUpanyasa);
		Thread.sleep(2000);

	}

	@Test
	public void filteringMultiple() throws InterruptedException {
		getDriver().get(humayunObj.humayunBookListingPageUrl);
		Thread.sleep(2000);
		humayunObj.closeBanner(humayunObj.bannerCloseLocatorBy);
		Thread.sleep(2000);
		humayunObj.clickOn(humayunObj.filterRacanaSankalanaOSamagra);
		Thread.sleep(2000);
		humayunObj.scrolldown();
		humayunObj.clickOn(humayunObj.filterRomantikaUpanyasa);

	}

	@Test
	public void filteringReset() throws InterruptedException {
		getDriver().get(humayunObj.humayunBookListingPageUrl);
		Thread.sleep(2000);
		humayunObj.closeBanner(humayunObj.bannerCloseLocatorBy);
		Thread.sleep(2000);
		humayunObj.clickOn(humayunObj.filterRacanaSankalanaOSamagra);
		Thread.sleep(2000);
		humayunObj.scrolldown();
		humayunObj.clickOn(humayunObj.filterRomantikaUpanyasa);
		Thread.sleep(2000);
		humayunObj.clickOn(humayunObj.reSetFilterButton);
		Thread.sleep(2000);

	}

	@Test
	public void filterSearch() throws InterruptedException {
		getDriver().get(humayunObj.humayunBookListingPageUrl);
		Thread.sleep(2000);
		humayunObj.closeBanner(humayunObj.bannerCloseLocatorBy);
		Thread.sleep(2000);
		humayunObj.writeText(humayunObj.searchBoxBy,humayunObj.filterSearchString);
		Thread.sleep(2000);
		humayunObj.clickOn(humayunObj.filterScienceBy);
		Thread.sleep(2000);

	}
	
	@Test
	public void selectPublisher() throws InterruptedException {
		getDriver().get(humayunObj.humayunBookListingPageUrl);
		Thread.sleep(2000);
		humayunObj.closeBanner(humayunObj.bannerCloseLocatorBy);
		Thread.sleep(2000);
		humayunObj.scrollingDownTillElementfound(humayunObj.publisherName);
		Thread.sleep(2000);
		humayunObj.scrollUp();
		Thread.sleep(2000);
		humayunObj.clickOn(humayunObj.publisherName);
		Thread.sleep(2000);

	}
	
	@Test
	public void languageSelect() throws InterruptedException {
		getDriver().get(humayunObj.humayunBookListingPageUrl);
		Thread.sleep(2000);
		humayunObj.closeBanner(humayunObj.bannerCloseLocatorBy);
		Thread.sleep(2000);
		humayunObj.scrollingDownTillElementfound(humayunObj.languageLocator);
		Thread.sleep(2000);
		humayunObj.scrollUp();
		Thread.sleep(2000);
		humayunObj.clickOn(humayunObj.languageLocator);
		Thread.sleep(2000);

	}
	
	@Test
	public void ratingSelection() throws InterruptedException {
		getDriver().get(humayunObj.humayunBookListingPageUrl);
		Thread.sleep(2000);
		humayunObj.closeBanner(humayunObj.bannerCloseLocatorBy);
		Thread.sleep(2000);
		humayunObj.scrollingDownTillElementfound(humayunObj.ratingLocator);
		Thread.sleep(2000);
		humayunObj.scrollUp();
		Thread.sleep(2000);
		humayunObj.clickOn(humayunObj.ratingLocator);
		Thread.sleep(2000);

	}


	@Test
	public void scrollDownTOPagination() throws InterruptedException {
		getDriver().get(humayunObj.humayunBookListingPageUrl);
		Thread.sleep(2000);
		humayunObj.closeBanner(humayunObj.bannerCloseLocatorBy);
		Thread.sleep(2000);
		humayunObj.scrollingDownTillElementfound(humayunObj.paginationNextButton);
		Thread.sleep(2000);
		humayunObj.scrollUp();
		Thread.sleep(2000);
	}

	@Test
	public void paginationNextPage() throws InterruptedException {
		getDriver().get(humayunObj.humayunBookListingPageUrl);
		Thread.sleep(2000);
		humayunObj.closeBanner(humayunObj.bannerCloseLocatorBy);
		Thread.sleep(2000);
		humayunObj.scrollingDownTillElementfound(humayunObj.paginationNextButton);
		Thread.sleep(2000);
		humayunObj.scrollUp();
		Thread.sleep(2000);
		humayunObj.clickOn(humayunObj.paginationNextButton);
	}

	@Test
	public void paginationPreviousPage() throws InterruptedException {
		getDriver().get(humayunObj.humayunBookListingPageUrl);
		Thread.sleep(2000);
		humayunObj.closeBanner(humayunObj.bannerCloseLocatorBy);
		Thread.sleep(2000);
		humayunObj.scrollingDownTillElementfound(humayunObj.paginationNextButton);
		Thread.sleep(2000);
		humayunObj.scrollUp();
		Thread.sleep(2000);
		humayunObj.clickOn(humayunObj.paginationNextButton);
		Thread.sleep(2000);
		humayunObj.scrollingDownTillElementfound(humayunObj.paginationNextButton);
		Thread.sleep(2000);
		humayunObj.clickOn(humayunObj.paginationPreviousButton);
		Thread.sleep(2000);
	}

}
