package workingWithUnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingWithDependGroups {

	@Test(groups = "mobile")
	public void motorola() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.motorola.in/");
		Thread.sleep(3000);
//		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@Test(groups = "mobile")
	public void samsung() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.samsung.com/in/");
		Thread.sleep(3000);
//		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@Test(groups = "mobile")
	public void nothing() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.nothing.tech/");
		Thread.sleep(3000);
//		System.out.println(driver.getTitle());
		driver.quit();
	}
}
