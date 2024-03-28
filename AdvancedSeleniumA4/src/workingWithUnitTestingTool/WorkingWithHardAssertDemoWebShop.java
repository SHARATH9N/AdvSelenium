package workingWithUnitTestingTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithHardAssertDemoWebShop {
	@Test
	public void login() throws InterruptedException {
		String expectedURl="https://demowebshop.tricentis.com/";
		String expectedBooksURL = "https://demowebshop.tricentis.com/books";
		
		WebDriver driver = new ChromeDriver();
		Reporter.log("USer is able to open Empty Browser",true);
		driver.manage().window().maximize();
		Reporter.log("USer is able to maximize the Browser",true);
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("USer is able to open DemoWebShop website",true);
	
		
		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertEquals(actualURL, expectedURl);
		
		driver.findElement(By.linkText("Books")).click();
		String actualBooksURL = driver.getCurrentUrl();
		System.out.println(actualBooksURL);
		
		Assert.assertEquals(actualBooksURL, expectedBooksURL);
		Thread.sleep(3000);
		
		
		
		
		
		driver.quit();
	}
}
