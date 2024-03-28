package workingWithTestingProject;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Demo_003 extends BaseClass{
	@Test
	public void validate_bookslink() {
		driver.findElement(By.linkText("Books")).click();
		Reporter.log("USer is able to click on Books",true);
	}
}

