package workingWithUnitTestingTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WorkingWithSoftAssertBMW {
	@Test
	public void login() throws InterruptedException {
		String expectedURl="https://www.bmw.in/en/index.html";
		String expectedModelsURL = "https://www.bmw.in/en/all-models.html";
		SoftAssert sf = new SoftAssert();
		
		WebDriver driver = new ChromeDriver();
		Reporter.log("USer is able to open Empty Browser",true);
		driver.manage().window().maximize();
		Reporter.log("USer is able to maximize the Browser",true);
		driver.get("https://www.bmw.in/en/index.html");
		Reporter.log("USer is able to open BMW website",true);
	
		
		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		sf.assertEquals(actualURL, expectedURl);
		
		driver.findElement(By.xpath("//span[text()='Models']")).click();
		String actualModelsURL = driver.getCurrentUrl();
		System.out.println(actualModelsURL);
		
		sf.assertEquals(actualModelsURL, expectedModelsURL);
		Thread.sleep(3000);
		
		driver.quit();
		sf.assertAll();
	}
}
