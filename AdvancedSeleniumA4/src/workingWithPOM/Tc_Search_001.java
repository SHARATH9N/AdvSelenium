package workingWithPOM;

import org.testng.annotations.Test;

public class Tc_Search_001 extends BaseClass {

	@Test
	public void searchProduct() throws InterruptedException {
		BasePage baseP = new BasePage(driver);
		baseP.getSearchBar().sendKeys("Simple computer");
		
		baseP.getSearchButton().click();
		
		Thread.sleep(6000);
	}
}
