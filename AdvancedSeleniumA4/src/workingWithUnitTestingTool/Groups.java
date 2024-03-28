package workingWithUnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Groups {
	@Test(groups = "payment"  ,dependsOnGroups = "mobile")
	public void payment() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phonepe.com/");
		Thread.sleep(3000);
//		System.out.println(driver.getTitle());
		driver.quit();
}
}
