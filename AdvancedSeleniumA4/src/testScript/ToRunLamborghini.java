package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunLamborghini {
	@Test(groups = "car")
	public void p1() throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.lamborghini.com/en-en");
			Thread.sleep(3000);
			driver.quit();
		}
}
