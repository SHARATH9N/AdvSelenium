package workingWithPOM;

import org.testng.annotations.Test;

public class program2 extends BaseClass {

	@Test
	public void searchProduct() throws InterruptedException {
		BasePage basep = new BasePage(driver);
		basep.getSearchBar().sendKeys("simple computer");
		basep.getSearchButton().click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);									//Even though we use the old searchBox reference
		basep.getSearchBar().sendKeys("Health Book");			//We won't get StaleElementReferenceException
		basep.getSearchButton().click();					//Because we're using POM pageFactory.init()
		Thread.sleep(3000);								//which updates the webElement references automatically.
	}																		
	
}
