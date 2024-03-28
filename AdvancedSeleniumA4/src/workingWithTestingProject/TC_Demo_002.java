package workingWithTestingProject;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Demo_002 extends BaseClass {

	@Test
	public void validate_Cart() {
		driver.findElement(By.linkText("Shopping cart")).click();
		Reporter.log("USer is able to click on Shopping Cart",true);
	}
}
