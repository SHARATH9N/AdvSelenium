package workingWithTestingProject;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Demo_001 extends BaseClass {
	@Test
	public void validate_Wishlist() {
		driver.findElement(By.linkText("Wishlist")).click();
		Reporter.log("USer is able to click on Wishlist",true);
	}

}
