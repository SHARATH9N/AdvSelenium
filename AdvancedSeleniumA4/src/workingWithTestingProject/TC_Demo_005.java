package workingWithTestingProject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Demo_005 extends BaseClass {
	@Test
	public void validate_Wishlist() throws InterruptedException {
		WebElement link = driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
		Reporter.log("USer is able to mouseHover on Electronics",true);
		
		Actions a = new Actions(driver);
		Thread.sleep(6000);
		
		a.moveToElement(link).perform();
		driver.findElement(By.linkText("Cell phones")).click();
		Thread.sleep(3000);
		Reporter.log("User is able to click on Cell phones",true);
		
		
		
		
	}
}
