package workingWithUnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingWithTimeout {
	@Test(timeOut = 3000) 		//It should get executed within the specified time else we get ThreadTimeOutException
	
	public void payment() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phonepe.com/");
		Thread.sleep(3000);
//		System.out.println(driver.getTitle());
		driver.quit();
}
}
