package workingWithPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class program1 extends BaseClass {
	
	@Test
	public void searchProd() throws InterruptedException {
			
		 WebElement searchBox = driver.findElement(By.id("small-searchterms"));
		 searchBox.sendKeys("simple computer");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		searchBox.sendKeys("books");		//StaleElementReferenceException -bcz the searcBox webElement reference has expired.
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(3000);
	}

}
